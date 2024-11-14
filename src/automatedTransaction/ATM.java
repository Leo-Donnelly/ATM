package automatedTransaction;

import java.util.Scanner;

public class ATM {

    private static double balance;

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        pinNum();
    }

    protected static void pinNum(){
        int correctPin = 5572;
        int attempts = 3;

        System.out.println("Enter the pin:");
        int pin = scanner.nextInt();

        for(int i=1; i<attempts; i++){
            System.out.println("Incorrect, Enter the pin again:");
            pin = scanner.nextInt();

            if(pin == correctPin){
                homeScreen();
            }

        }
        System.out.println("LOCKED OUT");
        System.exit(0);
    }

    public static void homeScreen(){
        System.out.println("1 for show balance || 2 to add money || 3 to withdraw money || 4 to quit" );
        int choice = scanner.nextInt();

        if(choice == 1){
            showBalance();
        }else if(choice == 2){
            addMoney();
        }else if(choice == 3){
            widthdrawMoney();
        }
    }

    private static void showBalance(){
        System.out.println("Your balance is £" + balance);
    }

    private static void addMoney(){
        System.out.println("How much money would you like to add?");
        double adding = scanner.nextDouble();
        balance = balance + adding;
    }

    private static void widthdrawMoney(){
        System.out.println("How much money would you like to take out?");
        double adding = scanner.nextDouble();
        balance = balance - adding;
    }

}
