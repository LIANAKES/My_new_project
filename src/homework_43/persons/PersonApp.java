package homework_43.persons;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonApp {

    /*
Task 3
Дан список Person с полями name, age, city.

Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе,
а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */

        public static void main(String[] args) {

        }

        public static List<Person> getPersonsList(List<Person> persons, int minAge, String city) {
            return  persons.stream()
                    .filter(person -> person.getAge() > minAge)
                    //.filter(p -> p.getCity() == city) // Строки на равенство не сравниваем ==, только equals
                    //.filter(per -> per.getCity().equals(city))
                    .filter(p -> Objects.equals(city, p.getCity())) // безопасно даже при наличии null значений
                    .collect(Collectors.toList());
        }
    }

