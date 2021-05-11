package Menus;

import Functions.RatingFunctions;

import static Functions.MovieFunctions.showAllMovies;
import static main.Main.sc;
import static main.Read.readInt;
import static main.Read.readLong;

public class RatingMenu {

    public static void ratingMenu() {

        boolean loop = true;

        while (loop) {

            System.out.println("\n--|| Rating menu ||--");
        System.out.println("[1] - Add rating");
//        System.out.println("[2] - Change rating");
//        System.out.println("[3] - Delete rating");
//        System.out.println("[4] - Show all ratings");
//        System.out.println("[0] - Return to main");

            System.out.print("\nMake a choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                addRating();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        }
    }

    private static void addRating() {

        showAllMovies();
        System.out.print("Movie Id to Rate: ");
        Long movieId = readLong();

        System.out.print("How do you Rate this Movie (1-10): ");
        int movieRating = readInt();

        if (movieRating < 1 || movieRating > 10) {
            System.out.println("Wrong input!");

        } else {
            RatingFunctions.addRating(movieId, movieRating);
        }

    }

}