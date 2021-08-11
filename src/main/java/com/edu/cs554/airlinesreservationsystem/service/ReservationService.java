package com.edu.cs554.airlinesreservationsystem.service;

import com.edu.cs554.airlinesreservationsystem.dto.PassengerRegistrationRequest;
import com.edu.cs554.airlinesreservationsystem.dto.ReservationRequest;
import com.edu.cs554.airlinesreservationsystem.model.Airport;
import com.edu.cs554.airlinesreservationsystem.model.Passenger;
import com.edu.cs554.airlinesreservationsystem.model.Reservation;
import com.edu.cs554.airlinesreservationsystem.model.User;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    List<Reservation> findAll();
    //public abstract Reservation makeReservation(Reservation reservation);
   // public abstract void cancelResesrvation(int reservationId);
    void sendReservationReminder();
    Reservation createReservation(ReservationRequest request);
    public abstract Reservation makeReservation(Reservation reservation);
    public abstract void cancelResesrvation(int reservationId);
    public abstract List<Reservation> getReservations(int userId);
    public abstract Reservation getReservationById(int reservationId);
    Reservation save(ReservationRequest reservation, User loggedInUser);
    Reservation update(int id, ReservationRequest reservation);
    boolean delete(int id);
    Reservation cancelReservation(int id);
    Reservation confirmReservation(int id);


    public abstract List<Reservation> getReservations( User userId);
   Reservation updateStatus(Reservation reservation);
   //Reservation getReservationById(Reservation reservationId);







}
