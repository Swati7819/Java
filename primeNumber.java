import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, flag = 1;
        System.out.println("This application checks for the prime number !!");
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number ");
        } else if (number == 2) {
            System.out.println(number + " is a prime number");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(number + " is not a prime number");
            } else {
                System.out.println(number + " is a prime number");
            }
        }
        sc.close();

    }

}

// The loop runs until i <= Math.sqrt(number) because a number cannot have any
// divisors greater than its square root (except for itself).