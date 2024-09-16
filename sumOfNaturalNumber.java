import java.util.*;
public class sumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This application takes n as user input where n is the number of terms of numbers. Then gives the sum of n natural numbers. ");
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        int sum =0;
        for(int i =1;i<=n;i++)
        {
            sum=sum+i;
        }

        System.out.println("The sum of "+n+" natural numbers is : "+sum);
        sc.close();

    }
    
}
