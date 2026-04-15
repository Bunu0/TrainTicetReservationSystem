package com.techm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techm.entity.Ticket;
import com.techm.entity.TicketStatus;
import com.techm.entity.Train;
import com.techm.entity.User;
import com.techm.repository.TicketRepository;
import com.techm.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket bookTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void cancelTicket(Long ticketId) {
        ticketRepository.deleteById(ticketId);
    }

    @Override
    public List<Ticket> getTicketsByUser(User user) {
        return ticketRepository.findByUser(user);
    }

    @Override
    public List<Ticket> getTicketsByTrain(Train train) {
        return ticketRepository.findByTrain(train);
    }

    @Override
    public List<Ticket> getTicketsByStatus(TicketStatus status) {
        return ticketRepository.findByStatus(status);
    }

}
