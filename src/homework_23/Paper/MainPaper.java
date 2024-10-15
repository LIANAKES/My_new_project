package homework_23.Paper;

public class MainPaper {

    public static void main(String[] args) {

        Bruch brush = new Bruch();
        Pencil pencil = new Pencil();
        ColorPencil colorPencil = new ColorPencil();

        Paper paper = new Paper();

        paper.drawFigure("Квадрат", brush);
        paper.drawFigure("Овал", new Marker());
        paper.drawFigure("Квадрат", new Eraser());

        paper.drawFigure("Круг", colorPencil);

        colorPencil.setColor("Yellow");
        paper.drawFigure("Солнце", colorPencil);


    }
}
