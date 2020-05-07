package com.capgemini.app.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.capgemini.app.entity.Flight;




public interface BookFlightService {
	public List<Flight> displayFlights();
	public Flight viewFlight(int flightNumber);
}
