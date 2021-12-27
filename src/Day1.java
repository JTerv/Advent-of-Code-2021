import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Day1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fstream = new FileInputStream("inputs/day1input.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String previousString = "149";
        int countAmount = 0;

        for (String line = br.readLine(); line != null; line = br.readLine()) {
            if (line.compareTo(previousString) >= 1) {
                countAmount++;
            }
            previousString = line;
        }

        // Close the input stream
        fstream.close();

        System.out.println(countAmount);
    }
}
