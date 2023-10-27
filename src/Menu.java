import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {

            System.out.println("Welcome to Advent of Code 2022!\n" +
                                "1. Choose specific day\n" +
                                "X. Exit");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    break;
                case "X":
                    System.out.println("Bye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public void specificDay(String day) {

        System.out.println("Enter which days answer you want displayed or return with R!\n" +
                            "Enter:");

        Scanner scanner = new Scanner(System.in);

    }
}
