package com.capgemini.app.service;

import java.util.List;
//
import javax.transaction.Transactional;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.app.dao.BookingDao;
import com.capgemini.app.entity.Booking;

@Transactional
@Service
public class BookingServiceImpl implements BookingService
{

	@Autowired
	private BookingDao bookingDao;

	
	
	@Override
	public Booking addBookingService(Booking booking) 
	{
		// TODO Auto-generated method stub
		bookingDao.addBooking(booking);
		return booking;
	}

	
	
	
	@Override
		public List<Booking> viewBooking() {
			// TODO Auto-generated method stub
			return bookingDao.viewBooking();
	}
	
	
	
	
	@Override
	public Booking cancelBookingService(long bookingId)
	{
		// TODO Auto-generated method stub
		return bookingDao.cancelBooking(bookingId);
	
	}




	@Override
	public Booking viewBooking(long bookingId) {
		// TODO Auto-generated method stub
		return bookingDao.viewBooking(bookingId);	}

}
