package hw7;

import java.time.LocalDate;

public class AppExecutor {
    private Library library = new Library();

    public void runProgram() {
        library.createBooks();
        library.checkDate(LocalDate.of(2019, 10, 20));
        library.showDates();
        library.showBooks();
    }
}
