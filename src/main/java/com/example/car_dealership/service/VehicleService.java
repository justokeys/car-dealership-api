package com.example.car_dealership.service;

import com.example.car_dealership.model.Vehicle;
import com.example.car_dealership.repository.VehicleRepository;
import org.springframework.stereotype.Service;

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
    public List<Vehicle> getVehicleByMinPrice(int minPrice){
        return vehicleRepository.findVehicleByMinPrice(minPrice);
    }

    public List<Vehicle>getVehivleByMaxPrice(int maxPrice){

    }
}
