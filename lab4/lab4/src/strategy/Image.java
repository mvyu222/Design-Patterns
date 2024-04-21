package strategy;

import java.io.IOException;

public class Image {
    private String href;
    private ImageLoaderStrategy loaderStrategy;

    public Image(String href, ImageLoaderStrategy loaderStrategy) {
        this.href = href;
        this.loaderStrategy = loaderStrategy;
    }

    public void loadImage() {
        try {
            byte[] imageData = loaderStrategy.load(href);
            System.out.println("Image loaded successfully. Data length: " + imageData.length);
        } catch (IOException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }
}
