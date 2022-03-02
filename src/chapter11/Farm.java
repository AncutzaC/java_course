package chapter11;

public class Farm {
    public static void main (String args[]){
        Animal animal = new Pig();
        animal.makeSound();
        animal.eat();
        animal= new Duck();
        animal.makeSound();
        ((Duck)animal).laysEggs();
    }
}
