package chapter3;

import java.util.Scanner;

public class JoculCuBani {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pennies do you have?");
        int pennies = sc.nextInt();
        System.out.println("How many nickels do you have?");
        int nickels = sc.nextInt();
        System.out.println("How many dimes do you have?");
        int dimes = sc.nextInt();
        System.out.println("How many quarters do you have?");
        int quarters = sc.nextInt();


        if (pennies + nickels * 5 + dimes * 10 + quarters * 25 == 100) {
            System.out.println("You are the weener!");
        } else {
            int rest;
            rest = 100 - (pennies + nickels * 5 + dimes * 10 + quarters * 25);
            if (rest < 0) {
                rest= 0- rest;
                System.out.println("Sadly, try again l00ser! You have " + rest + " dollars too much ");
            } else System.out.println("Sadly, try again l00ser! You need " + rest + " dollars in addition.");

        }
    }
}
