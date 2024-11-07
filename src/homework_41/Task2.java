package homework_41;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {
        String text = " Строка для проверки количества вхождений слов " +
                ".\n Строка для проверки и теста. и количества слов для проверки "; // нужно посчитать количество вхождений слов и символов.

        Map<String, Integer> frequencyMap = frequencyDictionary(text); // подсчитывает частоту каждого уникального слова в text
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text); // подсчитывает частоту каждого символа в text.

        System.out.println(" \nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.println("'" + k + "': " + v + "; ")); // цикл выводит каждый символ и его частоту в заданном формате
        System.out.println();
    }
    public static Map<String, Integer> frequencyDictionary(String text) { // метод подсчитывает частоту каждого слова в text.
        Map<String, Integer> frequencyMap = new HashMap<>(); // карта хранит слова в качестве ключей и их частоту в качестве значений.

        // обрабатывает text для выделения отдельных слов
        String[] words = text.trim().replaceAll("[^a-zа-яё0-9]", " ").split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        return frequencyMap;
    }
            // метод подсчитывает частоту каждого символа в text.
    public static Map<Character, Integer> frequencyCharsDictionary(String text) {
        Map<Character, Integer> frequencyCharsMap = new HashMap<>(); // карта хранит каждый символ в качестве ключа и его частоту в качестве значения.

        for (char c : text.toCharArray()) { // цикл преобразует текст в массив символов и перебирает каждый символ
            frequencyCharsMap.put(c, frequencyCharsMap.getOrDefault(c, 0) + 1); // увеличивает счетчик для каждого символа в карте.
        }

        return frequencyCharsMap;
    }
}

