package homework_09;

public class Task5 {
    public static void printLongestStringCharacters(String[] array) {
        String longest = "";
        for (String str : array) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        System.out.println("Символы самой длинной строки: ");
        for (char c : longest.toCharArray()) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        String[] words = {"One", "Two", "Twenty"};
        printLongestStringCharacters(words);  // Выведет символы слова "Twenty"
    }

}
