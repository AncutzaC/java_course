package chapter2;

import java.util.Scanner;

public class Sentence {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a season of the year:");
        String season = sc.next();

        System.out.println("Insert a whole number:");
        int number = sc.nextInt();

        System.out.println("Insert an adjective:");
        String adjective = sc.next();
        sc.close();
        System.out.println("On a " + adjective + " " + season + "day, I drink a minimum of " + number + " cups of coffee.");
}}