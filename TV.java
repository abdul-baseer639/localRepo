import java.util.*;

enum Television {
    ON, OFF;

    // Switch ON → OFF and OFF → ON
    public Television toggle() {
        return this == ON ? OFF : ON;
    }
}

public class TV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Television currentTV = Television.OFF;
        int choice;

        System.out.println("Television Control System");

        while (true) {
            System.out.println("\nCurrent State: " + currentTV);
            System.out.println("1. Toggle Power");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                currentTV = currentTV.toggle();
            } else if (choice == 2) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
