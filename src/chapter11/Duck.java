package chapter11;

public class Duck extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Duck makes quack.");
    }
    public void laysEggs(){
        System.out.println("Ducks lay eggs.");
    }
}
