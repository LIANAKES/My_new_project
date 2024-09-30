package lesson_06;

import java.util.Random;

public class BooleanExample {
    public static void main(String[] args) {
        boolean bol1 = true;
        bol1 = false;
        int x = 10;
        int y = 5;

        // Сравнение на равенство "=="
        boolean b1 = x == y; // X равен Y -> 10 равно 5 -> false
        System.out.println(x + " == " + y + " -> " + b1);

        // Не равенство "!="
        // X не равен Y
        b1 = x != y; // 10 != 5 -> true
        System.out.println(x + " != " + " -> " + b1);

        // Больше ">"
        // X больше чем У
        b1 = x > y; // 10 > 5 -> true
        System.out.println(x + " > " + y + " -> " + b1);
        y = 10;
        b1 = x > y; // 10 больше 10 -> false
        System.out.println(x + " > " + y + " -> " + b1);

        // Больше или равно ">="
        b1 = x >= y; // 10 больше или равно 10 -> true
        System.out.println(x + " >= " + " -> " + b1);
        x = 7;

        // Меньше "<"
        b1 = x < y; // 7 меньше чем 10 -> true
        System.out.println(x + " < " + y + " -> " + b1);

        // Меньше или равно "<="
         // 7 меньше или равно 10 -> true
        System.out.println(x + " <= " + y + " -> " + b1);

        String str = "Java is the best";
        boolean contains = str.contains("Java"); // Строка str содержит в себе подстроку "Java"
        System.out.println("str.contains(\"Java\"): " + contains);

        System.out.println(" =========== Логическое операции =========== \n");

        // Логическое НЕ (отрицание) "!"
        // Меняет значение boolean на противоположное
        boolean b2;
        b2 = !false; // получим значение true
        System.out.println("!false: " + b2);

        b2 = ! (4 == 5); // !false -> true
        System.out.println("!(4 == 5): " + b2);

        // Составные сравнения - Два условия

        // Логическое И "&"
        // Используется когда нужно, чтобы оба условия были истинными
        // Рим столица Италии И Берлин столица Голландии
        // Если хотя бы в одной части будет false ->  в результате мы получим false
        b2 = true & true;
        System.out.println("true & true: " + b2);
        b2 = (2 < 5) & (11 == 10); // true & false -> false
        System.out.println("(2 < 5) & (11 == 10) -> " + b2);

        // Введите число от 0 до 100
        int x1 = 50;
        boolean b3 = x1 > 0 & x1 < 100; //


        // Логическое ИЛИ "|"
        // Когда достаточно, чтобы ХОТЯ БЫ ОДНО условие было истинным
        boolean b4 = true | false;
        System.out.println("true | false -> " + b4);
        System.out.println("false | false -> " + (false | false));

        // Введи или четное число, или число, которое делится на 5 без остатка.
        // четное число - число, которое делится без остатка на 2.

        // Генерация случайного числа
        Random random = new Random();
        // В диапазоне от 0 до X
        int rand = random.nextInt(100); // (0...x-1) -> (0...99) включительно
        System.out.println("rand: " + rand);
        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber: " + isGoodNumber);

        System.out.println(" ========= \n");

        // Логическое исключающее ИЛИ (XOR) "^"
        // Возвращает true если две части выражения разные
        boolean b5 = true ^ false;
        System.out.println("true ^ false: " + b5);
        b5 = false ^ true;
        System.out.println("false ^ true: " +b5);
        b5 = true ^ true;
        System.out.println("true ^ true: " + b5);
        b5 = false ^ false;
        System.out.println("false ^ false: " + b5);

        System.out.println(" ==============\n");

        //


    }

}
