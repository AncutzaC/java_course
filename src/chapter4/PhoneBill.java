package chapter4;
/*
phone bill should have an ID, a base, a number of allotted minutes, a number of minutes used
3 constructors: a default one, one that accepts the ID only and one that accepts all fields
calculate the overage, calculate the tax, calculate the total
 */
public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill (){
        this.id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }
    public PhoneBill (int id){
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;}
    public PhoneBill (int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;}

    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    public double getBaseCost(){return baseCost;}
    public void setBaseCost(){this.baseCost =baseCost;}
    public int getAllottedMinutes(){return allottedMinutes;}
    public void setAllottedMinutes(int allottedMinutes) {this.allottedMinutes = allottedMinutes;}
    public int getMinutesUsed(){return minutesUsed;}
    public void setMinutesUsed(int minutesUsed) {this.minutesUsed = minutesUsed;}
    public double calculateOverage (){
        if (minutesUsed <= allottedMinutes){return 0;}
        double overageRate = 0.15;
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes*overageRate;}
    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost+ calculateOverage());}
    public double calculateTotal (){return baseCost+calculateOverage()+calculateTax();}
    public void printItemizedBill (){
        System.out.println("ID: "+ id);
        System.out.println ("Base rate: $"+ baseCost);
        System.out.println ("Overage rate: $" + String.format ("%.2f", calculateOverage()));
        System.out.println ("Tax: $" + String.format ("%.2f", calculateTax()));
        System.out.println ("Total: $" + String.format ("%.2f", calculateTotal()));
        }
}
