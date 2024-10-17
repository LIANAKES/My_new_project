package homework_26;

public class MainList {

    public static <T, U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2) {

        for (T element : list1) {
            System.out.println(element);
        }
        for (U element : list2) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        printTwoLists(names, scores);
    }
}