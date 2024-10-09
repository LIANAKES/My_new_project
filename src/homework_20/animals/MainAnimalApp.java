package homework_20.animals;

public class MainAnimalApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Барсик", 6, "Немецкая овчарка");
        System.out.println(dog.toString());


        System.out.println("\n=================\n");


        Cat cat = new Cat("Лайма", 1, "Черно-белая");
        System.out.println(cat.toString());
    }
}

