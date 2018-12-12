package cst438team17.ticketssvc.api.entities;

public class ConcertTicket {
    private String id;
    private String artist;
    private String date;
    private String venue;
    private int quantity;
    private int stock;
    private int price;
    private String description;
    // private Artist artist;
    // private Date date;
    // private Venue venue;
    // private int numberOfTickets;

    public ConcertTicket(String artist, String date, String venue, int quantity, int stock, int price, String description) {
        this.artist = artist;
        this.date = date;
        this.venue = venue;
        this.stock = stock;
        this.price = price;
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setArtist (String artist) {
        this.artist = artist;
    }

    public String getArtist () {
        return artist;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setVenue (String venue) {
        this.venue = venue;
    }

    public String getVenue() {
        return venue;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setNumberOfTickets (int numberOfTickets) {
        this.stock = numberOfTickets;
    }

    public int getNumberOfTickets() {
        return stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }
}