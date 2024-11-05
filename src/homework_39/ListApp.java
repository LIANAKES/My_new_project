package homework_39;

import java.util.Arrays;
import java.util.List;

public class ListApp  {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50, 60);
        List<Integer> list2 = Arrays.asList(20, 30, 40, 50);

        // Вызов метода для нахождения общих элементов
        List<Integer> commonElements = CollectionUtils.getCommonElements(list1, list2);


        System.out.println("Общие элементы: " + commonElements);
    }
}
