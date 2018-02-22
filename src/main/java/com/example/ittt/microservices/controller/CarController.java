package com.example.ittt.microservices.controller;

import com.example.ittt.microservices.model.Car;
import com.example.ittt.microservices.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CarController {

    private final CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/carlist")
    public List<Car> getCars(){
        return carRepository.findAll();
    }

    @PostMapping("/carlist")
    public Car createCar(@RequestBody @Valid Car car){
        return carRepository.save(car);
    }
}
