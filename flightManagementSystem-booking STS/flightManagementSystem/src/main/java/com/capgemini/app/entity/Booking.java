package com.capgemini.app.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Booking")
public class Booking implements Serializable {

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bk_seq")
//	@SequenceGenerator(sequenceName = "bk_seq", allocationSize = 1, name = "bk_seq")
////	@GeneratedValue
	@GeneratedValue(strategy = GenerationType.AUTO)
	long  bookingId;
	long userId;

	Date Bookingdate;
   @OneToMany(mappedBy = "Id")
    @Valid
	private List<Passenger> passenger;

	double ticketCost;

	Integer flightNumber;

	

	




	int noOfPassengers;

	
	 @Pattern(regexp = "^[\\p{L} .'-]+$", message = "Name should not contain special characters.")
     String passengerName;
     int passengerAge;
     String gender;
     String seatType;
    int extraBaggage;

	public Booking(long bookingId, long userId, Date bookingdate, @Valid List<Passenger> passenger, double ticketCost,
			Integer flightNumber, int noOfPassengers,
			@Pattern(regexp = "^[\\p{L} .'-]+$", message = "Name should not contain special characters.") String passengerName,
			int passengerAge, String gender, String seatType, int extraBaggage) {
		this.bookingId = bookingId;
		this.userId = userId;
		Bookingdate = bookingdate;
		this.passenger = passenger;
		this.ticketCost = ticketCost;
		this.flightNumber = flightNumber;
		this.noOfPassengers = noOfPassengers;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.gender = gender;
		this.seatType = seatType;
		this.extraBaggage = extraBaggage;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public int getExtraBaggage() {
		return extraBaggage;
	}

	public void setExtraBabbage(int extraBaggage) {
		this.extraBaggage = extraBaggage;
	}

	public Integer getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Booking(long bookingId) {
		bookingId = bookingId;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		bookingId = bookingId;
	}


	public Date getBookingdate() {
		return Bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		Bookingdate = bookingdate;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	public double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}

	



	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	
	/**
	 * 
	 * @param bookingId
	 * @param userId
	 * @param bookingdate
	 * @param passenger
	 * @param ticketCost
	 * @param flight
	 * @param noOfPassengers
	 */
	
}
