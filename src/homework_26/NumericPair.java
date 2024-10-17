package homework_26;

import lesson_26.lists.MyArrayList;

public class NumericPair <T extends Number, U extends Number> {
    private T first;
    private U second;

    public NumericPair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public double sum() {
        return first.doubleValue() + second.doubleValue();
    }

    public static void main(String[] args) {

        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum());

        NumericPair<Double> doublePair = new NumericPair<>(4.5, 8.5);
        System.out.println(doublePair);
    }

}
