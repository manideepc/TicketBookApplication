package com.nareshit.ticketbooking.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  //Table will be created to the database during startup with class name as tablename
@Table(name="tbl_ticket") //Customizes the table name rather than Ticket , it will create with tbl_ticket
public class Ticket {


	/*
	 * To Autopopulate the Primary Key Value, we have two strategies 1) AUTO 2) IDENTITY
	 *
	 * AUTO ==> JPA framework will create a database sequence and it will autopulate the primary
	 *           key by managing this sequence
	 */

	@Id //This Annotation will create a primary Key to the table
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketId;

	@Column(name = "passenger_name")  //Customizes the column Name , rather than passengerName, it wil use passenger_name
	private String passengerName;   //Every Property will be databaseColumn

	@Column(name = "source_station")
	private String sourceStation;

	@Column(name = "destination_station")
	private String destinationStation;

	@Column(name = "travel_date")
	private Date travelDate;


	private String email;


	public Integer getTicketId() {
		return ticketId;
	}


	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}


	public String getPassengerName() {
		return passengerName;
	}


	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}


	public String getSourceStation() {
		return sourceStation;
	}


	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}


	public String getDestinationStation() {
		return destinationStation;
	}


	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}


	public Date getTravelDate() {
		return travelDate;
	}


	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Ticket(String passengerName, String sourceStation, String destinationStation,
			String email) {
		super();
		this.passengerName = passengerName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.travelDate = new Date();
		this.email = email;
	}

	public Ticket() {}


	@Override
	public String toString() {
		return "Ticket [passengerName=" + passengerName + ", sourceStation=" + sourceStation + ", destinationStation="
				+ destinationStation + ", travelDate=" + travelDate + ", email=" + email + "]";
	}



}
