package com.capgemini.app.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.app.dao.PassengerDaoImpl;
import com.capgemini.app.entity.Passenger;


@Service
public class PassengerService 
{
     @Autowired
     PassengerDaoImpl passengerdao;
     
     
     @Transactional(readOnly=true)
     public Passenger viewPassenger(long PnrNumber)
     {
    	 return passengerdao.findById(PnrNumber).get();
     }
     
     @Transactional(readOnly=true)
     public List<Passenger> viewPassenger()
     {
    	 return passengerdao.findAll();
     }
     
     @Transactional
     public Passenger addPassenger(Passenger passenger)
     {
    	Passenger passengerobj= passengerdao.save(passenger);
    	return passengerobj;
     }
     
     @Transactional
     public Passenger modifyPassenger(Passenger passenger)
     {
    	Passenger passengerobj= passengerdao.save(passenger);
    	return passengerobj;
     }
     
     @Transactional
     public void deletePassenger(long bookingid)
     {
    	 passengerdao.deleteById(bookingid);
     }
}
