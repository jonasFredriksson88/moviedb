package Menus;

import Functions.MovieFunctions;
import main.Main;

import static main.Main.*;
import static main.Read.*;

public class MovieMenu {

    static boolean loopSubMenus = true;



    public static void movieMenu() {
        System.out.println("\n--|| Movie menu ||--");
        System.out.println("[1] - Add new movie");
//        System.out.println("[2] - Add existing actor");
//        System.out.println("[3] - Add existing director");
//        System.out.println("[4] - Add genre");
        System.out.println("[5] - Change movie title");
//        System.out.println("[6] - Change actor");
//        System.out.println("[7] - Change director");
        System.out.println("[8] - Delete movie");
//        System.out.println("[9] - Remove actor from movie");
//        System.out.println("[10] - Remove director from movie");
//        System.out.println("[11] - Remove genre from movie");
        System.out.println("[12] - Show all movies");
        System.out.println("[0] - Return to main");

        System.out.print("\nMake a choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                addNewMovie();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                showAllMovies();

                changeMovieTitle();
                break;
            case 6:

                break;
            case 7:

                break;
            case 8:
                showAllMovies();

                deleteMovie();
                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:
                showAllMovies();
                break;
            case 0:
                loopSubMenus = false;
                break;
            default:
                System.out.println("Wrong input!");
        }
    }

    private static void showAllMovies() {
        MovieFunctions.showAllMovies();
        System.out.println();
    }

    private static void deleteMovie() {
        System.out.println("Movie id: ");
        Long movieId = readLong();
        MovieFunctions.deleteMovie(movieId);
    }

    private static void changeMovieTitle() {
        System.out.println("Movie id: ");
        Long movieId = readLong();

        System.out.println("New title: ");
        String newMovieTitle = readLine();

        MovieFunctions.changeMovieTitle(movieId,newMovieTitle);
    }

    private static void addNewMovie() {
        System.out.println("Movie title: ");
        String movieTitle = readLine();
        System.out.println("Duration: ");
        Long movieDuration = readLong();
        System.out.println("Release year: ");
        int releaseYear = readInt();

        MovieFunctions.createNewMovie(movieTitle, movieDuration, releaseYear);
    }

    private static void actorMenu() {
        System.out.println("\n--|| Actor menu ||--");
//        System.out.println("[1] - Add actor");
//        System.out.println("[2] - Change name");
//        System.out.println("[3] - Change age");
//        System.out.println("[4] - Change gender");
//        System.out.println("[5] - Delete actor");
//        System.out.println("[6] - Show all actors");
//        System.out.println("[0] - Return to main");

        System.out.print("\nMake a choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 0:
                loopSubMenus = false;
                break;
            default:
                System.out.println("Wrong input!");
        }
    }

    private static void directorMenu() {
        System.out.println("\n--|| Director menu ||--");
//        System.out.println("[1] - Add director");
//        System.out.println("[2] - Change name");
//        System.out.println("[3] - Change age");
//        System.out.println("[4] - Change gender");
//        System.out.println("[5] - Delete director");
//        System.out.println("[6] - Show all directors");
//        System.out.println("[0] - Return to main");

        System.out.print("\nMake a choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 0:
                loopSubMenus = false;
                break;
            default:
                System.out.println("Wrong input!");
        }
    }

    private static void ratingMenu() {
        System.out.println("\n--|| Rating menu ||--");
//        System.out.println("[1] - Add rating");
//        System.out.println("[2] - Change rating");
//        System.out.println("[3] - Delete rating");
//        System.out.println("[4] - Show all ratings");
//        System.out.println("[0] - Return to main");

        System.out.print("\nMake a choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 0:
                loopSubMenus = false;
                break;
            default:
                System.out.println("Wrong input!");
        }
    }

    private static void genreMenu() {
        System.out.println("\n--|| Genre menu ||--");
//        System.out.println("[1] - Add genre");
//        System.out.println("[2] - Change genre");
//        System.out.println("[3] - Delete genre");
//        System.out.println("[4] - Show all genres");
//        System.out.println("[0] - Return to main");

        System.out.print("\nMake a choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 0:
                loopSubMenus = false;
                break;
            default:
                System.out.println("Wrong input!");
        }

    }
}