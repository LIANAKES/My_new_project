package lesson_42;

import java.util.*;

public class MapExample2 {

    public static void main(String[] args) {

        Map<Integer, String > mapColors = new HashMap<>();

        mapColors.put(1, "red");
        mapColors.put(16, "green");
        mapColors.put(5, "blue");

        System.out.println(mapColors);

        System.out.println("mapColor.containsKey(32): " + mapColors.containsKey(32));
        System.out.println("mapColor.containsValue(\"blue\"): " + mapColors.containsValue("blue"));

        String color = mapColors.get(16);
        System.out.println("color: " + color);
        System.out.println("mapColors.get(100): " + mapColors.get(100));

        String deletedValue = mapColors.remove(100);
        System.out.println("mapColors.remove(100): "  + deletedValue);

        deletedValue = mapColors.remove(5);
        System.out.println("mapColors.remove(5): " + deletedValue);
        System.out.println(mapColors);

        // void clear() - очищает карту
        // mapColors.clear();
        //System.out.println(mapColors);


        // boolean isEmpty() -вернет true, если карта пустая
        System.out.println(mapColors.isEmpty());

        mapColors.put(7, "yellow");
        mapColors.put(8, "white");
        mapColors.put(24, "white");
        System.out.println(mapColors);

        System.out.println("\n===========================\n");


        // Collection<V> values() - возвращает коллекцию из всех значений карты
        // Значения в карте могут повторяться. У разных ключей допускаются одинаковые значения
        Collection<String> values = mapColors.values();
        System.out.println("values.size(): " + values.size());
        System.out.println("values: " +values);

        // Set<K> keySet - возвращает set, состоящий из всех ключей карты
        Set<Integer> keysSet = mapColors.keySet();
        System.out.println("keySet: " + keysSet);
        // Могу перебрать все ключи в цикле - получить значение для каждого ключа
        for (Integer key: keysSet){
            System.out.print(key+ ": " + mapColors.get(key) + "; ");
        }
        System.out.println();

        // Фокус. Между keysSet - map -> "живая" связь. Удяляя ключ из keysSet - из map тоже удаляется соответствующая пара ключ - значений
        keysSet.remove(7);
        System.out.println(keysSet);
        System.out.println(mapColors);

        // Между values и  map - тоже живая связь.
        values.remove("red");
        System.out.println(values);
        System.out.println(mapColors);

        // Todo Entry +replace

        // Map.Entry<K, V> -

        // Set<Map.Entry<K, V> entrySet -
        //

        System.out.println(mapColors);

        System.out.println("\n==============================\n");

        Set<Map.Entry<Integer, String>> entrySet = mapColors.entrySet();
        System.out.println("entrySet(): " + entrySet);

        System.out.println("\n==============================\n");

        for (Map.Entry<Integer, String> entry : mapColors.entrySet()) {
            System.out.print("entry.getKey(): " + entry.getKey());
            System.out.print(" -> ");
            System.out.println("entry.getValue(): " + entry.getValue());
            if (entry.getKey().equals(8)){
                entry.setValue("JAVA!");

            }
        }

        System.out.println("\n===============================\n");

        System.out.println(mapColors);

        mapColors.put(10, "red"); // put -
        mapColors.put(10, "yellow"); // put -

        // V replace vs put
        mapColors.replace(11, "blue"); // replace -
        mapColors.replace(10, "purple"); // replace -


        System.out.println(mapColors);

        //
        mapColors.forEach((key, val) ->System.out.println("key: " + key + ", value: " + val));

        System.out.println("\n===============================\n");

        mapColors.forEach((k, v) -> {
                    System.out.println("Itaration: ");
                    System.out.println("key: " + k + ", value: " + v);
                    System.out.println("\n===============================\n");
                }
            );

    }
}
