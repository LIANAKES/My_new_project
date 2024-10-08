package lesson_18;

public class Car {
    public static  int totalCarProduced;

    private String model;
    private int powerPS;

    public Car (String model, int powerPS){
        this.model = model;
        this.powerPS = powerPS;
        totalCarProduced++; // Увеличиваем общее количество автомобилей при создании нового обьекта (автомобиля)
    }

    public String toString(){
        //Нельзя создать статическую переменную внутри какого-то метода
        //static String result = "Hello";
        return String.format("Auto - model: %s, power: %d. " +
                "Всего выпущено машин: %d", model, powerPS, totalCarProduced);
    }

    public static void  testStatic() {
        //В статике нельзя использовать this - обращение к текущему объекту
        // this.model
        System.out.println("Hello from static method");
    }

    public final int getPowerPS(){
        return powerPS;
    }
    public void setPowerPS (int powerPS1){
        this.powerPS = powerPS;
    }

    // final
    public void test(final int number){
        //
        // number++;
        int x = number + 10;
        x++;
    }

    public void test(final int[] numbers){
        //
        //

        //
        int[] newNumbers = numbers;

        //
        numbers[0] = 100000;
    }

}
