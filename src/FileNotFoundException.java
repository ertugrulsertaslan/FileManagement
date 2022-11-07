public class FileNotFoundException extends Exception{

    private final String errorCode;

    public FileNotFoundException(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

}