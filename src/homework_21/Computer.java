package homework_21;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    public void showSpecs() {
        System.out.println("Технические характеристики компьютера:");
        System.out.println(processor);
        System.out.println(memory);
        System.out.println(storage);
    }

    public static void main(String[] args) {

        Processor processor = new Processor("Intel Core", "i5-1135G7", 4, 2.42);
        Memory memory = new Memory("Intel Iris Xe Graphics", "RAM", 8);
        Storage storage = new Storage("HP-Pavilion ", "x360 Convertible 15-er0xxx", 512);


        Computer computer = new Computer(processor, memory, storage);


        computer.showSpecs();
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }
}

