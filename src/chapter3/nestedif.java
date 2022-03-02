package chapter3;

import java.util.Scanner;

public class nestedif {
    public static void main(String args[]) {
        int income = 30000;
        int workingYears = 2;

        Scanner sc = new Scanner(System.in);
        System.out.println("How much money did you make per year?");
        int incomeperson = sc.nextInt();

        if (incomeperson < income) {
            System.out.println("You do not qualify for a loan, salary not big enough");
        } else {
            System.out.println("How many years did you work here?");
            int yearsperson = sc.nextInt();
            if (yearsperson >= workingYears) {
                System.out.println("Congrats, you qualify for the loan!");
            } else {
                System.out.println("You do not qualify for the loan, not enough years worked.");
            }
        }
    }
}