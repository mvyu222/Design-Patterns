package bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void render(String shape) {
        System.out.println("Drawing " + shape + " as raster graphics");
    }
}