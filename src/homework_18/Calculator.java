package homework_18;

public class Calculator {
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

    public static void main(String[] args) {
        System.out.println("Сложение: " + Calculator.add(5, 3));
        System.out.println("Вычитание: " + Calculator.subtract(5, 3));
        System.out.println("Умножение: " + Calculator.multiply(5, 3));
        System.out.println("Деление: " + Calculator.divide(5, 3));
    }
}

