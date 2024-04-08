package proxy;

import java.io.IOException;

public class SmartTextChecker implements TextReader {
    private SmartTextReader reader;

    public SmartTextChecker() {
        this.reader = new SmartTextReader();
    }

    @Override
    public String[][] readText(String filename) throws IOException {
        System.out.println("Opening file: " + filename);
        String[][] text = reader.readText(filename);
        System.out.println("Successfully read file: " + filename);
        System.out.println("Total lines: " + text.length);
        int totalChars = 0;
        for (String[] line : text) {
            totalChars += line.length;
        }
        System.out.println("Total characters: " + totalChars);
        System.out.println("Closing file: " + filename);
        return text;
    }
}
