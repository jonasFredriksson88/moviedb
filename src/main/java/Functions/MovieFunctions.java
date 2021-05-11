package Functions;

import dao.MovieDao;
import models.Movie;

public class MovieFunctions {

    static MovieDao movieDao = new MovieDao();

    public static void createNewMovie(String movieTitle, Long movieDuration, int releaseYear) {
        Movie movie = new Movie(movieTitle, movieDuration, releaseYear);

        movieDao.createNewMovie(movie);
    }

    public static void showAllMovies() {

        movieDao.showAllMovies();

    }

    public static void deleteMovie(Long id) {
        movieDao.deleteMovie(id);
    }

    public static void changeMovieTitle(Long id, String title) {
        movieDao.changeMovieTitle(id,title);
    }
}