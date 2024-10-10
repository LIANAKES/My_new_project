package homework_21;

public class Component {
   private String brand;
    private String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public String toString() {
        return brand + " " + model;
    }
}


