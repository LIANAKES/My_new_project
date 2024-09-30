package lesson_03;

public class Variables {

    public static void main(String[] args) {
        int myFirstVariable; // Обьявление (декларация) переменной типа int

        // Какой-то другой код

        // Присвоение значения переменной
        myFirstVariable = 1; // Первое присвоение значения в переменную называется инициализация.

         int mySecondVariable = 25; // Обьявление и инициализация в одной строке.

        System.out.println(mySecondVariable);

        mySecondVariable = 50; // Присвоение нового значенияю

        System.out.println("Значение переменной: " + mySecondVariable);

        // byte, short, long

        byte byteVariable = 125; // Обьявление и инициализация переменной типа byte;
        byteVariable = 45;
        System.out.println("Значение переменной byteVariable: " + byteVariable);

        short shortVar; // Обьявление переменной типа short
        shortVar = 31000; // инициализация переменной ( присвоение значения )
        System.out.println("Short value: " + shortVar);

        // любое целое число в коде воспринимается компилятором как число типа int

        long longVar = 9_223_000_000_000_000_000L; // знак _ не влияет на значение переменной. Для улучшения читаемости значения нами
        // L  конце числа - явным образом указать, что число в формате long
        System.out.println("Long variable: " + longVar);

        double doubleVar = 10.5421;
        System.out.println("Double variable: " + doubleVar);

        float floatVar = 11.65F; // Явно указать, что число в формате float
        System.out.println("Float variable: " + floatVar);


    }
}
