package homework_05;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String string  = scanner.nextLine();

        int indexMiddle = string.length() / 2 - 1;

        char first = string.charAt(indexMiddle);
        char second = string.charAt(indexMiddle + 1);
        System.out.println(first);
        System.out.println(second);

        String subStr = string.substring(indexMiddle, indexMiddle + 2);
        System.out.println(subStr);
    }

}
