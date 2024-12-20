package com.example.car.web;


import com.example.car.dto.CarDto;
import com.example.car.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarController {

    private CarService carService ;

    @MutationMapping
    public CarDto saveCar(@Argument CarDto car){
        return carService.saveCar(car);
    }

    @QueryMapping
    public List<CarDto> getCarByModel(@Argument String model){
        return carService.getCarByModel(model);
    }


}