package homework_08;

public class Task7 {
    public static void main(String[] args) {
        int[] array = { 5, 6, 31, 0, -25, -15 };

        int minIndex = 0;
        int min = array[minIndex];

        int maxIndex = 0;
        int max = array[maxIndex];

        int i = 0;
        while (i < array.length) {

            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }

            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }

            i++;
        }

        System.out.println("min = " + min + " index: " + minIndex);
        System.out.println("max = " + max + " index: " + maxIndex);

//        array[minIndex] = max;
//        array[maxIndex] = min;

        // swap
        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

        i = 0;
        while (i < array.length) {
            System.out.print(array[i++] + ", ");
        }




    }

}
