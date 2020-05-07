package com.capgemini.app.dao;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.app.entity.Passenger;


@Repository
public interface PassengerDaoImpl extends JpaRepository<Passenger,Serializable>
{

}
