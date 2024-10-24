package homework_31;

public class SeasonApp {
    public static void main(String[] args) {

        for (Seasons seasons : Seasons.values()){
            System.out.println(seasons + " : " + seasons.averageTemperature() + " °C ");
        }

    }
}
