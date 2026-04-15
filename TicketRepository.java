package com.techm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techm.entity.Ticket;
import com.techm.entity.TicketStatus;
import com.techm.entity.Train;
import com.techm.entity.User;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
	List<Ticket> findByUser(User user); // Find tickets by user

    List<Ticket> findByTrain(Train train); // Find tickets by train

    List<Ticket> findByStatus(TicketStatus status); // Find tickets by ticket status


}
