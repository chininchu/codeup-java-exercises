package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    //    protected double length;
//    protected double width;
//
//
//    public Rectangle(double length, double width) {
//
//        this.length = length;
//
//        this.width = width;
//    }
//
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }


    public double getArea() {

        return length * width;

    }


    public double getPerimeter() {

        return 2 * length + 2 * width;
    }


}
