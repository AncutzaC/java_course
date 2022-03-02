package chapter10;

public class Market {
    public static void main (String args[]){
    Fruit apple = new Apple();
    ((Apple) apple).removeSeeds();
    Fruit banana = new Banana();
    ((Banana)banana).peelBanana();
    Fruit banana2= new Banana();
    banana2.makeJuice();
    apple.makeJuice();
    Fruit fruit = new Fruit();
    fruit.makeJuice();

}}
