package homework_22.Task3;

public class FiguresApp  {
    public static void main(String[] args) {

        Figure[] figures = {new Circle(4), new Square (6), new Triangle(4,7)};

        // Вычисляем площадь каждой фигуры
        for (Figure figure : figures) {
            System.out.println("Площадь фигуры: " + figure.calculateArea());
        }
    }
}


