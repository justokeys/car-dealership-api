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
        return vehicleRepository.findVehicleByMinPrice(minPrice);
    }

    public List<Vehicle> getVehicleByMaxPrice(BigDecimal maxPrice){
        return vehicleRepository.findVehicleByMaxPrice(maxPrice);
    }

    public List<Vehicle> getVehicleByMaxYear(int maxYear){
        return vehicleRepository.findVehicleByMaxYear(maxYear);
    }

    public List<Vehicle> getVehicleByMinYear(int minYear){
        return vehicleRepository.findVehicleByMinYear(minYear);
    }

    public List<Vehicle> getVehicleByColor(String color){
        return vehicleRepository.findVehicleByColor(color);
    }
    public List<Vehicle> getVehicleByMake(String make){
        return vehicleRepository.findVehicleByMake(make);
    }

    public List<Vehicle> getVehicleByModel(String model){
        return vehicleRepository.findVehicleByModel(model);
    }
}
