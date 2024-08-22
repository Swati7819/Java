import java.util.Scanner;
public class OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max;
        System.out.println("This application finds all the odd number between the range of [min, max] !");
        System.out.print("Enter the minimum point: ");
        min = sc.nextInt();
        System.out.print("Enter the maximum point: ");
        max = sc.nextInt();

        for(int i =min; i<=max; i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
        
    }
    
}
