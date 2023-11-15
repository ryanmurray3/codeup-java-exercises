package shapes;
//
//
//
class Square extends Quadrilateral {
    double side;


    double length;
    double width;

    {
        length = side;
        width = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public void setLength(double length) {

    }

    public Square(double side) {
        super(side, side);
    }
}
