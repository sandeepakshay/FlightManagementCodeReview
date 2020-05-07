package com.capgemini.airport.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Airport")
public class Airport implements Serializable {

	@Column(name = "AIRPORT_NAME", length = 50)
	String airportName;
	// @Column(name = "AIRPORT_CODE", length = 50)
	@Id
	String airportCode;
	@Column(name = "AIRPORT_LOCATION", length = 50)
	String airportLocation;

	public Airport() {

	}

	public Airport(String airportName, String airportCode, String airportLocation) {

		this.airportName = airportName;
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;

	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportLocation() {
		return airportLocation;
	}

	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
}
