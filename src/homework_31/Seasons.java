package homework_31;

public enum Seasons {
    WINTER(-5),
    SPRING(10),
    SUMMER(25),
    AUTUM(15);

    private final int averageTemperature;


    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }


}
