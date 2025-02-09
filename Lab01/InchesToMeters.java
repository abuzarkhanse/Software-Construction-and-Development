import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in inches: ");
        double inches = scanner.nextDouble(); // Take input from user
        double meters = inches * 0.0254; // Conversion factor
        System.out.println(inches + " inches is equal to " + meters + " meters");
        scanner.close();
    }
}
