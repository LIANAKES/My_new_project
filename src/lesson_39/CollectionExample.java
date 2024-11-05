package lesson_39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {

        // Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его интерфейсов
        // Это позволяет единобразно обрабатывать различные типы коллекций

        // Создаем коллекцию строк
        // Ссылки типа интерфейс -> а справа мы можем подставить обьект разных классов (получить разные реализации этого интерфейса)
        Collection<String> strings = new ArrayList<>();

        // int size() - возвращает кол-во элементов в коллекции
        System.out.println("strings.size(): " + strings.size());

        // boolean isEmpty() - возвращает
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        // boolean add (T t) -
        strings.add("Java");
        strings.add("Python");

        //
        System.out.println(strings);

        // Метод .of() - это статический метод в нескольких интерфейсах и классах. Был введен в Java 9
        // Создает неизменяемый экземпляр коллекции из предоставленных элементов
        // Доступен для List, Set, Map

        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5);
        System.out.println("integrs: " + integers);
        // integers.add(6); // попытка модифицировать (изменить) неизменяемую коллекцию приведет к ошибке (Исключительной ситуации)

        // addAll(Collection<? extends T> col) - добавляет все элементы из указанной коллекции в текущую
        strings.addAll(List.of("JS", "Banana", "Cat"));

        System.out.println(strings);

        /*
        strings.add("JS");
        strings.add("Banana");
        strings.add("Cat");
         */

        System.out.println("\n=========================================\n");

        // boolean removeAll(Collection<? extends T> col) - удаляет все элементы из коллекции вызов, содержащиеся в коллекции col (вычитание)
        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0, 1, 2, 3, 4, 5));

        System.out.println("numbers: " + numbers);
        numbers.removeAll(List.of(3, 2, 1));
        System.out.println("numbers.removeAll(List.of(1, 2, 3)): " + numbers);

        // boolean retainAll(Collection<? extends T> col) -
        //

        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 20, 40, 50));
        colB.addAll(List.of(20, 30, 40));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB): " + colA);

        //
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println("colA.remove(40): " + colA.remove(40));
        System.out.println("colA: " + colA);

        //
        //
        Collection<String> strings1 = new ArrayList<>(List.of("Test1", "Test2", "Test3"));
        System.out.println("strings1: " + strings1);
        strings1.add("Test4");
        System.out.println("strings1: " + strings1);

        Collection<String> stringCopy = new ArrayList<>(strings1);
        stringCopy.addAll(strings);
        System.out.println("stringsCopy: " + stringCopy);
    }
}
