package homework_21;

public class Processor extends Component {
    private int cores;
    private double frequency;

    public Processor(String brand, String model, int cores, double frequency) {
        super(brand, model);
        this.cores = cores;
        this.frequency = frequency;
    }

    public String toString() {
        return "Процессор: " + super.toString() + ", Ядра: " + cores + ", Частота: " + frequency + " GHz";
    }

    public int getCores() {
        return cores;
    }

    public double getFrequency() {
        return frequency;
    }
}


