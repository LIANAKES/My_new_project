package lesson_07;

public class StringEquals {

    public static void main(String[] args) {



        // Ссылочный
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        // == Cравниваются значения, которые хранятся в переменных
        boolean b1 = (str1 == str2);
        System.out.println("str1 == str2: " + b1); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println("str1 == str4: " + (str1 == str4)); // false

        // String Pool

        // ВАЖНО!!!
        // Для сравнения строк по их значению мы должны использовать метод equals

        boolean b2 = str1.equals(str2); // Сравнение по значению строк ( не по сылкам )
        System.out.println("str1.equals(str2) -> " + b2); // true
        System.out.println("str1.equals(str4) -> " + str1.equals(str4)); // true
        System.out.println("str1.equals(str3) -> " + str1.equals(str3));
        // сравнение по значению
        System.out.println(str1+ ".equalsIgnoreCase(" + str3 + ") -> " + str1.equalsIgnoreCase(str3));


    }
}
