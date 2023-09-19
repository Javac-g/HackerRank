import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static String justifyString(String str) {
        int spacesToAdd = 15 - str.length();
        String padding = IntStream.range(0, spacesToAdd)
                .mapToObj(i -> " ")
                .collect(Collectors.joining());
        return str + padding;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            String x = sc.next();
            
            x = String.format("%03d", Integer.parseInt(x));
            
            String ans = justifyString(str) + x;
            System.out.println(ans);
        }
        System.out.println("================================");
    }
}
