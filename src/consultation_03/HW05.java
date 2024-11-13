package consultation_03;

import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String string  = scanner.nextLine();

        int indexMiddle = string.length() / 2 - 1;

        // Option 1
        char ch1 = string.charAt(indexMiddle);
        char ch2 = string.charAt(indexMiddle + 1);
        System.out.println("" + ch1 + ch2);
//        System.out.println(second);

        // Option 2
        String subStr = string.substring(indexMiddle, indexMiddle + 2);
        System.out.println(subStr);
    }
}

