package co.playground.poo.inheritance.shapes;

public class Square extends Shape {

    private double width;

    public Square(double width) {
        super("Square");
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * width;
    }
}
