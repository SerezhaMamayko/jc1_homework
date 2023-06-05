package part6.task44;

public class Main {
    public static void main(String[] args) {
        String exception = null;
        try {
            int length = exception.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
