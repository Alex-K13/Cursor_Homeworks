package hw8.movie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class FilmsFilter {
    List<Film> filmsCatalog1 = new ArrayList<>();
    List<Film> filmsCatalog2 = new ArrayList<>();
    List<Film> allFilms = new ArrayList<>();
    Map<String, Double> filmFilter = new HashMap<>();

    public void buildFilmsCollection() {
        filmsCatalog1.add(new Film("comedy", 120));
        filmsCatalog1.add(new Film("crime", 90));
        filmsCatalog1.add(new Film("drama", 300));
        filmsCatalog1.add(new Film("comedy", 115));
        filmsCatalog1.add(new Film("crime", 190));

        filmsCatalog2.add(new Film("drama", 98));
        filmsCatalog2.add(new Film("fantasy", 55));
        filmsCatalog2.add(new Film("comedy", 100));
        filmsCatalog2.add(new Film("fantasy", 220));
        filmsCatalog2.add(new Film("drama", 140));

    }

    public void addTwoCollection() {
        buildFilmsCollection();
        allFilms = Stream.concat(filmsCatalog1.stream(), filmsCatalog2.stream())
                .collect(Collectors.toList());
    }

    public void calculateAveragePrice() {
        filmFilter = allFilms.stream()
                .collect(Collectors.groupingBy(Film::getGenre,
                        Collectors.averagingDouble(Film::getTicketPrice)));
        filmFilter.forEach((genre, ticketPrice) -> System.out.println(genre + " genre: " + Math.round(ticketPrice) + " uah."));
        System.out.println();

    }

    public void countingFilmByGenre() {
        Map<String, Long> countFilmsForGenre = allFilms.stream()
                .collect(groupingBy(Film::getGenre, Collectors.counting()));

        countFilmsForGenre.forEach((genre, number) -> System.out.println(number + " films of " + genre + " genre."));

    }
}
