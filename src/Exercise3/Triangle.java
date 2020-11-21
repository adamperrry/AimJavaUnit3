package Exercise3;

public class Triangle extends GeometricObject {
    // add encapsulated member variables
    private double side1;
    private double side2;
    private double side3;

    // no-args constructor
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // parameterized constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // methods
    @Override
    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    // getters and setters for member variables
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // toString method
    @Override
    public String toString() {
        String line1 = String.format("Triangle: Side 1 = %.1f, Side 2 = %.1f, Side 3 = %.1f", this.side1, this.side2, this.side3);
        String line2 = super.toString();
        String line3 = "Color = " + this.getColor() + " and Filled = " + this.isFilled();
        String line4 = String.format("Area = %.2f", this.getArea());
        return line1 + "\n" + line2 + "\n" + line3 + "\n" + line4;
    }
}
