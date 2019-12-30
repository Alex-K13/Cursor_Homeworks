package hw8.lambda;

public class LambdaApp {

    public void outPhrase() {

        Supplier supplier = () -> "Hello everyone";
        System.out.println(supplier.get());
    }
}
