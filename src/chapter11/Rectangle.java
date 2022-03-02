package chapter11;

public class Rectangle extends Shape{
    public double length;
    public double width;

    public double getLength(double length){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getWidth(double width){return width;}
    public void setWidth(double width){this.width=width;}

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    @Override
    double calculateArea(){
        return width*length;
    }
}
