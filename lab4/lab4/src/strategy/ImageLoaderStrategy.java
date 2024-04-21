package strategy;

import java.io.IOException;

public interface ImageLoaderStrategy {
    byte[] load(String source) throws IOException;
}
