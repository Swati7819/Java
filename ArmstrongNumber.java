import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This application takes a number as input and tell if this is armstrong number or not !");
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        // storing number in temp
        int temp = number;
        // counting number of digit in number
        int digits = 0, lastDigit = 0, sum = 0;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        // armstrong logic
        temp = number;

        while (temp != 0) {
            lastDigit = temp % 10;
            sum = sum + (int) Math.pow(lastDigit, digits);
            temp = temp / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an armstrong number !");
        } else {
            System.out.println(number + " is not an armstrong number !");
        }

        sc.close();
    }

}