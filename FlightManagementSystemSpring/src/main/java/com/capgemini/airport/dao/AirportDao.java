package com.capgemini.airport.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.airport.entity.Airport;
import com.capgemini.airport.exception.AirportException;

@Repository
public class AirportDao implements AirportDaoInterface {

	@PersistenceContext
	EntityManager em;

	@Override
	public void addAirportDao(Airport airport) {
		em.persist(airport);
	}

	@Override
	public List<Airport> findAll() {
		Query query = em.createQuery("SELECT airport FROM Airport as airport");
		List<Airport> all = query.getResultList();
		return all;
	}

	@Override
	public Airport deleteByCode(String airportCode) {
		Airport airport = em.find(Airport.class, airportCode);
		if (airport != null) {
			em.remove(airport);
		}
		return airport;
	}

	@Override
	public Airport update(String airportCode, String airportName, String airportLocation) {
		Airport airport1 = em.find(Airport.class, airportCode);
		if (airport1 == null) {
			return null;
		} else {
			airport1.setAirportName(airportName);
			airport1.setAirportLocation(airportLocation);
			return airport1;
		}

	}
}
