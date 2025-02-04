package com.centerprise.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centerprise.TicketRepo;
import com.centerprise.bean.Passenger;
import com.centerprise.entity.Ticket;


@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepo  ticketRemo;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		Ticket ticket=new Ticket();
		BeanUtils.copyProperties(passenger,ticket);
		ticket.setPrice(1000.00);
		ticket.setTicketStatus("CONFORMED");
		
		ticket=ticketRemo.save(ticket);
		
		return ticket;
	}

	@Override
	public Ticket getTicket(Integer ticketNum) {
			Optional<Ticket> findById = ticketRemo.findById(ticketNum);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		
		return null;
	}

	@Override
	public List<Ticket> getAllTickets() {
		
		return ticketRemo.findAll();
	}

	@Override
	public Ticket removeTicket(Integer ticketNum) {
Optional<Ticket> findById = ticketRemo.findById(ticketNum);
		
		if(findById.isPresent()) {
			ticketRemo.deleteById(ticketNum);}
		return null;
	}

}
