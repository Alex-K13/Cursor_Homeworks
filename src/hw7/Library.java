package hw7;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<LocalDate, String> booksList = new HashMap<>();

    public void fillingBooks() {
        booksList.put(LocalDate.of(2019, 10, 19), "INNER ENGINEERING");
        booksList.put(LocalDate.of(2019, 10, 29), "OMGIVEN AV IDIOTS");
        booksList.put(LocalDate.of(2019, 11, 9), "ECONOMICS ");
        booksList.put(LocalDate.of(2019, 11, 19), "21 LESSONS FOR THE 21st CENTURY");
        booksList.put(LocalDate.of(2019, 11, 29), "HOW TO MANAGE YOUR SLAVES");
    }

    public void checkBook(LocalDate date) {
        if (booksList.get(date) != null) {
            String book = booksList.get(date);
            System.out.println("Tittle of this book: " + book);
        } else {
            System.out.println("There are no books for this date");
        }
    }

    public void showDates() {
        for (LocalDate date : booksList.keySet()) {
            System.out.println(date);
        }
    }

    public void showTittle() {
        for (String tittle : booksList.values()) {
            System.out.println(tittle);
        }
    }
}
