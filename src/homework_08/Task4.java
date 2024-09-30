package homework_08;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        int attempts = 0;

        while (! input.equals("hello")) {
            System.out.println(" Введите слово 'hello' : ");
            input = scanner.nextLine();
            attempts ++;
        }
        System.out.println("Спасибо! Количество попыток : " + attempts);
        scanner.close();
    }
}
