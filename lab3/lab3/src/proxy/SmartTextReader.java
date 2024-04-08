package proxy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SmartTextReader implements TextReader {
    @Override
    public String[][] readText(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder text = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            text.append(line).append("\n");
        }
        reader.close();

        String[] lines = text.toString().split("\n");
        String[][] result = new String[lines.length][];
        for (int i = 0; i < lines.length; i++) {
            result[i] = lines[i].split("");
        }
        return result;
    }
}