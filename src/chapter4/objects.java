package chapter4;

public class objects {
    public class Rectangle {
        private double length;
        private double width;

        public double calculatePerimeter () {
            return (2*length) + (2*width);
        }
        public double calculateArea(){
            return length * width;
        }
    }
}
