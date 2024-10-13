package homework_22;

public class Human {
    protected String name;
    protected int speed; // cкорость бежать
    protected int restTime; // время отдыха

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public Human(String name) {
        this.name = name;
        this.speed = 10; // обычный человек бежит со скоростью 10 км/ч
        this.restTime = 15; // отдыхает 15 минут


    }
    public void run() {
        System.out.println(name + " бежит со скоростью " + speed + " км/ч.");
        restTime();
    }

    public void restTime() {
        System.out.println(name + " должен отдохнуть " + restTime + " минут.");
    }
}
