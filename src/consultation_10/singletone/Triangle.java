package consultation_10.singletone;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    private Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.type = "Triangle";

    }

    public static Triangle createTriangle(double sideA, double sideB, double sideC) {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            return new Triangle(sideA, sideB, sideC);
        }

        return null;
    }



}
