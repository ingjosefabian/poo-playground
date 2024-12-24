package co.playground.poo.inheritance.shapes;

public class Rectangle extends Shape {

    private double length;

    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
