package com.capgemini.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.app.entity.Booking;



@Repository
public interface BookingDao /*extends JpaRepository <Booking,Integer>*/
{
	/**
	 * 
	 * @param bookingId
	 * @return
	 */
	public Booking cancelBooking(long bookingId);
	
	/**
	 * 
	 * @param bookingList
	 * @return 
	 */
	public  Booking addBooking(Booking bookingList);
	/**
	 * 
	 * @return
	 */
	public List<Booking> viewBooking() ;
	
	/**
	 * 
	 * @param bookingid
	 * @return
	 */
	public Booking viewBooking(long bookingid);
}
