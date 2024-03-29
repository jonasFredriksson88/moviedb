package models;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity

  @NamedQueries({
  @NamedQuery(name ="Actor.findAll", query = "SELECT a FROM Actor a"),
  @NamedQuery(name ="Actor.findById", query = "SELECT a FROM Actor a WHERE a.id=:id"),
  @NamedQuery(name ="Actor.findByName", query = "SELECT a FROM Actor a WHERE a.name=:name"),
  @NamedQuery(name ="Actor.findByAge", query = "SELECT a FROM Actor a WHERE a.age=:age")
  })

public class Actor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public Actor() {
    }

    public Actor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Basic
    private String name;

    @Basic
    private int age;

    @Basic
    private String gender;

    @ManyToMany(targetEntity = Movie.class, cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private List<Movie> movies = new ArrayList<>();

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Movie> getMovies() {
        return this.movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }
    public void removeMovie(Movie movie){
        this.movies.remove(movie);
    }

    @Override
    public String toString() {
        return "\nid=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender;
    }
}