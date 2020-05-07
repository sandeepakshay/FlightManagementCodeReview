package com.capgemini.airport.dao;

import java.util.List;

import com.capgemini.airport.entity.Airport;
import com.capgemini.airport.exception.AirportException;

public interface AirportDaoInterface {
	public void addAirportDao(Airport airport);

	List<Airport> findAll();

	public Airport deleteByCode(String airportCode);

	Airport update(String airportCode, String airportName, String airportLocation);
}
