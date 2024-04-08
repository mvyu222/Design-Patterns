package adapter;

public interface Logger {
    void log(String message);
    void error(String message);
    void warn(String message);
}
