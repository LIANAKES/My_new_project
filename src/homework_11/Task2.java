package homework_11;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Среднее значение: " + averageArray(array)); // Выведит 30
    }

    public static double averageArray (int[] array){
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        return (double) sum / array.length;
    }
}
