import java.util.*;

public class atmProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 1000000, depositAmount, withdrawAmount, flag = 1;
        do {
            System.out.println("This is an ATM application which performs the following operations!");
            System.out.println("1.Withdraw the money !");
            System.out.println("2.Deposit the money !");
            System.out.println("3. Check balance !");
            System.out.println("4. Exit !");
            System.out.println("Choose the operation you want to perform: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you want to withdraw: ");
                    withdrawAmount = sc.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient Balance ! :(");
                        System.exit(0);
                        System.out.println();
                    } else {
                        balance = balance - withdrawAmount;
                        System.out.println("Withdraw successful ! Please collect your money !");
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Enter the amount you want to deposit: ");
                    depositAmount = sc.nextInt();

                    balance = balance + depositAmount;
                    System.out.println("Deposit successful !");
                    System.out.println();

                    break;

                case 3:

                    System.out.println("Your balance is : " + balance);
                    System.out.println();

                    break;

                case 4:

                    System.out.println("Aborting !!!!!!");
                    flag = 0;
                    System.exit(0);
                    System.out.println();

                    break;

                default:
                    break;
            }

        } while (flag == 1);
        sc.close();

    }

}
