package com.capgemini.app.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import com.capgemini.app.entity.Booking;



@Repository
public class BookingDaoImpl implements BookingDao{
////
	@PersistenceContext
	EntityManager entityManager;
	
	
	@Override
	public Booking addBooking(Booking bookingList) {
		// TODO Auto-generated method stub
		//entityManager.persist(bookingList);
		Booking booking=entityManager.merge(bookingList);
		return booking;
	}

	
	@Override
	public List<Booking> viewBooking() {
	// TODO Auto-generated method stub
		String Qstr = "SELECT booking FROM Booking booking";
		TypedQuery<Booking> query = entityManager.createQuery(Qstr, Booking.class);
		return query.getResultList();
}



	@Override
	public Booking cancelBooking(long bookingId) {
		// TODO Auto-generated method stub
		Booking cancelbooking = entityManager.find(Booking.class, bookingId);
		if(cancelbooking!=null)
			{
			entityManager.remove(cancelbooking);
			}
		return cancelbooking;
	}


	
	@Override
	public Booking viewBooking(long bookingId) {
		// TODO Auto-generated method stub
		Booking bookingList=entityManager.find(Booking.class,bookingId);
		return bookingList;
		
	}
}


