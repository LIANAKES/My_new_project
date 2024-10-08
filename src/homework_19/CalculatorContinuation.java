package homework_19;

import homework_18.Calculator;

public class CalculatorContinuation {

    public static final double PI = 3.141592653589793;

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            return Integer.MIN_VALUE;
        }
        return (double) a / b;
    }

    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;// Формула: 2 * π * r
    }

        public static double calculateCircleArea ( double radius) {
            return PI * radius * radius;// Формула: π * r^2
        }
    public static void main(String[] args) {
        System.out.println("Сложение: " + Calculator.add(5, 3));
        System.out.println("Вычитание: " + Calculator.subtract(5, 3));
        System.out.println("Умножение: " + Calculator.multiply(5, 3));
        System.out.println("Деление: " + Calculator.divide(5, 3));

        double radius = 5.0;
        System.out.println("Длина окружности с радиусом " + radius + " является: " + CalculatorContinuation.calculateCircumference(radius));
        System.out.println("Площадь круга с радиусом " + radius + " является: " + CalculatorContinuation.calculateCircleArea(radius));
    }

        }




