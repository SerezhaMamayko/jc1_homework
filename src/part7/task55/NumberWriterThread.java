package part7.task55;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumberWriterThread extends Thread {
    private final String fileName;

    public NumberWriterThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try (FileWriter writer = new FileWriter(fileName)) {
            Random random = new Random();
            int[] numbers = new int[10];

            for (int i = 0; i < 10; i++) {
                numbers[i] = random.nextInt(100);
            }

            for (int number : numbers) {
                writer.write(number + "\n");
            }
            System.out.println("Thread " + this.getName() + " wrote numbers to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
