package homework_22.Task2;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(), new Bicycle(), new Motorcycle()};


        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}