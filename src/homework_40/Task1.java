package homework_40;

import org.junit.platform.commons.util.StringUtils;

import java.util.*;

public class Task1 {

    public static List<String> getUniqueSortedWords(String input) {

        // Удаляем все символы, кроме букв и пробелов
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9а-яА-Я ]", " ");


        // Разбиваем строку на слова
        String[] wordsArray = cleanedInput.split(" ");

        // Используем Set для хранения уникальных слов
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(wordsArray));

        // Преобразуем Set в List для сортировки
        List<String> sortedWords = new ArrayList<>(uniqueWords);

        // Сортируем список по длине слов, а затем по алфавиту
        sortedWords.sort(Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase));

        return sortedWords;
    }

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(Task1.getUniqueSortedWords(testString));
    }
}

