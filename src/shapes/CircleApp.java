package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {

        Input inpu1 = new Input();
        System.out.println("Please enter the radius of the Circle");
        Circle circle1 = new Circle(inpu1.getDouble());
        System.out.printf("Circle Area: %f; Circle Circumference: %f. %n", circle1.getArea(), circle1.getCircumference());


    }
}
