package chapter10;

public class Apple extends Fruit {
    public Apple(){
        setCalories(10);
    }
    public void removeSeeds(){
        System.out.println("Apple seeds are removed.");
    }
    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made.");
    }
}
