package lesson_21;

import java.util.Arrays;

public class Autobus {

    /*
    Для создания связи типа НАS-А мы определяем поле класса,
    которое будет хранить ссылку на обьект другого класса

    Ассоциация (в том числе и Агрегация, и Композиция ) реализуется через создание ссылок
    на другие обьекты внутри класса.
    Отношение, где один класс использует другой в качестве одного из своих полей

    Агрегация Autobus и BusDriver. Автобус содержит водителя,
    но водитель может существовать независимо от автобуса ( пересесть в другой автобус, остаться дома и т.п.)

    Композиция между Autobus  и Autopilot. Автопилот явл. неотьемлемой частью автобуса.
    И не может существовать без автобуса.

    Важны аспекты ассоциации.

    Направленность саязи. Однонапрвленная или двунапрвленная связь.

    Кардинальность связи. Определяет, сколько обьектов одного класса может быть ассоциировано с обьектом другого класса

    One-to-one (один к одному), One-to-Many (один ко многим), Many-to-Many (многие ко многим)

    1 : 1 -> Автобус и Двигатель
    Каждый автобус может иметь ровно один двигатель и на каждый двигатель приходится ровно один автобус

    1 : Many -> Автобус и Список пассажиров. Один автобус может перевозить множество пассажиров.

    Many : Many -> Список Автобусов и список автобусных остановок.
    Каждый автобус останавливается на множестве остановок и каждая остановка может обслуживать множество автобусов

     */

    private static int counter = 1;

    private final int id;

    private BusDriver driver; // агрегация ("мягкая" связь)
    private Autopilot autopilot; // композиция (жесткая / неразрывная связь)


    private final int capacity;
    private int countPassenger;

    private final Passenger[] passengers;


    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter;
        this.capacity = capacity;
        this.driver = busDriver;
        this.autopilot = new Autopilot("AP -v001");
        // Реализуем двунаправленную связь
        this.autopilot.setAutobus(this);
        this.passengers = new Passenger[capacity];
    }

    public void showListOfPassengers() {
        if (countPassenger == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassenger; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassenger - 1) ? " , " : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

       /*
        1. Надо проверить свободное место
        2. Находится ли этот пассажир уже в нашем автобусе?
        3. Если есть место и пассажир еще не в автобусе - садим на борт:
            3.1. Добавляем его в список пассажиров
            3.2. Увеличиваем кол-во пассажиров в автобусе
            3.3. Возвращаем true
        4. Если что-то пошло не так - выдаем сообщение об ошибке и возвращаем false
         */

        if (countPassenger < capacity) {
            // Место есть
            // Надо проверить, есть ли такой пассажир уже в автобусе
            if (isPassengerInBus(passenger)) {
                System.out.printf("Пассажир id %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }

            // Садим на борт пассажира
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.printf("Пассажир id %d завершил посадку в автобус с id %d\n", passenger.getId(), this.id);
            return true;
        }

        //Свободного места нет
        System.out.printf("В автобусе id %d свободных мест нет!\n", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassenger; i++) {
            if (passengers[i].getId() == passenger.getId()) ;
            return true;
        }
        // пассажира с таким id нет в нашем массиве пассажиров
        return false;
    }

    public boolean dropPassenger(Passenger passenger) {
        if (passenger == null) {
            return false;
        }
        for (int i = 0; i < countPassenger; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                for (int j = i; j < countPassenger - 1; j++) {
                    passengers[j] = passengers[j + 1];
                }
                passengers[countPassenger - 1] = null;
                countPassenger--;
                System.out.printf("Пассажир id %d высажен из автобуса id %d\n", passenger.getId(), this.id);
                return true;
            }
        }

        System.out.printf("Пассажир id %d не найден в автобусе id %d\n", passenger.getId(), this.id);
        return false;
    }


    public void updateAutopilotVersion (String softwareVersion){
        this.autopilot.setSoftwareVersion(softwareVersion);
    }


    public void installNewAutopilot(String softwareVersion){
        //Следим за правильностью ссылок с обеих сторон двунаправленной связи
        this.autopilot.setAutobus(null);
        this.autopilot = new Autopilot(softwareVersion);
        this.autopilot.setAutobus(this);
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Autobus: {");
        sb.append("id: ").append(id).append("; ");
        sb.append("capacity: ").append(capacity).append("; ");
        sb.append("driver: ").append(driver.toString()).append("; ");
        sb.append("autopilot: ").append(autopilot.toString()).append(" }");
        return sb.toString();


        }

    }





