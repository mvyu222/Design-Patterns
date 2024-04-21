package strategy;

import java.io.IOException;
import java.net.URL;

public class NetworkImageLoader implements ImageLoaderStrategy {
    @Override
    public byte[] load(String url) throws IOException {
        URL urlObject = new URL(url);
        return urlObject.openStream().readAllBytes();
    }
}