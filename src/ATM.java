import java.util.Scanner;

/**
 * Created by KevinBozic on 2/3/16.
 */
public class ATM {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Please enter your name here:");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + ".");

        System.out.println("What would you like to do? check balance / withdraw / cancel");
        String userChoice = scanner.nextLine();

        if (userChoice.equalsIgnoreCase("check balance")) {
            System.out.println("You currently have " + balance + " in your account.");
        } else if (userChoice.equalsIgnoreCase("cancel")) {
            System.out.println("Thank you for banking with us. Have a wonderful day!");
        } else if (userChoice.equalsIgnoreCase("withdraw")) {
            System.out.println("How much would you like to withdraw?");
            amount = scanner.nextInt();
            if (amount > balance) {
                System.out.println("Insufficient Funds");
            } else {
                balance = balance - amount;
                System.out.println("Successful transaction. You now have " + balance + " remaining in your account.");
            }

        } else {
            throw new Exception("Sorry, that isn't one of our options");
        }
    }
}
