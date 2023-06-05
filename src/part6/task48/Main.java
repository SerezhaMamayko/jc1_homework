package part6.task48;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String PUNCTUATION_REGEX = "[,.!?;:]";
    private static final String WORD_REGEX = "\\w+";
    public static void main(String[] args) throws IOException {
        String text = "In this text i want to be sure that i will get certificate from you please!!!";
        File file = new File("file.txt");
        try (FileWriter fileWriter = new FileWriter(file)){
        fileWriter.write(text);
        }


            String content = new String(Files.readAllBytes(Paths.get("file.txt")));
            int punctuationCount = 0;
            Pattern punctuationPattern = Pattern.compile(PUNCTUATION_REGEX);
            Matcher punctuationMatcher = punctuationPattern.matcher(content);
            while (punctuationMatcher.find()) {
                punctuationCount++;
            }

            int wordCount = 0;
            Pattern wordPattern = Pattern.compile(WORD_REGEX);
            Matcher wordMatcher = wordPattern.matcher(content);
            while (wordMatcher.find()) {
                wordCount++;
            }

            System.out.println("Знаков препинания: "+ punctuationCount);
            System.out.println("Слов: "+ wordCount);

    }
}
