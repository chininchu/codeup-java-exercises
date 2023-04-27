package shapes;

public class ShapesTest {


    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(4,5);
//
//        System.out.println(box1.getPerimeter());
//
//        System.out.println(box1.getArea());
//
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getPerimeter());
//
//        System.out.println(box2.getArea());

        Measurable myShape = new Square(5);
        Measurable myShape2 = new Rectangle(10, 5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());


        // It is essential that we utilize all the abstract methods within the Measurable Interface. The getPerimeter is one of the abstract methods within the interface.

        // The getLength and getWidth is not part of the measurable Interface, which will result in an error during runtime.


    }


}
