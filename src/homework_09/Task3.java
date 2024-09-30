package homework_09;

import java.util.Random;

public class Task3 {
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void findPrimes(int[] array) {
        int count = 0;
        System.out.print("Простые числа: ");
        for (int num : array) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println("\nВсего простых чисел: " + count);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[50];
        for (int i = 0; i < 50; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
        findPrimes(array);
    }

}
