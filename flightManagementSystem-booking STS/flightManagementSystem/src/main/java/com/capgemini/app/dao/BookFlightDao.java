package com.capgemini.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.app.entity.Booking;


@Repository
public interface BookFlightDao extends JpaRepository<Booking, Integer>  {
	

}
