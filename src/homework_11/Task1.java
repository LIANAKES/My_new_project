package homework_11;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Суммф всех элементов: " +sumArray(array)); // Выведит 15
    }
    public static int sumArray (int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;


    }


}
