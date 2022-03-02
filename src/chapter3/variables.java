package chapter3;

import java.util.Scanner;

public class variables {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner sc = new Scanner(System.in);

    public static void main (String args[]){

        double s= getSalary();
        int c = getCreditScore();
        sc.close();
        boolean qualified = isUserQualified(c, s);
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore= sc.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified (int creditScore, double salary){
        if (salary >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;}
            else return false;
    }
    public static void notifyUser (boolean isQualified){
        if (isQualified){System.out.println("Congrats! You've been aproved.");}
            else {System.out.println("Sorry, you've been declined.");}

    }
}
