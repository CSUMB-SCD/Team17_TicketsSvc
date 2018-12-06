package cst438team17.ticketssvc.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cst438team17.ticketssvc.api.entities.ConcertTicket;
import cst438team17.ticketssvc.data.ConcertTicketsDBClient;

@Service
public class Manager {
    @Autowired
    ConcertTicketsDBClient concertTicketsDBClient;

    public List<ConcertTicket> getConcertTicketList() {
        return concertTicketsDBClient.getConcertTicketData();
    }
}
