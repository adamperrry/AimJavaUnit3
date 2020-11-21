package Exercise3;

import java.util.Date;

public abstract class GeometricObject {
    // encapsulated member variables
    private String color;
    private boolean filled;
    private Date dateCreated;

    // no-args constructor
    public GeometricObject(){
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    // parameterized constructor
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // getters and setters for encapsulated variables
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // methods
    public abstract double getArea();

    // toString
    public String toString() {
        return "Created on " + this.dateCreated;
    }
}
