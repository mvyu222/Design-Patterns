package bridge;

public class VectorRenderer implements Renderer {
    @Override
    public void render(String shape) {
        System.out.println("Drawing " + shape + " as vector graphics");
    }
}