public class CustomException extends Exception {

    private String detail;

    public CustomException(String message) {

        super(message);

        this.detail = message;
    }

    public void printStoredString() {
        System.out.println("Custom print method -> Stored detail is: '" + this.detail + "'");
    }
}
