package hw7;

import java.time.LocalDate;

public class AppExecutor {
    private Library library = new Library();

    public void runProgram() {
        library.createDateToBookName();
        library.checkDate(LocalDate.of(2019, 10, 20));
        library.showDates();
        library.showDateToBookName();
    }
}
