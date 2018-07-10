import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * emoji data generate and test
 *
 * @author xuxueli 2018-07-10 21:17:36
 */
public class DemojiDataTest {

    public static void main(String[] args) {
        List<String> readFileLines = readLines();
    }


    public static List<String> readLines(){
        BufferedReader reader = null;
        try {
            List<String> lines = new ArrayList<>();
            reader = new BufferedReader(new InputStreamReader(DemojiDataTest.class.getResourceAsStream("emoji-ordering.txt"), "utf-8"));
            if (reader != null) {
                StringBuilder sb = new StringBuilder();
                String line = null;
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
                return lines;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


}
