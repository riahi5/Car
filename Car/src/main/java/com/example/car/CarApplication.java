package com.example.car;



import com.example.car.dto.CarDto;
import com.example.car.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CarApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CarService carService){
        return  args -> {
            carService.saveCar(
                            CarDto.builder().model("model1").color("pink").matricul("Abc123").price(200000).build());
            carService.saveCar(
                    CarDto.builder().model("model2").color("green").matricul("EFG333").price(300000).build());
            carService.saveCar(
                    CarDto.builder().model("model3").color("blue").matricul("pppp111").price(90000).build());
            carService.saveCar(
                    CarDto.builder().model("model4").color("yellow").matricul("OOOO000").price(40000).build());

        };
    }
}
