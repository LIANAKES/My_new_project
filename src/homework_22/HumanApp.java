package homework_22;

public class HumanApp {
    public static void main(String[] args) {
        Human human = new Human("Обычный человек");
        human.run();

        AmateurAthleten amateur = new AmateurAthleten("Спортсмен-любитель");
        amateur.run();

        ProAthlete pro = new ProAthlete("Спортсмен-профи");
        pro.run();
    }

}
