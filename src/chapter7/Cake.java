package chapter7;

public class Cake {
    private String flavor;
    private double price;

    public Cake(String flavor){
        setFlavor(flavor);
    }
    public Cake(double price){
        setPrice(price);
    }
    public String getFlavor(){
        return flavor;
    }
    public void setFlavor(String flavor){
        this.flavor= flavor;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
}
