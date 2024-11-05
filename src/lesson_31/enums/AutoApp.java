package lesson_31.enums;

import java.util.SortedMap;

public class AutoApp {
    public static void main(String[] args) {

        Color color = Color.RED;
        System.out.println(color);

        Auto auto = new Auto("Model1", Color.BLUE);
        System.out.println(auto);

        auto.setColor(color);
        System.out.println(auto);

        System.out.println("==========================");

        //
        Color[] colors = Color.values(); //
        for (Color currentColor : colors){
            System.out.println(currentColor);
        }

        //
        Color color1 = Color.valueOf("RED1");
        System.out.println(color1);

        //
        String name = Color.RED.name();
        System.out.println(name + "!");

        //
        int ordinal = Color.GREEN.ordinal();
        System.out.println("ordinal: " + ordinal);

        System.out.println(auto);
        // Enum
        if (auto.getColor() == Color.GREEN){
            System.out.println(" Цвет авто зеленый");
        } else {
            System.out.println("Не зеленый");
        }

        //
        switch (color){
            case RED :
                System.out.println(" Красный ");
                break;
            case GREEN:
                System.out.println(" Зеленый ");
                break;
            default:
                System.out.println(" Какой-то другой ");
        }

    }
}
