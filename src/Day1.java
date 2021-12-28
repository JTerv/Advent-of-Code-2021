import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day1 {
    public static void main(String[] args) throws Exception {

        List<String> list = Files.readAllLines(Paths.get("inputs/day1input.txt"), Charset.defaultCharset());

        // Start previousInt as the first number in the txt file
        int previousInt = Integer.parseInt(list.get(0));
        int part1Count = 0;
        int part2Count = 0;

        int measureWindow = 3;
        int rollingCurrTotalValue = 0;
        int rollingPrevTotalValue = Integer.parseInt(list.get(0)) + Integer.parseInt(list.get(1)) + Integer.parseInt(list.get(2));
        //int rollingPrevTotalValue = 0;

        for (int i = 0; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i)) > previousInt) {
                part1Count++;
            }
            previousInt = Integer.parseInt(list.get(i));

            rollingCurrTotalValue = 0;
            try {
                for (int j = i; j < i + measureWindow; j++) {
                    //System.out.println("VALUES: " + list.get(j));
                    rollingCurrTotalValue = rollingCurrTotalValue + Integer.parseInt(list.get(j));
                }
            } catch (Exception e) {
                rollingCurrTotalValue = 0;
            }

            System.out.println("TOTAL VALUE: " + rollingCurrTotalValue);

            if (rollingCurrTotalValue > rollingPrevTotalValue) {
                part2Count++;
            }
            rollingPrevTotalValue = rollingCurrTotalValue;

        }

        System.out.println("Part 1 answer: " + part1Count);
        System.out.println("Part 2 answer: " + part2Count);
    }

}
