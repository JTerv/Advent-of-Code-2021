import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day3Part1 {
    public static void main(String[] args) throws Exception {

        List<String> list = Files.readAllLines(Paths.get("inputs/day3input.txt"), Charset.defaultCharset());

        int onesCount = 0;
        int zeroesCount = 0;

        String gammaString = "";
        String epsilonString = "";


        for (int j = 0; j < list.get(0).length(); j++) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).charAt(j) == '1') {
                    onesCount++;
                } else {
                    zeroesCount++;
                }

            }
            if (onesCount > zeroesCount) {
                gammaString = gammaString + '1';
                epsilonString = epsilonString + '0';
            } else {
                gammaString = gammaString + '0';
                epsilonString = epsilonString + '1';

            }

            onesCount = 0;
            zeroesCount = 0;

        }

        System.out.println("Gamma string: " + Integer.parseInt(gammaString, 2));
        System.out.println("Epsilon string: " + Integer.parseInt(epsilonString, 2));
        
        System.out.println("Power consumption: " + Integer.parseInt(gammaString, 2) * Integer.parseInt(epsilonString, 2));

    }
}
