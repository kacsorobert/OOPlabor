package labor10_5;

public class MatrixException extends Exception{
    String message;

    public MatrixException(String message) {
        super(message);
        this.message=message;
    }

    @Override
    public String toString() {
        return message;
    }
}
