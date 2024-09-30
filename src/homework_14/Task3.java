package homework_14;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String word = scanner.nextLine().toLowerCase();

        // Подсчет гласных и согласных
        int vowelsCount = 0;
        int consonantsCount = 0;

        for (char letter : word.toCharArray()) {
            if (isVowel(letter)) {
                vowelsCount++;
            } else if (isConsonant(letter)) {
                consonantsCount++;
            }
        }

        // Вывод результатов
        System.out.println("Количество гласных: " + vowelsCount);
        System.out.println("Количество согласных: " + consonantsCount);
    }

    // Метод для проверки, является ли буква гласной
    public static boolean isVowel(char letter) {
        return "aeiouаеёиоуыэюя".indexOf(letter) != -1;
    }

    // Метод для проверки, является ли буква согласной
    public static boolean isConsonant(char letter) {
        return "bcdfghjklmnpqrstvwxyzбвгджзйклмнпрстфхцчшщ".indexOf(letter) != -1;
    }
}

