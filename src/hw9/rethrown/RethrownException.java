package hw9.rethrown;

public class RethrownException {

    private void throwsException() throws Exception {
        throw new Exception("Exception was thrown ");
    }

    private void callThrowsException() throws Exception {
        throwsException();
    }

    public void throwsAllException() {
        try {
            new RethrownException().callThrowsException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
