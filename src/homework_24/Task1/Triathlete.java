package homework_24.Task1;

public class Triathlete implements Swimmer, Runner {


    @Override
    public void run() {
        System.out.println("Триатлонист бежит.");

    }

    @Override
    public void swim() {
        System.out.println("Триатлонист плывет.");

    }

    public void compete() {
        System.out.println("Триатлонист участвует в соревнованиях.");
    }
}
