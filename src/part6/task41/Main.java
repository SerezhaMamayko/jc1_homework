package part6.task41;

import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomListNumber = (int) (Math.random() * 11);
            list.add(randomListNumber);
        }
        System.out.println("List: " + list);
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("Without same: " + list);
    }
}
