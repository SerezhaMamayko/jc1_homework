package part6.task40;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomGrade = (int) (Math.random() * 11);
            grades.add(randomGrade);
        }
        System.out.println("Grades: " + grades);
        grades.removeIf(grade -> grade <= 3);
        System.out.println("Good grades: " + grades);
    }
}
