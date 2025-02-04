import java.util.Scanner;

public class MenuExampleInDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Option A");
            System.out.println("2. Option B");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
        } while (choice != 3); // Condition checked after execution

        System.out.println("Exiting program...");
        scanner.close();
    }
}
