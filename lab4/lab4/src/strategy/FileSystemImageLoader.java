package strategy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileSystemImageLoader implements ImageLoaderStrategy {
    @Override
    public byte[] load(String filePath) throws IOException {
        File file = new File(filePath);
        if (file.exists()) {
            return Files.readAllBytes(file.toPath());
        } else {
            throw new IOException("File not found: " + filePath);
        }
    }
}