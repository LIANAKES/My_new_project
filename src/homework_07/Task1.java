package homework_07;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите число на выбор: 1, 2 или 3");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println(" Вы ввели один");
                break;
            case 2:
                System.out.println(" Вы ввели два");
                break;
            case 3:
                System.out.println("Вы ввели три");
                break;
            default:
                System.out.println("Я таких чисел не знаю");
        }



        //     System.out.println("input: " + input);

       // System.out.println(" Введите ваш возраст:");
        //int age = scanner.nextInt();
        //scanner.nextLine();
        //System.out.println("age: " + age);





    }
}
