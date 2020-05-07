package com.capgemini.app.service;


import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.app.dao.BookFlightDao;
import com.capgemini.app.dao.FlightDao;
import com.capgemini.app.entity.Booking;
import com.capgemini.app.entity.Flight;



@Service
@Transactional
public class BookFlightServiceImpl implements BookFlightService{
	@Autowired
    private BookFlightDao bookingdao;
	@Autowired
    private FlightDao dao;
	
	public FlightDao getDao(){
        return dao;
    }
	@Override
	public List<Flight> displayFlights() {
		List<Flight> flights= dao.findAll();
		return flights;
		
	}
	public Flight viewFlight(int flightNumber)
	   {
		   return dao.findById(flightNumber).get();
	   }
	
	
}
