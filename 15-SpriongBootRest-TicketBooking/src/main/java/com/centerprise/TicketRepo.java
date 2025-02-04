package com.centerprise;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centerprise.entity.Ticket;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer> {

}
