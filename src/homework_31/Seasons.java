package homework_31;

public enum Seasons {
    AUTUMN ("Осень"){
        @Override
        public int averageTemperature(){
            return 12;
        }
    },
    WINTER (" Зима "){
        @Override
        public int averageTemperature(){
            return -2;
        }
    },
    SPRING (" Весна "){
        @Override
        public int averageTemperature(){
            return 20;
        }
    },
    SUMMER (" Лето "){
        @Override
        public int averageTemperature(){
            return 25;
        }
    };

    private final String name;
    public int averageTemperature;

    Seasons(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "name='" + name + '\'' +
                ", averageTemperature=" + averageTemperature +
                '}';
    }

    public abstract int averageTemperature();
}