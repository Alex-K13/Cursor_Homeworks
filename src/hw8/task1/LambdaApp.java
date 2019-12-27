package hw8.task1;

public class LambdaApp {

    public void outPhrase() {

        Supplier supplier = () -> "Hello everyone";
        System.out.println(supplier.get());
    }
}
