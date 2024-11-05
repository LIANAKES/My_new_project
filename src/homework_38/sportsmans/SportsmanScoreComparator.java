package homework_38.sportsmans;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsmann> {
    @Override
    public int compare(Sportsmann s1, Sportsmann s2) {
        return Double.compare (s1.getScore(), s2.getScore());

        // Такая реализация будет работать не верно, при разнице очков меньше единицы.
       // return (int) (s1.getScore() - s2.getScore());
    }
}
