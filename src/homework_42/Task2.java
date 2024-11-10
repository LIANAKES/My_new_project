package homework_42;

import java.util.HashMap;

public class Task2 {

    public static HashMap<Integer, Integer> countWordsByLength(String text) {
        HashMap<Integer, Integer> wordLengthCountMap = new HashMap<>();

        // Разделение текста на слова
        String[] words = text.split("\\s+");

        for (String word : words) {
            int length = word.length();

            // Увеличиваем количество слов данной длины
            wordLengthCountMap.put(length, wordLengthCountMap.getOrDefault(length, 0) + 1);
        }

        return wordLengthCountMap;
    }

    public static void main(String[] args) {
        String text = "apple banana apple cherry banana apple";

        HashMap<Integer, Integer> wordLengthCount = countWordsByLength(text);


        System.out.println("Длина слова имеет значение:");
        for (Integer length : wordLengthCount.keySet()) {
            System.out.println("Слова длины " + length + ": " + wordLengthCount.get(length));
        }
    }
}

