import java.util.Scanner;

public class percentCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark1, mark2, mark3, mark4, mark5, totalMark = 0;
         float allTotal, obtainedMark, percent;
        System.out.println("This application calculates the total percentage of the student based on the marks obtained in 5 subjects ! ");
        System.out.println("Enter total marks of one subject: ");
        totalMark = sc.nextInt();
        allTotal = totalMark * 5;
        System.out.println("Enter the marks obtained in subject 1: ");
        mark1 = sc.nextInt();
        System.out.println("Enter the marks obtained in subject 2: ");
        mark2 = sc.nextInt();
        System.out.println("Enter the marks obtained in subject 3: ");
        mark3 = sc.nextInt();
        System.out.println("Enter the marks obtained in subject 4: ");
        mark4 = sc.nextInt();
        System.out.println("Enter the marks obtained in subject 5: ");
        mark5 = sc.nextInt();

        obtainedMark = mark1+mark2+mark3+mark4+mark5;

        percent = (obtainedMark/ allTotal)*100;

        System.out.println("The total percentage obtained is : "+percent);

        sc.close();

    }
}