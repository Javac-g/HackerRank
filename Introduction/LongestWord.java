import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;

class LongestWord {
    public static String LongestWord(String sen) {
        String regex = "[^a-zA-Z0-9\\s]";
        return Arrays.stream(sen.split(" "))
                .map(word -> word.replaceAll(regex, ""))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
}
