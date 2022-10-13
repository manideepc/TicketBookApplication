package com.nareshit.ticketbooking.service;


import com.nareshit.ticketbooking.dao.TicketDao;
import com.nareshit.ticketbooking.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/*

It adds capabilities of service layer like Logging,Txn Management
 */
public class TicketService {

    /*
    CRUD
     */
    @Autowired
    private TicketDao ticketDao;   // --> TicketDao ticketDao = new TicketDao();


    //GetAllTickets
    public Iterable<Ticket> getAllTickets(){
        return ticketDao.findAll();
        //findAll --> select * from tbl_ticket
    }
    public Ticket createTicket(Ticket ticket)
    {
        return ticketDao.save(ticket);
        /*
        Save method will insert and Update the Database.
         */
    }
}
