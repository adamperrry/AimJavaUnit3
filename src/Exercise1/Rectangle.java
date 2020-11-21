package Exercise1;

public class Rectangle {
    // encapsulated member variables
    private double width;
    private double height;

    // no-args constructor with default values
    public Rectangle() {
        this.height = 1.0;
        this.width = 1.0;
    }

    // parameterized constructor
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // getters and setters for encapsulated variables
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // class methods
    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return 2 * this.height + 2 * this.width;
    }
}
