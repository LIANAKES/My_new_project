package lesson_38;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedMap;

public class ComparatorApp {

    public static void main(String[] args) {

        int[] numbers = {9, 5, 1, 2, 3, 0, 4};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"Abbb", "Cccc", "apple", "Zebra"};
        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));

        Car[] cars = new Car[5];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2024, 300);

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n======================\n");
        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();

        Arrays.sort(cars, carSpeedComparator);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n======================\n");
        CarModelComparator carModelComparator = new CarModelComparator();

        Arrays.sort(cars, carModelComparator);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n===================Anonymous class ============\n");

        // Анонимный класс
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));

        // Сравнить машины по году в порядке возростания,
        // если год совпадает - сравнить такие машины по модели в порядке убывания ( обратный естественному )

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();

                if (yearCompare == 0) {
                    // годы оказались равны
                    return c2.getModel().compareTo(c1.getModel());
                } else {
                    return yearCompare;
                }
            }
        });

        System.out.println(Arrays.toString(cars));

        // Функциональный интерфейс - интефейс который имеет ровно один абстрактный метод

        // Лямбда - выражения - способ краткой записи анонимных функций.
        // Используется исключительно для реализации функциональных интерфейсов.

        //(параметр) -> {тело выражения}

        // Когда реализация состоит из одного выражения, фигурные скобки не требуются
        // Ключевое слово return не используется. Результат выражения автоматически возвращается
        Arrays.sort(cars, (car1, car2) -> car1.getSpeed() - car2.getSpeed());
        System.out.println(Arrays.toString(cars));

        // Когда появляется блок {} - я должен использовать return
        Arrays.sort(cars, (car1, car2) -> {
            return car1.getSpeed() - car2.getSpeed();
        });

        // if (условие) оператор
        // if (условие) {
        // оператор 1;
        // оператор 2;
        // оператор 3;
        // }

        Arrays.sort(cars, (c1, c2) -> {
            int yearCompare = c1.getYear() - c2.getYear();

            if (yearCompare == 0) {
                // годы оказались равны
                return c2.getModel().compareTo(c1.getModel());
            } else {
                return yearCompare;
            }
        });



        Arrays.sort(cars, (c1, c2) -> {
            int yearCompare = c1.getYear() - c2.getYear();
            // compare
            // альтернативный способ сравнения двух int
             yearCompare = Integer.compare (yearCompare, c2.getYear());

             //
            // Integer.valueOf()
            if (yearCompare == 0) {
                // годы совпадают
                return c2.getModel().compareTo(c1.getModel());
            } else {
                return yearCompare;
            }
        });

        // Комператор использованием лямбда - выраженияю
        //  Отсортировать машины по году выпуска в порядке возростания
        //  Если год совпадает - такие машины сортировать по скорости - в порядке возростания.

        Comparator<Car> comparator = (car1, car2) -> {
            int yearCompare = Integer.compare(car1.getYear(), car2.getYear());

            if (yearCompare == 0){
                return Integer.compare(car1.getSpeed(), car2.getSpeed());
            }
            return yearCompare;
        };

        Arrays.sort(cars, comparator);

        System.out.println(Arrays.toString(cars));

        // Реализовать компаратор с использование лямбда
        // для сортировки машин по году выпуска в обратном порядке

        /*
        v1 = 100, v2 = 200
        Машина с большей скоростью считалась "меньшей"
        (v1, v2) -> Если v1 считается меньше чем v2 - метод должен вернуть отрицательное значение
        v1 - v2 -> если скорость v1 меньше чем v2 - результат будет отрицательный,
        т.е. v1 будет признана ментше, чем v2
        v2 - v1 -> если скорость v1 меньше чем v2 -> результат будет положительный,
        т.е. v1 будет признана больше ( т.к. результат положительный) v2

        (v1, v2) -> сравниваем
        v1 - v2 ->  если v1 больше v2 -> результат положительный,
        т.е. v1 будет признан больше, чем v2
        v2 - v1 -> если  v1 больше, чем v2 -> результат отрицательный,
        т.е. v2 признается большим
         */

        /*
        1. Сравнение по скорости.car1 vs car2
        Если мы хотим прямой порядок сортировки -> от меньшего к большему
        car1.getSpeed - car2
        car1.getYear - car2
        2. Порядок сортировки по убыванию
        car2.getSpeed - car1.getSpeed
        car2.getYear - car1.getYear
         */

        Arrays.sort(cars, (car1, car2) -> Integer.compare(car2.getYear(), car1.getYear()));

        System.out.println(Arrays.toString(cars));

        // Todo Comparator - статические методы

        Arrays.sort(cars, Comparator.comparing(Car:: getYear));
        Arrays.sort(cars, Comparator.comparing(Car:: getModel));
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel));

        System.out.println(Arrays.toString(cars));

    }
    }

