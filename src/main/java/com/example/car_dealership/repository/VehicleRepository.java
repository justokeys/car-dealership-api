package com.example.car_dealership.repository;

import com.example.car_dealership.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle , Integer> {

    List<Vehicle> findVehicleByMinPrice(int minPrice);

    List<Vehicle> findVehicleByMaxPrice(int maxPrice);

    List<Vehicle> findVehicleByMake(String make);

    List<Vehicle> findVehicleByMinYear(int minYear);

    List<Vehicle> findVehicleByMaxYear(int maxYear);

    List<Vehicle> findVehicleByType(int type);




}

