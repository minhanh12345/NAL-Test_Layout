import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'layout' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING character as parameter.
     */

    public static String layout(String character) {
        // Write your code here
        String result = "";
        String[] layout1 = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};
        String[] layout2 = {"a", "s", "d", "f", "g", "h", "j", "k", "l"};
        String[] layout3 = {"z", "x", "c", "v", "b", "n", "m"};
        String[][] layout = {layout1, layout2, layout3};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < layout[i].length; j++){
                if(layout[i][j].equals(character)){
                    int indexI=i+1;
                    int indexJ=j+1;
                    result=indexI+", "+indexJ;
                }
            }
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String character = bufferedReader.readLine();

        String result = Result.layout(character);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
