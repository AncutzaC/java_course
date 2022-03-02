package chapter5;

import java.util.Scanner;

public class daysoftheweekarray {

    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Input a number from 1 to 7: ");
        int number = sc.nextInt();
        String[] weekDays={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println ("Your corresponding week day is "+ weekDays[number-1]);
    }
    }
