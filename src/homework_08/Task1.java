package homework_08;

public class Task1 {
    public static void main(String[] args) {

        //Используем тип long, т.к. результат вычислений не помещает в тип данных int
        long mult = 1;

        int i = 1;
        while (i <= 15) {
            mult *= i++;
        }

        System.out.println(" Произведение чисел :" + mult);


    }
}
