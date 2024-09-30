package consultation_05;

public class TaskMethods {
    public static void main(String[] args) {

        //Написать метод, определяющий присутствует ли число в массиве
        //
        //
        //
        //

        int[] ints = {1, 55, 66, 88, -100, -46, 0, 26};
        int findMe = 7;

        boolean bol = findNumberInArray(ints, findMe);
        System.out.println("bol: " + bol);

    }

    public static boolean findNumberInArray (int[] arr, int number){
        if (arr == null || arr.length == 0) return false;
        //Перебрать все значения в массиве. И сравнить каждое с ископым
        //
        //

        for (int i = 0; i <=  arr.length -1; i++){
            if (arr[i] == number) return true;
        }
        //
        return false;
    }
}
