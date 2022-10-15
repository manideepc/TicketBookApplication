package com.nareshit.ticketbooking;

import com.nareshit.ticketbooking.model.Ticket;
import com.nareshit.ticketbooking.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TicketBookingApplication1Application implements CommandLineRunner {


	@Autowired
	private TicketService ticketService;
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket ticket = new Ticket();
		ticket.setEmail("test123@gmail.com");
		ticket.setTicketId(1);
		ticket.setDestinationStation("Karimnagar");
		ticket.setSourceStation("Bengaluru");
		ticket.setTravelDate(new Date());
		ticket.setPassengerName("Generic Guy");

		ticketService.createTicket(ticket);

	}
}
