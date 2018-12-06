package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return width * length;
    }

}
