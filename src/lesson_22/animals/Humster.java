package lesson_22.animals;

public class Humster extends Animal{

    //  Переопределим родительский метод

    @Override
    public void voice() {
        System.out.println("Humster say Hrum-hrum");
    }
}
