package chapter10;

public class Banana extends Fruit{
    public Banana(){
        setCalories(30);
    }
    public void peelBanana(){
        System.out.println("The banana is peeled.");
    }

    @Override
    public void makeJuice (){
        System.out.println("Banana juice is made.");
    }
}
