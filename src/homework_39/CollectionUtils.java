package homework_39;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtils {
    public static List<Integer> getCommonElements(List<Integer> list1, List<Integer> list2) {
        // Создаем копию первого списка, чтобы не изменять его
        List<Integer> commonElements = new ArrayList<>(list1);

        // Оставляем только те элементы, которые также присутствуют в list2
        commonElements.retainAll(list2);

        // Возвращаем новый список, содержащий общие элементы
        return commonElements;
    }
}


