package com.capgemini.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.app.entity.Booking;
import com.capgemini.app.entity.Passenger;
import com.capgemini.app.exception.BookingException;
import com.capgemini.app.service.PassengerService;




@RestController
@CrossOrigin("http://localhost:4200")
public class PassengerController {
	 @Autowired
     PassengerService passengerservice;
	  @GetMapping("/getPassenger/{PnrNumber}")
	     public Passenger getPassenger(@PathVariable long PnrNumber)
	     {
	    	 return passengerservice.viewPassenger(PnrNumber);
	     }
	     
	     @PostMapping(value="/addPassenger" , consumes={"application/json"})
	     public ResponseEntity<Object> addPassenger(@RequestBody Passenger passenger) {
	 		Passenger book = passengerservice.addPassenger(passenger);
	 		return new ResponseEntity<Object>("Passenger got added.", HttpStatus.OK);
	 	}
	     @GetMapping("/getAllPassenger")
	     public List<Passenger> viewPassenger()
	     {
	    	 return passengerservice.viewPassenger();
	     }
	     
	     @DeleteMapping("/deletePassenger/{bookingid}")
	     public String deleteBooking(@PathVariable long bookingid)
	     {
	    	 passengerservice.deletePassenger(bookingid);
	    	 return "User Details Deleted";
	     }
	     
	     @PutMapping("/updatePassenger")
	     public Passenger updateUser(@RequestBody Passenger p)
	     {
	    	 Passenger u=passengerservice.modifyPassenger(p);
	    	 return u;
	     }
}
