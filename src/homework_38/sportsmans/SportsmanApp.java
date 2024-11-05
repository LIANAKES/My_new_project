package homework_38.sportsmans;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {

    public static void main(String[] args) {
        Sportsmann[] sportsmanArray = new Sportsmann[6];
        sportsmanArray[0] = new Sportsmann("John",  100.50, 28);
        sportsmanArray[1] = new Sportsmann("Alex",  90.78, 24);
        sportsmanArray[2] = new Sportsmann("Bob",  100.50, 30);
        sportsmanArray[3] = new Sportsmann("Tim",  50, 30);
        sportsmanArray[4] = new Sportsmann("Hanna",  90.50, -1_600_000_000);
        sportsmanArray[5] = new Sportsmann("Zlatan",  75, -1_400_000_000);


        Arrays.sort(sportsmanArray);

        for (Sportsmann sportsmann : sportsmanArray){
            System.out.println(sportsmann);
        }

        Arrays.sort(sportsmanArray, new SportsmanScoreComparator());

        System.out.println("\n=========================================\n");


        for (Sportsmann sportsmann : sportsmanArray){
            System.out.println(sportsmann);
        }

        System.out.println("\n=========================================\n");

        //
//        Comparator<Sportsman> comparator = new Comparator<Sportsman>() {
//            @Override
//            public int compare(Sportsman o1, Sportsman o2) {
//                return 0;
//            }
//        } ;

        int x1 = -1_500_000_000;
        int x3 = -1_400_000_000;
        System.out.println(x1 - x3);
//


        Arrays.sort(sportsmanArray, new Comparator<Sportsmann>() {
            @Override
            public int compare(Sportsmann s1, Sportsmann s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
                // сравнение примитивов. Может произойти переполнение типа -> некорректные значения операция вычитания
//                 return s1.getAge() - s2.getAge();
            }
        });

        for (Sportsmann sportsmann : sportsmanArray){
            System.out.println(sportsmann);
        }


    }
}
