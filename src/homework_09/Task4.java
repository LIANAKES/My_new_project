package homework_09;

public class Task4 {
    public static void printTriangle() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle();  // Выводит треугольник
    }

}
