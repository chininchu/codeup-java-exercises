package shapes;

public class Square extends Quadrilateral {

    public double side;

    public Square(double side) {

        super(side, side);
        this.side = side;

    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);

    }


    @Override
    public double getPerimeter() {
        return 4 * side;

    }


    public void setSide(double side) {
        this.side = side;
    }


}
