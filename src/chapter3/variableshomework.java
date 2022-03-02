package chapter3;

/* input plan fee
   input number of overage minutes
   charge 25 cents for every minute over
   15% tax on the subtotal
   _____
   calculate the tax
   calculate the overage minutes
   calculate
   print the final total
*/

import java.util.Scanner;

public class variableshomework {
   public static void main(String args []){
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the base cost of the plan: ");
   double basecost= sc.nextDouble();
   System.out.println("Enter overage minutes: ");
   int overageminutes= sc.nextInt();
   sc.close();
   double overage = calculateOverageMinutes (overageminutes);
   double subtotal = calculateSubTotal (overage+ basecost);
   calculateAndPrintBill(basecost, overage, subtotal);
    }

    public static double calculateOverageMinutes (int overageminutes){
       double rate =0.25;
       double overage = rate*overageminutes;
       return overage; }
    public static double calculateSubTotal (double overage){
       double rate= 0.15;
       double tax= overage*rate;
       return tax;}
    public static void calculateAndPrintBill (double basecost, double overage, double subtotal){
       double finalTotal = basecost + overage + subtotal;
       System.out.println("Phone Bill Statement");
       System.out.println("Plan: $ "+ String.format("%.2f",basecost));
       System.out.println("Overage: $"+ String.format("%.2f", overage));
       System.out.println("Tax: $"+ String.format("%.2f", subtotal));
       System.out.println("Total: $"+ String.format("%.2f", finalTotal));
    }
}
