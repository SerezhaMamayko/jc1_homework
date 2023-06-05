package part6.task42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomGrade = (int) (Math.random() * 11);
            grades.add(randomGrade);
        }
        System.out.println("Grades: " + grades);
        System.out.println("Highest grade: " + Collections.max(grades));
    }
}
