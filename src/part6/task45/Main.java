package part6.task45;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input grade from 0 to 10");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        try {
            exceptionGrades(grade);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void exceptionGrades (int grade) throws CustomException {
        if (grade < 0 || grade > 10 ){
            throw new CustomException("Incorrect grade");
        } else {
            System.out.println("Correct grade");
        }
    }
}
