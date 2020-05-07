package com.capgemini.airport.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.airport.service.AirportService;
import com.capgemini.airport.entity.Airport;
import com.capgemini.airport.exception.AirportException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AirportController {
	@Autowired
	AirportService airport_service;

	@PostMapping("/airport")
	public ResponseEntity<String> addAirport(@RequestBody Airport airport) {
		airport_service.addAirport(airport);
		return new ResponseEntity<String>("Airport Added Successfully !!", HttpStatus.OK);
	}

	@GetMapping("/airports")
	public ResponseEntity<List<Airport>> getAllAirports() {
		List<Airport> list = airport_service.findAll();
		return new ResponseEntity<List<Airport>>(list, HttpStatus.OK);
	}

	@DeleteMapping("delete/{airportCode}")
	public ResponseEntity<String> deleteAirport(@PathVariable("airportCode") String airportCode) {
		airport_service.deleteByCode(airportCode);
		return new ResponseEntity<String>("Airport Deleted Successfully !!", HttpStatus.OK);

	}

	@PutMapping("airport/{airportCode}")
	public ResponseEntity<String> updateAirport(@PathVariable("airportCode") String airportCode,
			@RequestBody Airport airport) throws AirportException {

		Airport airport1 = airport_service.update(airportCode, airport.getAirportName(), airport.getAirportLocation());
		if (airport1 == null)
			throw new AirportException("No Airport With Entered AirportCode Is Found To Update !!");
		else
			return new ResponseEntity<String>("Airport Updated Successfully !!", HttpStatus.OK);
	}
}
