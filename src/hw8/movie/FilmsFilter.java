package hw8.movie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class FilmsFilter {
    List<Film> filmsGenreByPrice = new ArrayList<>();
    List<Film> anotherFilmsGenreByPrice = new ArrayList<>();
    List<Film> allFilmsGenreByPrice = new ArrayList<>();
    Map<String, Double>  movieFilter = new HashMap<>();

    public void buildFilmsCollection() {
        filmsGenreByPrice.add(new Film("comedy", 120));
        filmsGenreByPrice.add(new Film("crime", 90));
        filmsGenreByPrice.add(new Film("drama", 300));
        filmsGenreByPrice.add(new Film("comedy", 115));
        filmsGenreByPrice.add(new Film("crime", 190));

        anotherFilmsGenreByPrice.add(new Film("drama", 98));
        anotherFilmsGenreByPrice.add(new Film("fantasy", 55));
        anotherFilmsGenreByPrice.add(new Film("comedy", 100));
        anotherFilmsGenreByPrice.add(new Film("fantasy", 220));
        anotherFilmsGenreByPrice.add(new Film("drama", 140));

    }

    public void addTwoCollection() {
        buildFilmsCollection();
        allFilmsGenreByPrice = Stream.concat(filmsGenreByPrice.stream(), anotherFilmsGenreByPrice.stream())
                .collect(Collectors.toList());
    }

    public void calculateAveragePrice() {
        movieFilter = allFilmsGenreByPrice.stream()
                .collect(Collectors.groupingBy(Film::getGenre,
                        Collectors.averagingDouble(Film::getTicketPrice)));
        movieFilter.forEach((genre, ticketPrice) -> System.out.println(genre + " genre: " + Math.round(ticketPrice) + " uah."));
        System.out.println();

    }

    public void countingFilmByGenre() {
        Map<String, Long> countFilmsForGenre = allFilmsGenreByPrice.stream()
                .collect(groupingBy(Film::getGenre, Collectors.counting()));

        countFilmsForGenre.forEach((genre, number) -> System.out.println(number + " films of " + genre + " genre."));

    }
}
