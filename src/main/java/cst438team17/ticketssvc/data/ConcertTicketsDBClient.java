package cst438team17.ticketssvc.data;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import cst438team17.ticketssvc.api.entities.ConcertTicket;

@Repository
public class ConcertTicketsDBClient {
    // TO-DO figure out how to call the database
    public List<ConcertTicket> getConcertTicketData() {
        final String uri = "https://team17-ticketsdb.herokuapp.com/allTickets";
        RestTemplate rt = new RestTemplate();
        return rt.getForObject(uri, List.class);
    }

}