package com.example.car.dao.repositories;


import com.example.car.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    public List<Car> getCarByModel(String model);

}
