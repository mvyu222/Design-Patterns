public class Authenticator {
    private static Authenticator instance;
    String value;

    Authenticator(String value) {
        this.value = value;
    }

    static Authenticator getInstance(String value) {
        if (instance == null) {
            instance = new Authenticator(value);
        }
        return instance;
    }


}
