class SumEvenNumbers {
    public static void main(String[] args) {
        int sumEven = 0, i = 2;
        while (i <= 50) {
            sumEven += i;
            i += 2;
        }
        System.out.println("Sum of even numbers from 1 to 50: " + sumEven);
    }
}