package homework_41;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String text = "Знание – сила, а сила – это возможность менять мир вокруг нас."; // создается переменная text, которая хранит строку
        Map<String, Integer> frequencyMap = getWordFrequency(text);
        System.out.println(frequencyMap);
    }

    public static Map<String, Integer> getWordFrequency(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>(); // выполняет подсчет частоты появления каждого слова в строке text

        // удаляет лишние пробелы в начале и конце строки.
        // заменяет все символы, которые не являются буквами (латинскими и кириллическими) или цифрами, на пробелы.
        // разбивает строку на массив слов, используя один или несколько пробелов как разделитель.
        String[] words = text.trim().replaceAll("[^a-zа-яё0-9]", " ").split("\\s+");

        // цикл перебирает все слова, полученные после разбиения текста на части.
        for (String word : words) {
            if (!word.isEmpty()) { // проверка на то, что слово не пустое
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1); // добавляет слово в карту или увеличивает его частоту.
            }
        }

        return frequencyMap;
    }
}
