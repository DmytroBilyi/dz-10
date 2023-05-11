package exceprions;

public class WrongOperationException extends Exception{
    public WrongOperationException(String message) {
        super(message);
    }
}