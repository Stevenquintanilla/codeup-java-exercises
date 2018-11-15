package shapes;

public class Rectangle {

    protected int width;
    protected int length;

    public Rectangle() {

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    public int getArea() {
        return this.width * this.length;
    }

    public int getPerimeter() {
        return (2 * this.width) + (2 * this.length);
    }

}
