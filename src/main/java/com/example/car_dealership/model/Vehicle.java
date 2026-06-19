package com.example.car_dealership.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleId;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleType;
    private String vehicleColor;
    private BigDecimal price;
    private int year;
    private int miles;

}
