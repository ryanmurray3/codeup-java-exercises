package grades;

public class StudentNotMadeRightException extends RuntimeException {
    public StudentNotMadeRightException(String msg) {
        super(msg);
    }
}

