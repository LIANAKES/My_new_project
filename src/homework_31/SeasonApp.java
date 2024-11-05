package homework_31;

public class SeasonApp {
    public static void main(String[] args) {

        for (Seasons season : Seasons.values()) {
            System.out.println(season + " average temperature: " + season.getAverageTemperature() + "°C");

        }
    }
}