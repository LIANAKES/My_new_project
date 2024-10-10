package homework_21;

public class Memory extends Component{
    private int capacity;

    public Memory(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

  public String toString() {
        return "Память: " + super.toString() + ", Емкость: " + capacity + " GB";
    }
}
