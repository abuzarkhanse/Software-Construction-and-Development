import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble(); // Take input from user
        double kilometers = meters / 1000; // Conversion factor
        System.out.println(meters + " meters is equal to " + kilometers + " kilometers");
        scanner.close();
    }
}
