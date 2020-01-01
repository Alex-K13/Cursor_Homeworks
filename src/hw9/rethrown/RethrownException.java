package hw9.rethrown;

public class RethrownException {

    private void throwsRuntimeException() throws Exception {
        throw new Exception(" RuntimeException throw from my first method ");
    }

    private void callThrowsException() throws Exception {
        throwsRuntimeException();
    }

    public void throwsAllException() {
        try {
            new RethrownException().callThrowsException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
