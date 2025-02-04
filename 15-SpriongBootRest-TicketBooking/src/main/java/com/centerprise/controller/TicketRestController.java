package com.centerprise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.centerprise.bean.Passenger;
import com.centerprise.entity.Ticket;
import com.centerprise.service.TicketServiceImpl;

@RestController
public class TicketRestController {
	
	@Autowired
	private TicketServiceImpl ticketService;
	
	@PostMapping(value= "/ticket", 
			consumes="application/json", 
			produces="application/json"
)
public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
	
	Ticket ticket = ticketService.bookTicket(passenger);
	
	return new ResponseEntity<>(ticket, HttpStatus.CREATED);
}

@GetMapping(value="/ticket/{ticketNum}", produces="application/json")
public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNum") Integer ticketNum){
	
	Ticket ticket = ticketService.getTicket(ticketNum);
	
	return new ResponseEntity<>(ticket, HttpStatus.OK);
}

@GetMapping(value="/tickets", produces="application/json")
public ResponseEntity<List<Ticket>> getAllTicket(){
	
	List<Ticket> allTickets = ticketService.getAllTickets();
	
	return new ResponseEntity<>(allTickets, HttpStatus.OK);
}
	

@DeleteMapping(value="/ticket/{ticketNum}", produces="application/json")
public ResponseEntity<String> deletTicket(@PathVariable("ticketNum") Integer ticketNum){
	
	ticketService.removeTicket(ticketNum);
	
	return new ResponseEntity<>("Ticket is deleted", HttpStatus.OK);
}
	

}
