import java.util.Scanner;

public class neonNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This application tests for neon numbers in a given range!");
        System.out.println("Enter the lower limit: ");
        int lowerLimit = sc.nextInt();
        System.out.println("Enter the upper limit: ");
        int upperLimit = sc.nextInt();

        System.out.println("Neon numbers in the given range:");
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isNeonNumber(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;

        // Calculate sum of digits of the square
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }

        // If the sum equals the original number, it is a neon number
        return sum == number;
    }
}
