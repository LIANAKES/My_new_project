package consultation_09;

public class Child extends Parent {
    public void test() {
        System.out.println("id: " + id);
        System.out.println("age: " + this.getAge()); // приватное поле. Доступ через getter
        System.out.println("weight: " + weight); // protected доступен без геттера
        System.out.println("Height: " + this.getHeight()); // модификатор доступа по умолчанию. Прямой доступ только в одном пакете
    }
}

