package homework_04;

public class Task3 {
    public static void main(String[] args) {
        long bigNumber = 15_000_000_000L;
        int smallNumber = (int) bigNumber;

        System.out.println("bigNunber: " + bigNumber);
        System.out.println("smallNumber: " + smallNumber);

        // Переполнения типа данных

        // Максимальное значение для типа данных байт
        byte b1 = 127;

        b1++; // b1 = b1 + 1;

        System.out.println(b1);
        b1--; // b1 = b1 - 1;
        System.out.println(b1);

        b1 = (byte) (b1 + 5);
        System.out.println(b1);

        // 127 + 1 = -128
        // -128 + 4 -> -124
    }
}
