package com.ciclo3.juanparra.repository.crud;

import com.ciclo3.juanparra.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository <Reservation,Integer> {
    
}
