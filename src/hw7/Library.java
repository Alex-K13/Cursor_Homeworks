package hw7;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<LocalDate, String> books = new HashMap<>();

    public void createBooks() {
        books.put(LocalDate.of(2019, 10, 19), "INNER ENGINEERING");
        books.put(LocalDate.of(2019, 10, 29), "OMGIVEN AV IDIOTS");
        books.put(LocalDate.of(2019, 11, 9), "ECONOMICS ");
        books.put(LocalDate.of(2019, 11, 19), "21 LESSONS FOR THE 21st CENTURY");
        books.put(LocalDate.of(2019, 11, 29), "HOW TO MANAGE YOUR SLAVES");
    }

    public void checkDate(LocalDate date) {
        if (books.get(date) != null) {
            String book = books.get(date);
            System.out.println("Tittle of this book: " + book);
        } else {
            System.out.println("There are no books for this date");
        }
    }

    public void showDates() {
        for (LocalDate dates : books.keySet()) {
            System.out.println(dates);
        }
    }

    public void showBooks() {
        for (String title : books.values()) {
            System.out.println(title);
        }
    }
}
