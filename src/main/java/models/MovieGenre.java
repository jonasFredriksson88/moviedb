package models;

import utility.Genres;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/**
 * @author Jonas
 */
@Entity

@NamedQueries({
        @NamedQuery(name = "MovieGenre.findAll", query = "SELECT g FROM MovieGenre g"),
        @NamedQuery(name = "MovieGenre.findById", query = "SELECT g FROM MovieGenre g WHERE g.id=:id"),
        @NamedQuery(name = "MovieGenre.findByGenre", query = "SELECT g FROM MovieGenre g WHERE g.genre=:genre")
})

public class MovieGenre {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private Genres genre;

    @ManyToMany(targetEntity = Movie.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Movie> movies = new ArrayList<>();

    public MovieGenre() {
    }

    public MovieGenre(Genres genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieGenre that = (MovieGenre) o;
        return genre == that.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(genre);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public List<Movie> getMovies() {
        return this.movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        this.movies.remove(movie);
    }

    @Override
    public String toString() {

        return genre.toString();

    }


}