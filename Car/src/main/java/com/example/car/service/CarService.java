package com.example.car.service;



import com.example.car.dao.entities.Car;
import com.example.car.dto.CarDto;

import java.util.List;

public interface CarService {
    public CarDto saveCar(CarDto carDto);

    public List<CarDto> getCarByModel(String model);


}
