package models;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * @author Jonas
 */
@Entity

@NamedQueries({
        @NamedQuery(name = "MovieRating.findAll", query = "SELECT r FROM MovieRating r"),
        @NamedQuery(name = "MovieRating.findById", query = "SELECT r FROM MovieRating r WHERE r.id=:id"),
        @NamedQuery(name = "MovieRating.findByRating", query = "SELECT r FROM MovieRating r WHERE r.rating=:rating"),
        @NamedQuery(name = "MovieRating.findAverageRating", query = "SELECT AVG(r.rating) FROM MovieRating  r")
})

public class MovieRating {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    private int rating;

    @ManyToOne(targetEntity = Movie.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Movie movie;

    public MovieRating() {
    }

    public MovieRating(int rating) {
        this.rating = rating;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "rating=" + rating;
    }


}