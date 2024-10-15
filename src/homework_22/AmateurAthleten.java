package homework_22;

public class AmateurAthleten extends Human{
    public AmateurAthleten(String name) {
        super(name);
        this.speed = 15; // любитель бежит со скоростью 15 км/ч
        this.restTime = 10; // отдыхает 10 минут
    }
}
