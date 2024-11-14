package homework_46;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Task2 {
    public static long calculateDaysBetweenEarliestAndLatest(List<LocalDate> dates) {
        // Находим самую раннюю и самую позднюю дату
        LocalDate earliest = dates.stream().min(LocalDate::compareTo).orElseThrow();
        LocalDate latest = dates.stream().max(LocalDate::compareTo).orElseThrow();


        return earliest.until(latest, ChronoUnit.DAYS);
    }

    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2022, 2, 22),
                LocalDate.of(2023, 3, 23),
                LocalDate.of(2024, 4, 24)
        );


        System.out.println("Список дат:");
        dates.forEach(date -> System.out.println(" - " + date));

        // Подсчёт количества дней
        long daysBetween = calculateDaysBetweenEarliestAndLatest(dates);
        System.out.println("\nКоличество дней между самой ранней и самой поздней датами: " + daysBetween);
    }
}

