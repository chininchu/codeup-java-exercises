package shapes;

public class ShapesTest {


    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4,5);

        System.out.println(box1.getPerimeter());

        System.out.println(box1.getArea());


        Rectangle box2 = new Square(5);

        System.out.println(box2.getPerimeter());

        System.out.println(box2.getArea());


    }

//    Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?


//    I would say that by simply looking at the Overwritten method and by clicking on the usage link we are able to identify which method the public void main is using.


}
