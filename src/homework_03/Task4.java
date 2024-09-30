package homework_03;

public class Task4 {

    public static void main(String[] args) {

        int t1 = 21;
        int t2 = 21;
        int t3 = 19;
        int t4 = 19;
        int t5 = 17;
        int t6 = 23;
        int t7 = 24;

        int days = 7;

        // Cмма всех значений деления на их количество

        int sumTemp = t1 + t2 + t3 + t4 + t5 + t6 + t7;
        System.out.println("sumTemp: " + sumTemp);

        // x / 7 -> средняя температура
        // 141 / 7 -> 20.14..

 //   double averageTemp = sumTemp / days; // брезается дробная часть в операции деления
        double averageTemp = sumTemp / (double) days;


        System.out.println("averageTemp: " + averageTemp);


    }
}
