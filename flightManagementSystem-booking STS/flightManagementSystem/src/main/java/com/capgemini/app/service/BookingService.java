package com.capgemini.app.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.app.entity.Booking;



@Repository
public interface BookingService {
	 Booking addBookingService(Booking  booking);
	
	List<Booking> viewBooking();
		
	 Booking cancelBookingService(long bookingId);
	
	Booking viewBooking(long bookingId);
	
}
