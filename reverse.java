import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverse = 0, lastDigit = 0;
        System.out.println("This program reverses a given number !");
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        while (num != 0) {
            lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }

        System.out.println("The reverse of " + temp + " is : " + reverse);

        sc.close();

    }
}
