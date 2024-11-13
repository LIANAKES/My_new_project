package homework_44;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        // Исходный список строк
       List<String> strings = Arrays.asList("apple", "banana", "melone", "orange", "cherry", "kiwi");

        // Поиск строки с минимальной длиной
        String shortestString = strings.stream()
                .min(Comparator.comparing(String::length)) // Сравнение строк по длине
                .orElse(null); // Если список пуст, возвращается null


        System.out.println("Самая короткая строка: " + shortestString);
    }
}

