package homework_44;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
      // Исходный список целых чисел
       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Фильтрация четных чисел, умножение на 2 и сбор результата в новый список
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0) // Оставляем только четные числа
                .map(n -> n * 2) // Умножаем каждое число на 2
                .collect(Collectors.toList()); // Собираем результат в новый список


        System.out.println(result);
    }
}
