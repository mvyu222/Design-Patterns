package flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextHelper {
    public static List<String> splitTextIntoLines(String text) {
        return new ArrayList<>(Arrays.asList(text.split("\n")));
    }

    public static String determineElementType(String line) {
        if (line.length() < 20) {
            return "h2";
        } else if (line.startsWith(" ")) {
            return "blockquote";
        } else {
            return "p";
        }
    }
}