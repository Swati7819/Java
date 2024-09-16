import java.util.*;

public class neonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This applications test for a neon number !");
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int square = number * number;
        int sum = 0, lastDigit = 0;

        while (square != 0) {
            lastDigit = square % 10;
            sum = sum + lastDigit;
            square = square / 10;
        }

        if (sum == number) {
            System.out.println(number + " is a neon number !");
        } else {
            System.out.println(number + " is not a neon number !");
        }

        sc.close();

    }

}
