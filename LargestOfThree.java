import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This application takes three number as input and returns the largest among them !");
        int num1, num2, num3;
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        System.out.println("Enter third number: ");
        num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All three numbers are same !");

        } else if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the largest !");
            } else {
                System.out.println(num3 + " is the largest !");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is the largest !");
            } else {
                System.out.println(num3 + " is the largest !");
            }
        }

        sc.close();

    }

}
