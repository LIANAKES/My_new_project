package homework_08;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0){
            sum += number % 10;
            number /= 10;
        }

        System.out.println(" Сумма цифр числа : " + sum);
        scanner.close();
    }
}
