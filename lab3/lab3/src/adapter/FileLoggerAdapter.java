package adapter;

public class FileLoggerAdapter implements Logger {
    private final FileWriter fileWriter;

    public FileLoggerAdapter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Override
    public void log(String message) {
        fileWriter.write("[LOG] " + message);
    }

    @Override
    public void error(String message) {
        fileWriter.writeLine("[ERROR] " + message);
    }

    @Override
    public void warn(String message) {
        fileWriter.writeLine("[WARN] " + message);
    }
}