package com.capgemini.airport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.airport.dao.AirportDaoInterface;
import com.capgemini.airport.entity.Airport;
import com.capgemini.airport.exception.AirportException;

@Service
@Transactional
public class AirportService implements AirportServiceInterface {

	@Autowired
	AirportDaoInterface airport_dao_interface;

	@Override
	public void addAirport(Airport airport) {
		airport_dao_interface.addAirportDao(airport);
	}

	@Override
	public List<Airport> findAll() {
		return airport_dao_interface.findAll();
	}

	@Override
	public Airport deleteByCode(String airportCode) {
		return airport_dao_interface.deleteByCode(airportCode);
	}

	@Override
	public Airport update(String airportCode, String airportName, String airportLocation) {
		return airport_dao_interface.update(airportCode, airportName, airportLocation);
	}

}
