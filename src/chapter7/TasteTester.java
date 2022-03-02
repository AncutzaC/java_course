package chapter7;

public class TasteTester {
    public static void main (String args[]){

        Cake cake = new Cake("chocolate");
        cake.setPrice(30.00);
        System.out.println("Cake flavor: "+ cake.getFlavor());
        System.out.println("Cake price: "+ cake.getPrice());

        BirthdayCake birthdayCake= new BirthdayCake();
        birthdayCake.setPrice(40.00);
        System.out.println("Cake flavor: "+ birthdayCake.getFlavor());
        System.out.println("Cake price: "+ birthdayCake.getPrice());

        WeddingCake weddingCake= new WeddingCake();
        weddingCake.setPrice(50.00);
        System.out.println("Cake flavor: "+ weddingCake.getFlavor());
        System.out.println("Cake price: "+ weddingCake.getPrice());
    }


}
