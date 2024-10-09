package homework_20;

public class Circle extends Shape {
        double radius;

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void calculateArea() {
            double area = Math.PI * radius * radius;
            System.out.println("Площадь круга: " + area);
        }
    }

