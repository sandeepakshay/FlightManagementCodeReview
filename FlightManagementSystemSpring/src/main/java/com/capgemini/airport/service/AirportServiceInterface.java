package com.capgemini.airport.service;

import java.util.List;

import com.capgemini.airport.entity.Airport;
import com.capgemini.airport.exception.AirportException;

public interface AirportServiceInterface {
	public void addAirport(Airport airport);

	List<Airport> findAll();

	public Airport deleteByCode(String airportCode);

	Airport update(String airportCode, String airportName, String airportLocation);

}
