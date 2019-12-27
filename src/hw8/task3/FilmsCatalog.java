package hw8.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class FilmsCatalog {
    List<Film> firstFilmsCatalog = new ArrayList<>();
    List<Film> secondFilmsCatalog = new ArrayList<>();

    public void fillFilmsCollection() {
        firstFilmsCatalog.add(new Film("comedy", 120));
        firstFilmsCatalog.add(new Film("crime", 90));
        firstFilmsCatalog.add(new Film("drama", 300));
        firstFilmsCatalog.add(new Film("comedy", 115));
        firstFilmsCatalog.add(new Film("crime", 190));

        secondFilmsCatalog.add(new Film("drama", 98));
        secondFilmsCatalog.add(new Film("fantasy", 55));
        secondFilmsCatalog.add(new Film("comedy", 100));
        secondFilmsCatalog.add(new Film("fantasy", 220));
        secondFilmsCatalog.add(new Film("drama", 140));

    }

    public void calculateAveragePrice() {
        fillFilmsCollection();
        List<Film> allFilms = Stream.concat(firstFilmsCatalog.stream(), secondFilmsCatalog.stream())
                .collect(Collectors.toList());

        Map<String, Double> filmFilter = allFilms.stream()
                .collect(Collectors.groupingBy(Film::getGenre,
                        Collectors.averagingDouble(Film::getPrice)));

        filmFilter.forEach((genre, price) -> System.out.println(genre + " genre: " + Math.round(price) + " uah."));
        System.out.println();

        Map<String, Long> countFilmsForGenre = allFilms.stream()
                .collect(groupingBy(Film::getGenre, Collectors.counting()));

        countFilmsForGenre.forEach((genre, number) -> System.out.println(number + " films of " + genre + " genre."));

    }
}
