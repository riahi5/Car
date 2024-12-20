package com.example.car.mapper;



import com.example.car.dao.entities.Car;
import com.example.car.dto.CarDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Car fromCarDtoToCar(CarDto carDto){
        return mapper.map(carDto, Car.class);
    }

    public CarDto fromCarToCarDto(Car car){
        return mapper.map(car, CarDto.class);
    }

}
