package homework_38.sportsmans;

public class Sportsmann implements  Comparable<Sportsmann>{
    private  String name;
    private double score;
    private int age;

    public Sportsmann (String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sportsmann{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Sportsmann sportsman) {
        return this.getName().compareTo(sportsman.getName());
    }
}
