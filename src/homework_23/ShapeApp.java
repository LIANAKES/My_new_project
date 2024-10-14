package homework_23;

public class ShapeApp {
    public static void main(String[] args) {
        Shape [] shapes = {new Circle(5), new Rectangle(6,12), new Triangle(2,4,6)};

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
            totalPerimeter += shape.getPerimeter();
        }
        System.out.println("Oбщая площадь: " + totalArea);
        System.out.println("Общий периметр: " + totalPerimeter);
    }
}
