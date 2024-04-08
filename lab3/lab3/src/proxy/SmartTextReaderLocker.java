package proxy;

import java.io.IOException;
import java.util.regex.Pattern;

public class SmartTextReaderLocker implements TextReader {
    private TextReader reader;
    private Pattern pattern;

    public SmartTextReaderLocker(TextReader reader, String regex) {
        this.reader = reader;
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public String[][] readText(String filename) throws IOException {
        if (pattern.matcher(filename).matches()) {
            System.out.println("Access denied!");
            return new String[0][];
        }
        return reader.readText(filename);
    }
}