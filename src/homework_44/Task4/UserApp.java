package homework_44.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserApp {
    public static void main(String[] args) {
        // Список пользователей
        List<User> users = new ArrayList<>(
                List.of(
                new User(1, "Anna", 25),
                new User(2, "Lew", 34),
                new User(3, "Viktor",38)

                )
        );

        //  Использования метода
        int searchId = 2;
        Optional<User> user = findUserById(users, searchId);

        if (user.isPresent()) {
            System.out.println("Найден пользователь: " + user.get());
        } else {
            System.out.println("Пользователь с id " + searchId + " не найден.");
        }
    }

    public static Optional<User> findUserById(List<User> users, int id) {
        return users.stream()
                .filter(user -> user.getId() == id) // Фильтруем по id
                .findFirst(); // Возвращаем первый найденный результат как Optional
    }
}

