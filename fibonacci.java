import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1 = 0, n2 = 1, n3;
        System.out.println("This program generates the fibonacci series upto n terms !");
        System.out.println("Enter the number n : ");
        n = sc.nextInt();
        System.out.print(n1 + " " + n2 + " ");
        while (n-2 != 0) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            n--;

        }
        sc.close();
    }
}