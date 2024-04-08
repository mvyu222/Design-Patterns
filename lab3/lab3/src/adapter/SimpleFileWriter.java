package adapter;

public class SimpleFileWriter implements FileWriter {
    @Override
    public void write(String text) {
        System.out.println("Writing to file: " + text);
    }

    @Override
    public void writeLine(String text) {
        System.out.println("Writing to file (new line): " + text);
    }
}