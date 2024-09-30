package homework_10;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        String[]strings = { "One", "Java", "Python", "JS", "Hello"};
        String[] result = getArrayWithSmallesString(strings);
        System.out.println(Arrays.toString(result));
        System.out.println(" ============= testArray = null ============ \n");
        strings = null;
        String[] res = getArrayWithSmallesString(strings);
        System.out.println(Arrays.toString(res));


    } // Method area

    public static  String[] getArrayWithSmallesString(String[] strings) {

        if (strings == null) {
            return new String[0]; // []
        }

        String smallest = strings[0];
        String biggest = strings[0];

        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() < smallest.length()) {
                smallest = strings[i];
            }

            if (strings[i].length() > biggest.length()) {
                biggest = strings[i];
            }

        }
        return new String[] {smallest, biggest};
    }
}
