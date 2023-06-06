package part7.task55;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String fileName = "file" + i + ".txt";
            NumberWriterThread thread = new NumberWriterThread(fileName);
            thread.start();
        }
    }
}
