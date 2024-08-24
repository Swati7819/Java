import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, temp, lastDigit, reverse = 0;
        System.out.println(
                "This application takes a valid number as an input and checks whether the number is a palindrome or not !");
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        if (number < 0) {
            System.out.println(number + " is not a palindrome !");
        }

        else {
            temp = number;

            while (temp != 0) {
                lastDigit = temp % 10;
                reverse = reverse * 10 + lastDigit;
                temp = temp / 10;

            }

            if (number == reverse) {
                System.out.println(number + " is a palindrome");
            } else {
                System.out.println(number + " is not a palindrome");
            }
        }

        sc.close();

    }

}
