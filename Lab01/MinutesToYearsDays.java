import java.util.Scanner;

public class MinutesToYearsDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total minutes: ");
        int minutes = scanner.nextInt(); // Take input from user
        int years = minutes / (60 * 24 * 365); // Calculate years
        int remainingMinutes = minutes % (60 * 24 * 365); // Remaining minutes after years
        int days = remainingMinutes / (60 * 24); // Calculate days
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
        scanner.close();
    }
}