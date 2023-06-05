package part6.task47;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) throws NullPointerException {
        File file = new File("src");
        String[] listOfFiles = file.list();
        List<String> fileNames = new ArrayList<>();
        List<String> directoryNames = new ArrayList<>();


        for (String name : listOfFiles) {
            if (!new File(file, name).isDirectory()) {
                fileNames.add(name);
            } else {
                directoryNames.add(name);
            }
        }
        System.out.println("Файлы: ");
        fileNames.forEach(System.out::println);

        System.out.println("Директории: ");
        directoryNames.forEach(System.out::println);
        }
    }

