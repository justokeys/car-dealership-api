package com.example.car_dealership.repository;

import com.example.car_dealership.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle , Integer> {

    List<Vehicle> findByPriceLessThanEqual(BigDecimal minPrice);

    List<Vehicle> findByPriceGreaterThanEqua(BigDecimal maxPrice);

    List<Vehicle> findByMake(String make);

    List<Vehicle> findByYearLessThanEqual(int minYear);

    List<Vehicle> findByYearGreaterThanEqual(int maxYear);

    List<Vehicle> findByType(String type);

    List<Vehicle> findByColor(String color);

    List<Vehicle> findByModel(String model);

    List<Vehicle> findByMilesGreaterThanEqual(int maxMiles);

    List<Vehicle> findVehicleByMinMiles(int minMiles);





}

