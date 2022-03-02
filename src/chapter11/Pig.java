package chapter11;

public class Pig extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Pig makes oink.");
    }
    public void makesPigglets(){
        System.out.println("This pig made 6 pigglets.");
    }
}
