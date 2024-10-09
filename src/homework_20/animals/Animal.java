package homework_20.animals;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Животное: " + name + ", Возраст: " + age;
    }

}

