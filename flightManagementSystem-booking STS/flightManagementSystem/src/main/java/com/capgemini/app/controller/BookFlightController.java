package com.capgemini.app.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.app.entity.Flight;
import com.capgemini.app.service.BookFlightService;



@RestController
@CrossOrigin("http://localhost:4200")
public class BookFlightController {

	@Autowired
	BookFlightService flightService;

	@GetMapping("/flightlist")
	public List<Flight> displayFlights() {
		return flightService.displayFlights();
	}


	@GetMapping(value="/getflight/{flightnumber}",produces="application/json")
	     public Flight viewFlight(@PathVariable int flightnumber)
	     {
	    	 return flightService.viewFlight(flightnumber);
	     }


}
