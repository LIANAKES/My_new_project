package homework_04;

public class Task4 {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';

        // Ваш код
        ch1 = (char) (ch1 - 32); // 'H'
        System.out.println(ch1);
        ch2 -= 32; // ch2 = (char) (ch2 - 32);
        ch3 -= 32;
        ch4 -= 32;
        ch5 -= 32;

        // Так делать не нужно. Ваша программа должна преобразовывать ЛЮБОЙ символ, который сейчас хранится в переменной сh1
 //      ch1 = 'S' ;
 //      ch2 = 'A' ;
 //      ch3 = 'N' ;
 //      ch4 = 'N' ;
 //      ch5 = 'A' ;


        // Todo разобраться почему выводит то коды, то символы
        System.out.println("" + ch1 + ch2 + ch3 + ch4 + ch5);


    }
}
