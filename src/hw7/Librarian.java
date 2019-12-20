package hw7;

import java.time.LocalDate;

public class Librarian {
    private Library library = new Library();

    public void start() {
        library.fillingBooks();
        library.checkBook(LocalDate.of(2019, 10, 20));
        library.showDates();
        library.showTittle();
    }
}
