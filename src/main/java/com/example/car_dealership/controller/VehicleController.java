package com.example.car_dealership.controller;

import com.example.car_dealership.model.Vehicle;
import com.example.car_dealership.service.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/vehicles")
@CrossOrigin(origins = "*")
public class VehicleController {
    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){

        return ResponseEntity.ok(vehicleService.getAllVehicles());

    }

    @GetMapping("/search/vehicles/minprice/{minPrice}")
    public ResponseEntity<List<Vehicle>> getVehicleByMinPrice(BigDecimal minPrice){
        List<Vehicle> minVehicles = vehicleService.getVehicleByMinPrice(minPrice);

        return ResponseEntity.ok(minVehicles);
    }


}
