package com.edu.cs554.airlinesreservationsystem.repositories;

import com.edu.cs554.airlinesreservationsystem.model.Passenger;
import com.edu.cs554.airlinesreservationsystem.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public interface PassengerRepository extends JpaRepository<Passenger, Long>, CrudRepository<Passenger, Long> {
}
