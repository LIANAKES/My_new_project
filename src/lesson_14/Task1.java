package lesson_14;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = sumEvenNumbers (numbers);
        System.out.println(" Cумма четных чисел" + sum);
    }

    public static int sumEvenNumbers (int [] arr){
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    }

