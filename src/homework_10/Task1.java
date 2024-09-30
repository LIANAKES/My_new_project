package homework_10;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int []array = {0, 1, 2, 3, 4, 5, 6};
        copyOfArray(array, 10);

     // null - что ссылка не ссылается ни на какой обьект
       String str = null;

       str = "Java";

       if (str != null){
            System.out.println(str.length());
            System.out.println(str.toUpperCase());
        }

       int[] array1 = null;

       if (str.equals("Java")){
           array1 = new int[10];
       }


        // copyOfArray(arr1, 2);


    } // Method area

    public static void copyOfArray(int[]array, int newLenght){

        int[] result = new int[newLenght];

        // Распечатать красиво массив
        String arrayStr  = Arrays.toString(result);


        /*
        Массив всегда при создании заполняется значениями по умолчанию
        числовые типы данных ( в том числе char) -> 0/0.0
        boolean -> false
        ссылочные типы ( в том числе String) -> null
         */

        for (int i =0; i < result.length && i < array.length; i++){
         result[i] = array[i];
        }

        System.out.println(Arrays.toString(result));

    }


    public static void  printArray(int[] array){
       for (int i= 0; i< array.length; i++){
           System.out.print(array[i] + " , ");
       }
        System.out.println();
    }
}


