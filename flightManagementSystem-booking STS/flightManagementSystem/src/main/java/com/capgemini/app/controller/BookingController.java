package com.capgemini.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.app.entity.Booking;
import com.capgemini.app.exception.BookingException;
import com.capgemini.app.exception.IdNotFoundException;
import com.capgemini.app.service.BookingService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class BookingController {
	@Autowired
	private BookingService bookingservice;

	
	@PostMapping("/addBooking")
	public ResponseEntity<Object> saveBook(@RequestBody Booking booking) {
		if (booking.getNoOfPassengers() > 5)
			throw new BookingException("No of Passengers should be less than 5");
		Booking book = bookingservice.addBookingService(booking);
		return new ResponseEntity<Object>("Booking got added.", HttpStatus.OK);
	}
	
	
	@GetMapping("/viewBooking")
	public ResponseEntity<List<Booking>> viewAllBooking() {
		List<Booking> view = bookingservice.viewBooking();
		return new ResponseEntity<List<Booking>>(view, HttpStatus.OK);
	}

	
	// Get Particular Booking data
	@GetMapping("/viewBooking/{id}")
	private Booking viewBooking(@PathVariable("id") int bookingId) {
		Booking booking = bookingservice.viewBooking(bookingId);
		if (booking == null) {
			throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
		} else {
			return booking;
		}

	}

	
	@DeleteMapping("/cancelBooking/{id}")
	public ResponseEntity<String> cancelBooking(@PathVariable("id") int bookingId) {
		Booking status = bookingservice.cancelBookingService(bookingId);
		// throw exception if booking id is not present
		if (status == null)
			throw new BookingException("Booking ID not found.");
		return new ResponseEntity<String>("Booking deleted successfully", HttpStatus.OK);
	}

}
