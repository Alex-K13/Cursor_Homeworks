package hw8.movie;

public class Film {
    private double price;
    private String genre;

    Film(String genre, double price) {
        this.price = price;
        this.genre = genre;
    }

    double getPrice() {
        return (price);
    }

    public String getGenre() {
        return genre;
    }
}
