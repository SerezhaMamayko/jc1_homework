package part6.task50;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            Random random = new Random();

            FileOutputStream fos = new FileOutputStream("numbers.bin");

            for (int i = 0; i < 20; i++) {
                int number = random.nextInt(100);
                fos.write(number);
            }

            fos.close();

            System.out.println("Файл успешно записан.");

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try {

            FileInputStream fis = new FileInputStream("numbers.bin");

            int sum = 0;
            int count = 0;

            int value;
            while ((value = fis.read()) != -1) {
                System.out.println(value);
                sum += value;
                count++;
            }

            fis.close();

            double average = (double) sum / count;
            System.out.println("Среднее арифметическое: " + average);

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
