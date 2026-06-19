package com.example.car_dealership.service;

import com.example.car_dealership.model.Vehicle;
import com.example.car_dealership.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    public List<Vehicle> getAllVehicles(){
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(int id){
        return vehicleRepository.findById(id).orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }
    public List<Vehicle> getVehicleByMinPrice(BigDecimal minPrice){
        return vehicleRepository.findByPriceLessThanEqual(minPrice);
    }

    public List<Vehicle> getVehicleByMaxPrice(BigDecimal maxPrice){
        return vehicleRepository.findByPriceGreaterThanEqual(maxPrice);
    }

    public List<Vehicle> getVehicleByMaxYear(int maxYear){
        return vehicleRepository.findByYearGreaterThanEqual(maxYear);
    }

    public List<Vehicle> getVehicleByMinYear(int minYear){
        return vehicleRepository.findByYearLessThanEqual(minYear);
    }

    public List<Vehicle> getVehicleByColor(String color){
        return vehicleRepository.findByColor(color);
    }
    public List<Vehicle> getVehicleByMake(String make){
        return vehicleRepository.findByMake(make);
    }

    public List<Vehicle> getVehicleByModel(String model){
        return vehicleRepository.findByModel(model);
    }

    public List<Vehicle> getVehicleByMaxMiles(int maxMiles){
        return vehicleRepository.findByMilesGreaterThanEqual(maxMiles);
    }

    public List<Vehicle> getVehicleByMinMiles(int minMiles){
        return vehicleRepository.findVehicleByMinMiles(minMiles);
    }

    public Vehicle createVehicle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }
}
