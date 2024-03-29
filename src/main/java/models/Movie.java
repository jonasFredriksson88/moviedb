package models;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity

@NamedQueries({
        @NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m"),
        @NamedQuery(name = "Movie.findById", query = "SELECT m FROM Movie m WHERE m.id=:id"),
        @NamedQuery(name = "Movie.findByTitle", query = "SELECT m FROM Movie m WHERE m.title=:title"),
        @NamedQuery(name = "Movie.findByDuration", query = "SELECT m FROM Movie m WHERE m.duration=:duration"),
        @NamedQuery(name = "Movie.findByYear", query = "SELECT m FROM Movie m WHERE m.releaseYear=:releaseYear")
})

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    private String title;

    @Basic
    private long duration;

    @Basic
    private int releaseYear;

    @ManyToOne(targetEntity = Director.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Director director;

    @OneToMany(targetEntity = MovieRating.class, mappedBy = "movie", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<MovieRating> movieRatings = new ArrayList<>();

    @ManyToMany(targetEntity = Actor.class, mappedBy = "movies", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Actor> actors = new ArrayList<>();

    @ManyToMany(targetEntity = MovieGenre.class, mappedBy = "movies", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<MovieGenre> movieGenres = new ArrayList<>();

    public Movie() {
    }

    public Movie(String title, long duration, int releaseYear) {
        this.title = title;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

    public Movie(String title, long duration, int releaseYear, Director director) {
        this.title = title;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getDuration() {
        return this.duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<MovieRating> getMovieRatings() {
        return this.movieRatings;
    }

    public void setMovieRatings(List<MovieRating> movieRatings) {
        this.movieRatings = movieRatings;
    }

    public List<Actor> getActors() {
        return this.actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public void addActor(Actor actor) {
        this.actors.add(actor);
    }

    public List<MovieGenre> getMovieGenres() {
        return this.movieGenres;
    }

    public void setMovieGenres(List<MovieGenre> movieGenres) {
        this.movieGenres = movieGenres;
    }

    public void addMovieGenre(MovieGenre genre) {
        this.movieGenres.add(genre);
        genre.addMovie(this);
    }

    public void removeMovieGenre(MovieGenre genre) {
        this.movieGenres.remove(genre);
        genre.removeMovie(this);
    }

    public String averageMovieRating() {
        int ratings = 0;

        DecimalFormat df = new DecimalFormat("###.#");

        for (MovieRating movieRating : movieRatings) {
            ratings += movieRating.getRating();
        }
        if (ratings != 0)
            return df.format(((double) ratings / (double) movieRatings.size()));
        else
            return "Still no rating";
    }

    @Override
    public String toString() {

            return "\nid: " + id + "\ntitle: " + title + "\nduration: " + duration + "\nreleaseYear: " + releaseYear + "\ndirector: " + director + "\navg rating: " + averageMovieRating() + "\nactors: " + actors + "\nGenres: " + movieGenres;

    }


}
