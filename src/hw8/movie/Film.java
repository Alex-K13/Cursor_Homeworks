package hw8.movie;

public class Film {
    private double ticketPrice;
    private String genre;

    Film(String genre, double ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.genre = genre;
    }

    double getTicketPrice() {
        return (ticketPrice);
    }

    public String getGenre() {
        return genre;
    }
}
