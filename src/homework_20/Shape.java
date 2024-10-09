package homework_20;

public class Shape {
    String name;
    String color;


    public void setName(String name) {
        this.name = name;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public void displayInfo() {
        System.out.println("Название фигуры: " + name);
        if (color != null) {
            System.out.println("Цвет фигуры: " + color);
        }
    }
}


