import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day1 {
    public static void main(String[] args) throws Exception {

        List<String> list = Files.readAllLines(Paths.get("inputs/day1input.txt"), Charset.defaultCharset());

        // Start previousInt as the first number in the txt file
        int previousInt = Integer.parseInt(list.get(0));
        int countAmount = 0;

        for (int i = 0; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i)) > previousInt) {
                countAmount++;
            }
            previousInt = Integer.parseInt(list.get(i));
        }

        System.out.println(countAmount);
    }

}
