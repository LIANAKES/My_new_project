package homework_09;

public class Task1 {
public static void printArrayReverse (int[] array){
    System.out.print(" Масив в обратном порядке : [");
    for (int i = array.length - 1; i >= 0; i--) {
        System.out.print(array[i] + (i == 0 ? "" : " , "));
    }
    System.out.println("]");
}

// Перегрузка метода: вывод массива с указанного индекса в обратном порядке
    public static void printArrayWithIndex (int[] array, int index) {
        System.out.print("Массив до индекса " + index + " в прямом порядке, а после — в обратном: [");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + ", ");
        }
        for (int i = array.length - 1; i >= index; i--) {
            System.out.print(array[i] + (i == index ? "" : ", "));
        }
        System.out.println("]");
    }
    // Перегрузка метода: массив с булевым флагом
    public static void printArrayWithFlag(int[] array, boolean reverse) {
        if (reverse) {
            printArrayReverse(array);
        } else {
            System.out.print("Массив в прямом порядке: [");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + (i == array.length - 1 ? "" : ", "));
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};
        printArrayReverse(array);  // Выведет [7, 6, 3, 4, 1]
        printArrayWithIndex(array, 2);  // Выведет [1, 4, 7, 6, 3]
        printArrayWithFlag(array, true);  // Выведет [7, 6, 3, 4, 1]
        printArrayWithFlag(array, false); // Выведет [1, 4, 3, 6, 7] }
    }
}
