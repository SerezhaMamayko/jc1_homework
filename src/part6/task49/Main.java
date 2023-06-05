package part6.task49;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String text = "In this text i want to be sure that i will get certificate from you please!!! 1, 1, 2, 3 ,4, 5";
        File file = new File("newFile.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
        List<Integer> num = sumFromFile();
        System.out.println("Числа: " + num);
        System.out.println("Сумма: " + num.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Числа без повторов: " + new LinkedHashSet<>(num));

    }
    static List <Integer> sumFromFile() throws NullPointerException {

        BufferedReader reader = null;
        List <Integer> num = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader("newFile.txt"));

            String S = null;

            while ((S = reader.readLine()) != null) {
                String [] SS = S.split("[\\\\/№;:а-яА-Яa-zA-Z?!,.\\-(){}\\[\\]@#\\$%^&?*~<>\\s]+");


                for(String S1:SS) {
                    if(S1.length()>0)
                        num.add(Integer.parseInt(S1));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return num;

    }
}