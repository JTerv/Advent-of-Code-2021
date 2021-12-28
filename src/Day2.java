import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day2 {
    public static void main(String[] args) throws Exception {

        List<String> list = Files.readAllLines(Paths.get("inputs/day2input.txt"), Charset.defaultCharset());

        int totalForwards = 0;
        int totalUp = 0;

/*         System.out.println(firstHalfString("down", list, 5));
        System.out.println(secondHalfString(list, 0)); */



         for (int i = 0; i < list.size(); i++) {
            if (firstHalfString("forward", list, i)) {
                totalForwards = totalForwards + secondHalfString(list, i);
            } else if (firstHalfString("down", list, i)) {
                totalUp = totalUp + secondHalfString(list, i);
            } else {
                totalUp = totalUp - secondHalfString(list, i);
            }
        }

        System.out.println("Total forwards: " + totalForwards);
        System.out.println("Total depth: " + totalUp);
        System.out.println("Multiplied: " + totalUp * totalForwards);

    }

    public static boolean firstHalfString (String testString, List<String> list, int i) {
        return testString.equals(list.get(i).substring(0, list.get(i).indexOf(" ")));
    }

    public static int secondHalfString (List<String> list, int i) {
        return Integer.parseInt(list.get(i).substring(list.get(i).indexOf(" ") + 1, list.get(i).length()));
    }


}
