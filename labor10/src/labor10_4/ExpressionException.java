package labor10_4;

public class ExpressionException extends Exception{
    String message;

    public ExpressionException(String message){
        super(message);
        this.message=message;
    }

    @Override
    public String toString() {
        return "\t" + message;
    }
}
