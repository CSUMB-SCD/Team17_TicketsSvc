package cst438team17.ticketssvc.api.entities;

public class Venue {
    private String name;

    public Venue (String name) {
        this.name = name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}