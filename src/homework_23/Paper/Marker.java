package homework_23.Paper;

public class Marker extends Pen{

    @Override
    void draw(String figure) {
        System.out.println("Рисую маркером фигуру: " + figure);
    }
}
