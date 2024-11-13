package consultation_10.singletone;

public class Shape {
    protected String type;

    public Shape() {
        this.type = "Shape";
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public String toString() {
        return type + " area: " + area() + ", perimeter " + perimeter();
    }
}

