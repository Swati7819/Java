import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Description: This application is used to find the factorial of a number ! ");
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int fact =1;
        for(int i=num; i>=1;i--)
        {
            fact = fact*i;
        }

        System.out.println("The factorial of "+ num+" is: "+fact);
        sc.close();
        
    }
    
}
