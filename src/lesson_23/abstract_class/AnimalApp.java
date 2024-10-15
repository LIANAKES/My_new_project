package lesson_23.abstract_class;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat(" Tom ");
        cat.eat();
        cat.sayHello();

        // Нельзя создать экземпляр абстрактного класса
        // Animal animal = new Animal(); // Ошибка кампиляции
        Animal animal = new Cat("Max"); // но я могу использовать полиморфизм
        // Собирать обьекты дочерних классов в ссылку родительского абстрактного класса

        Dog dog = new Dog("Plutto");
        dog.eat();
        dog.sayHello();

        SuperCow superCow = new SuperCow ("Mu!");
        animalTest(superCow);



    }

    public static void animalTest(Animal animal){
        animal.sayHello();
        animal.eat();
    }
}
