package com.centerprise.service;

import java.util.List;

import com.centerprise.bean.Passenger;
import com.centerprise.entity.Ticket;

public interface TicketService {
	
    public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNum);
	
	public List<Ticket> getAllTickets();
	
	public Ticket removeTicket(Integer ticketNum);

}
