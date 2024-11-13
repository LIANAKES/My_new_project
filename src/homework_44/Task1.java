package homework_44;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        // Исходный список целых чисел
        List<Integer> numbers = Arrays.asList(15, 46, 33, 8, 13, 19, 10, 23, 38);

        // Отбор чисел > 10 и сортировка по последней цифре
        List<Integer> result = numbers.stream()
                .filter(n -> n > 10) // Фильтруем числа > 10
                .sorted(Comparator.comparing(n -> n % 10)) // Сортируем по последней цифре
                .collect(Collectors.toList()); // Сохраняем результат в список


        System.out.println(result);
    }
}

