package homework_42;

import java.util.HashMap;

public class Task1 {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // строки разной длины не могут быть анаграммами
        }

        HashMap<Character, Integer> charCountMap1 = new HashMap<>();
        HashMap<Character, Integer> charCountMap2 = new HashMap<>();

        // Заполнение первой карты для str1
        for (char c : str1.toCharArray()) {
            charCountMap1.put(c, charCountMap1.getOrDefault(c, 0) + 1);
        }

        // Заполнение второй карты для str2
        for (char c : str2.toCharArray()) {
            charCountMap2.put(c, charCountMap2.getOrDefault(c, 0) + 1);
        }

        // Сравнение карт
        return charCountMap1.equals(charCountMap2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " и " + str2 + " — анаграммы.");
        } else {
            System.out.println(str1 + " и " + str2 + " — не анаграммы.");
        }
    }
}

