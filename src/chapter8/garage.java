package chapter8;

public class garage {
    public static void main (String args[]){
    Vehicle car = new Car();
    car.drive();
    System.out.println (car instanceof Car);
    }
}
