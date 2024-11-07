package homework_40;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.addAll(set2); // Добавляем все элементы второго множества
        return result;
    }
    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2); // Оставляем только общие элементы
        return result;
    }
    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2); // Удаляем все элементы второго множества
        return result;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println("Объединение: " + Task2.union(set1, set2));
        System.out.println("Пересечение: " + Task2.intersection(set1, set2));
        System.out.println("Разность: " + Task2.difference(set1, set2));
    }
    }

