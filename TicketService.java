package com.techm.service;

import java.util.List;

import com.techm.entity.Ticket;
import com.techm.entity.TicketStatus;
import com.techm.entity.Train;
import com.techm.entity.User;

public interface TicketService {
    Ticket bookTicket(Ticket ticket);
    void cancelTicket(Long ticketId);
    List<Ticket> getTicketsByUser(User user);
    List<Ticket> getTicketsByTrain(Train train);
    List<Ticket> getTicketsByStatus(TicketStatus status);
}

