package wordcount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author kband
 */
public class WordCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String line;
        String delimeter = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/kband/NetBeansProjects/WordCount/src/wordcount/newfile"));
            while ((line = reader.readLine()) != null) {

                for (String s : line.split("\\s+")) {

                    if (!map.containsKey(s)) {
                        map.put(s, 1);
                    } else {
                        int count = map.get(s);
                        map.put(s, count + 1);
                    }
                }
            }
            map.forEach((k, v) -> System.out.println(k + ", " + v));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
