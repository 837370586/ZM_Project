package com.car_insurance;

import org.mybatis.spring.annotation.MapperScan;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.car_insurance.mapper")
public class CarInsuranceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarInsuranceApplication.class, args);
    }

}
