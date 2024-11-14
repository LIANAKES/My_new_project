package homework_46;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task1 {

    public static void main(String[] args) {

        // Текущая дата
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);

        // Текущий год, месяц и день
        System.out.println("год: " + currentDate.getYear() + "; месяц: " + currentDate.getMonthValue() + "; день: " + currentDate.getDayOfMonth() );

        // Дата дня рождения
        LocalDate birthday = LocalDate.of(1983, 12, 24);
        System.out.println("День рождения: " + birthday);

        // Проверка на равенство двух дат
        LocalDate date = LocalDate.of(2023, 11, 15);
        LocalDate date1 = LocalDate.of(2024, 11, 15);
        System.out.println("Даты равны? " + date.equals(date1));

        // Текущее время
        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);

        // Текущее время + 3 часа
        System.out.println("Текущее время + 3 часа: " + currentTime.plusHours(3));

        // Дата на неделю позже сегодняшней
        System.out.println("Дата на неделю позже: " + currentDate.plusWeeks(1));

        // Дата на год раньше сегодняшней
        System.out.println("Дата на год раньше: " + currentDate.minus(1, ChronoUnit.YEARS));

        // Дата на год позже сегодняшней
        System.out.println("Дата на год позже: " + currentDate.plus(1, ChronoUnit.YEARS));

        // Tomorrow и Yesterday
        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate yesterday = currentDate.minusDays(1);
        System.out.println("Завтра (" + tomorrow + ") после сегодняшнего дня? " + tomorrow.isAfter(currentDate));
        System.out.println("Вчера (" + yesterday + ") до сегодняшнего дня? " + yesterday.isBefore(currentDate));
    }
}
