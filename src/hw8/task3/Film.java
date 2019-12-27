package hw8.task3;

public class Film {

    private double price;
    private String genre;

    double getPrice() {
        return (price);
    }

    public String getGenre() {
        return genre;
    }

    public Film(String genre, double price) {
        this.price = price;
        this.genre = genre;
    }
}
