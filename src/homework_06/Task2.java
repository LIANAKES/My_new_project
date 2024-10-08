package homework_06;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(51); // [0, 1 ...49, 50]
        int b = random.nextInt(101); // [0..100]
        b = random.nextInt(51) -20; // [0...50] -> 0 -20 = -20; 20 - 20 = 0; 50 - 20 = 30; [-20...30]

        // 1-100 включительно. [0..99] + 1 -> [1..100]
        int rand = random.nextInt(100) + 1;
        rand = random.nextInt(); // во всем диапазоне типа int

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        boolean check = a == b;
        System.out.println(a + " == " + b + " -> " + check);

        check = a != b;
        System.out.println("a != b: " + check);

        check = a > b;
        System.out.println("a > b: " + check);

        check = b < a;
        System.out.println("b < a: " + check);
    }
}


