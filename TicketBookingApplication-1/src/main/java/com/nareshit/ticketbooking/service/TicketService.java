package com.nareshit.ticketbooking.service;


import com.nareshit.ticketbooking.dao.TicketDao;
import com.nareshit.ticketbooking.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public Ticket getByTicket(Integer ticketId)
    {
        return ticketDao.findById(ticketId).orElse(new Ticket());
    }
    //Delete ticket
    public void deleteTicket(Integer ticketId)
    {
        ticketDao.deleteById(ticketId);

    }
    //Update Ticket
    public Ticket updateTicket(Integer ticketId, String newEmail)
    {
        Ticket dbTicketObj = getByTicket(ticketId);
        dbTicketObj.setEmail(newEmail);
        return ticketDao.save(dbTicketObj);
    }
}
