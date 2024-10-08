package lesson_18;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("Static before objects cars creating: ");
        System.out.println(Car.totalCarProduced);

        System.out.println("==========================\n");

        Car car = new Car( "BMW", 200);
        System.out.println(car. toString());

        Car car2 = new Car("VW" , 300);
        System.out.println(car2.toString());

        Car car3 = new Car("Audi", 250);
        System.out.println(car3.toString());

        Car car4 = new Car("Daihatsu", 180);
        System.out.println(car4.toString());

        System.out.println("static var: " + Car.totalCarProduced);
        //Я могу обратиться к статике используя конкретный обьект
        //Но это плохая практика. Нам следует обращаться к статике от имени класса
        //System.out.println("static var: " + car2.totalCarProduced);

        //Я могу вызвать статический метод БЕЗ создания объекта (экземпляра) класса
        Car.testStatic();

        //Использование статических методов "утилитных" классов
        int sum = MathUtils.sumOfInts(25, 10);
        System.out.println("sum: " + sum);
    }
}
