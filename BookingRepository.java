package com.techm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techm.entity.Booking;
import com.techm.entity.TicketStatus;
import com.techm.entity.Train;
import com.techm.entity.User;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
	List<Booking> findByUser(User user); // Find bookings by user

	List<Booking> findByTrain(Train train); // Find bookings by train

	List<Booking> findByStatus(TicketStatus status); // Find bookings by ticket status

}
