package homework_26;

public class Pair<T> {

    private T First;
    private T Second;

    public Pair(T first, T second) {
        this.First = first;
        this.Second = second;
    }

    public T getFirst() {
        return First;
    }

    public T getSecond() {
        return Second;
    }

    public void setFirst(T value) {
       this.First = value;
    }

    public void setSecond (T value){
        this.Second = value;
    }

    public void swap (){
        T temp = First;
        First = Second;
        Second = temp;
    }

    public static void main(String[] args) {
        Pair <String> pair = new Pair<> ("Hello", "World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        System.out.println("=============================");

        pair.swap();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }

}
