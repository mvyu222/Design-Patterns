package proxy;

import java.io.IOException;

public interface TextReader {
    String[][] readText(String filename) throws IOException;
}