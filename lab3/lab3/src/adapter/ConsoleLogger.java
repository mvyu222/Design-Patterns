package adapter;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("\u001B[32m" + "[LOG] " + message + "\u001B[0m");
    }

    @Override
    public void error(String message) {
        System.out.println("\u001B[31m" + "[ERROR] " + message + "\u001B[0m");
    }

    @Override
    public void warn(String message) {
        System.out.println("\u001B[33m" + "[WARN] " + message + "\u001B[0m");
    }
}
