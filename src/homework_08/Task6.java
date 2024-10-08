package homework_08;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int len = 5 + random.nextInt(11); // [5...15]

        int[] array = new int[len];

        // Получить длину
        int arrayLength = array.length; // Получить длину массива (количество элементов в массиве).

        int i = 0;
        System.out.print("[");
        while (i < array.length) {
            array[i] = random.nextInt(101) - 50; // [-50, 50]

            System.out.print(array[i] + ((i != array.length -1) ? ", " : "]\n"));

//            if (i != array.length -1) {
//                System.out.print(", ");
//            } else {
//                System.out.println("]");
//            }
            i++;
        }

        int min = array[0];
        int max = array[0];
        int sum = 0;

        i = 0;
        while (i < array.length) {
            sum += array[i];

            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];

            i++;
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("average: " + sum / (double) arrayLength);



    }

}
