package cst438team17.ticketssvc.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import cst438team17.ticketssvc.api.entities.ConcertTicket;

import cst438team17.ticketssvc.business.Manager;

@RestController
public class TicketsSvcController {

    @Autowired
    Manager manager;

    @GetMapping ("/ConcertTickets")
    @ResponseBody
    List<ConcertTicket> getConcertTickets() {
        //This is where you call the TicketsDBSvc/getAll
        List<ConcertTicket> result = manager.getConcertTicketList();
        return result;
    }
}