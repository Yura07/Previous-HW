package task2;

public class RegistrationExeption extends Exception {
    public RegistrationExeption() {
    }

    public RegistrationExeption(String message) {
        super(message);
    }

    public RegistrationExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public RegistrationExeption(Throwable cause) {
        super(cause);
    }

    public RegistrationExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
