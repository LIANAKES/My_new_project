package homework_05;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String input = scanner.nextLine();

        System.out.println("Количество символов в имени пользователя: " + input.length());

        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() -1);

        System.out.println(firstChar + " | " + (int) firstChar);
        System.out.println(lastChar + " | " + (int) lastChar);

    }
}
