package homework_09;

public class Task2 {
    public static void powerOfTwo(int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= 2;
        }
        System.out.println("2 в степени " + exponent + " = " + result);
    }

    public static void main(String[] args) {
        powerOfTwo(3);  // Выведет 8
    }

}
