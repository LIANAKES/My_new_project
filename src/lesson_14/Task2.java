package lesson_14;

public class Task2 {
        public static void main(String[] args) {
            int[] numbers = {1, 5, 3, 9, 2, 8};
            int secondLargest = findSecondLargest(numbers);
            System.out.println("Второе по величине число: " + secondLargest);
        }

        public static int findSecondLargest(int[] arr) {
            // Проверяем, что в массиве минимум 2 элемента
            if (arr.length < 2) {
                throw new IllegalArgumentException("Массив должен содержать минимум 2 элемента.");
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            // Проверка, что нашлось второе по величине число
            if (secondLargest == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Все элементы массива одинаковы.");
            }

            return secondLargest;
        }
    }

