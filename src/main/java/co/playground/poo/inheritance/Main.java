package co.playground.poo.inheritance;

import co.playground.poo.inheritance.shapes.Circle;
import co.playground.poo.inheritance.shapes.Rectangle;
import co.playground.poo.inheritance.shapes.Square;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        final var shapes = List.of(
                new Circle(3),
                new Square(5),
                new Rectangle(5, 6),
                new Circle(4)
        );
        shapes.forEach(shape -> System.out.println("Shape Area : " + shape.calculateArea()));
    }
}
