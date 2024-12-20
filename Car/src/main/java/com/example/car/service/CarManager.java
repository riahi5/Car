package com.example.car.service;


import com.example.car.dao.entities.Car;
import com.example.car.mapper.CarMapper;
import com.example.car.dao.repositories.CarRepository;
import com.example.car.dto.CarDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private CarRepository carRepository;
    private CarMapper carMapper;

    @Override
    public CarDto saveCar(CarDto carDto) {
        Car car = carMapper.fromCarDtoToCar(carDto);
        car = carRepository.save(car);
        carDto = carMapper.fromCarToCarDto(car);
        return carDto;

    }

    @Override
    public List<CarDto> getCarByModel(String model) {
        List<Car> cars = carRepository.getCarByModel(model);
        List<CarDto> carDtos = new ArrayList<>();
        for (Car car : cars) {
            carDtos.add(carMapper.fromCarToCarDto(car));
        }
        return carDtos;
    }

}
