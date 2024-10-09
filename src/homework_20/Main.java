package homework_20;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setName("Прямоугольник");
        rectangle.setColor("Красный");
        rectangle.setDimensions(6, 12);
        rectangle.displayInfo();
        rectangle.calculateArea();

        System.out.println("\n=================\n");

        Circle circle = new Circle();
        circle.setName("Круг");
        circle.setColor("Синий");
        circle.setRadius(7);
        circle.displayInfo();
        circle.calculateArea();
    }
}

