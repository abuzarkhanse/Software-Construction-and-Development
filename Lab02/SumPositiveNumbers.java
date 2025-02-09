import java.util.Scanner;

class SumPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, input;
        do {
            System.out.print("Enter a positive integer (negative to stop): ");
            input = scanner.nextInt();
            if (input >= 0) {
                sum += input;
            }
        } while (input >= 0);
        System.out.println("Sum of entered positive numbers: " + sum);
        scanner.close();
    }
}