package co.playground.poo.inheritance.shapes;

public abstract class Shape {

    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public String getName() {
        return name;
    }

}
