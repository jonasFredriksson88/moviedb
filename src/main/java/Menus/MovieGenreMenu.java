package Menus;

import static main.Main.sc;

public class MovieGenreMenu {
    public static void genreMenu() {
        boolean loop = true;
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
                loop = false;
                break;
            default:
                System.out.println("Wrong input!");
        }

    }
}