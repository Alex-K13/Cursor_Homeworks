package hw7;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<LocalDate, String> dateToBookName = new HashMap<>();

    public void createDateToBookName() {
        dateToBookName.put(LocalDate.of(2019, 10, 19), "INNER ENGINEERING");
        dateToBookName.put(LocalDate.of(2019, 10, 29), "OMGIVEN AV IDIOTS");
        dateToBookName.put(LocalDate.of(2019, 11, 9), "ECONOMICS ");
        dateToBookName.put(LocalDate.of(2019, 11, 19), "21 LESSONS FOR THE 21st CENTURY");
        dateToBookName.put(LocalDate.of(2019, 11, 29), "HOW TO MANAGE YOUR SLAVES");
    }

    public void checkDate(LocalDate date) {
        if (dateToBookName.containsKey(date)) {
            String book = dateToBookName.get(date);
            System.out.println("Tittle of this book: " + book);
        } else {
            System.out.println("There are no dateToBookName for this date");
        }
    }

    public void showDates() {
        for (LocalDate dates : dateToBookName.keySet()) {
            System.out.println(dates);
        }
    }

    public void showDateToBookName() {
        for (String title : dateToBookName.values()) {
            System.out.println(title);
        }
    }
}
