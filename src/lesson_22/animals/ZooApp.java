package lesson_22.animals;

public class ZooApp {

    public static void main(String[] args) {

        // Класс, от которого наследуются все классы в Java
        // Гарантирует наличие всех методов класса Object у объекта любого типа
        // class Object


        Cat cat = new Cat();

        cat.voice();
        System.out.println(cat.toString());
        cat.eat();

        System.out.println("=====================");

        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        System.out.println("=====================");

        Humster humster = new Humster();
        humster.voice();
        System.out.println(humster.toString());

        System.out.println("====================");
        Test test = new Test();

        System.out.println(test.toString());
        System.out.println(test);




    }

}
