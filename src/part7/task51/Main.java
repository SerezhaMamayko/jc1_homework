package part7.task51;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String path = "folder1/folder2/folder3";
        createDirectories(path);

        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            String fileName = "file" + i + ".txt";
            Path filePath = Paths.get(path, fileName);
            writeRandomNumbersToFile(filePath, rand);
        }

        List<Path> files = getAllFilesInDirectory(path);
        if (!files.isEmpty()) {
            Path allNumbersFile = Paths.get(path, "allNumbers.txt");
            writeAllNumbersToFile(allNumbersFile, files);

            Path fileListFile = Paths.get(path, "fileList.txt");
            writeAllFileNamesToFile(fileListFile, files);
        }
    }

    private static void createDirectories(String path) {
        try {
            Files.createDirectories(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeRandomNumbersToFile(Path filePath, Random rand) {
        try {
            List<Integer> numbers = rand.ints(10, 0, 100)
                    .boxed()
                    .collect(Collectors.toList());

            Files.write(filePath, numbers.stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Path> getAllFilesInDirectory(String path) {
        try {
            return Files.list(Paths.get(path))
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }

    private static void writeAllNumbersToFile(Path allNumbersFile, List<Path> files) {
        try {
            List<String> allNumbers = files.stream()
                    .filter(file -> !file.getFileName().toString().equals("allNumbers.txt"))
                    .flatMap(Main::readFileLines)
                    .collect(Collectors.toList());

            Files.write(allNumbersFile, allNumbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeAllFileNamesToFile(Path fileListFile, List<Path> files) {
        try {
            List<String> fileNames = files.stream()
                    .map(file -> file.getFileName().toString())
                    .collect(Collectors.toList());

            Files.write(fileListFile, fileNames);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Stream<String> readFileLines(Path filePath) {
        try {
            return Files.lines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Stream.empty();
    }
}
