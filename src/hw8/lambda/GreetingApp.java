package hw8.lambda;

public class GreetingApp {

    public void outPhrase() {

        Supplier supplier = () -> "Hello everyone";
        System.out.println(supplier.get());
    }
}
