package part7.task52;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Thomas", "Tyler", "Federico", "Patrick", "Paulo", "Lexus", "Madison", "Dillon", "Ryan", "William"};
        String[] surnames = {"Beverly", "Collins", "Daniels", "Evans", "Ford", "Gilmore", "Harris", "Holmes", "Liebert", "Newman"};
        Random rand = new Random();
        Person[] persons = new Person[10];
        for (int i = 0; i < 10; i++) {
            String name = names[rand.nextInt(names.length)];
            String surname = surnames[rand.nextInt(surnames.length)];
            int age = rand.nextInt(100);
            persons[i] = new Person(name, surname, age);
        }

        File file = new File("persons.txt");
        try (FileWriter writer = new FileWriter(file)) {
            for (Person person : persons) {
                writer.write(person.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
