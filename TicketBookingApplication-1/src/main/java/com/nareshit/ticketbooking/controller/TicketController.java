package com.nareshit.ticketbooking.controller;


import com.nareshit.ticketbooking.model.Ticket;
import com.nareshit.ticketbooking.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/tickets") //http://localhost:8080/tickets
public class TicketController {

    @Autowired
    TicketService ticketService;


    @GetMapping(value="/all")
    //http://localhost:8080/tickets/all
    public Iterable<Ticket>getAllTickets(){
        return ticketService.getAllTickets();
    }

    //Create Ticket
    @PostMapping(value="/create")
    //http://localhost:8080/tickets/create
    public Ticket createTicket(@RequestBody Ticket ticketObj)
    {

            return ticketService.createTicket(ticketObj);
    }

    //Get a Individual Ticket
    @GetMapping(value="/{ticketId}")
    //http://localhost:8080/tickets/{ticketId}
    public Ticket getByTicketId(@PathVariable("ticketId") Integer ticketId)
    {
        return ticketService.getByTicket(ticketId);
    }
    //Delete by TicketId
    @DeleteMapping(value="/{ticketId}")
    // http://localhost:8080/tickets/1
    public void deleteByTicketId(@PathVariable("ticketId") Integer ticketId)
    {
        ticketService.deleteTicket(ticketId);
    }

    //Update by Email address
    @PutMapping(value="/{ticketId}/{email}")
    //http://localhost:8080/tickets/1/manideep@gmail.com
    public Ticket updateTicket( @PathVariable("ticketId") Integer ticketId,
                                @PathVariable("email") String email)
    {
        return ticketService.updateTicket(ticketId,email);
    }


}
