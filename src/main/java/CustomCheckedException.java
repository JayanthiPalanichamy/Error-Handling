import java.nio.file.FileAlreadyExistsException;

class CustomCheckedException extends Exception {

    CustomCheckedException()  {
        super();
    }

    CustomCheckedException(String message) {
        super(message);
    }

}
