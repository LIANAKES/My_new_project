package homework_41;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>(); // Создание первого словаря
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>(); // Создание второго словаря
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2); // метод , который находит пересечение двух карт
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value)); // перебирает все элементы
    }
    // ищет пересечение двух карт и возвращает результат в виде новой карты.
    public static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(); // Создание пустой карты result

        // Перебор ключей первого словаря
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key));
            }
        }

        return result;
    }
}

