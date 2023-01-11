package com.infy.rentacar.repository;

import com.infy.rentacar.entity.Rental;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RentalRepository extends CrudRepository<Rental, Integer> {

    List<Rental> findByCarType(String carType);

}
