package org.example.hibernatefinal;

import org.example.hibernatefinal.entity.Car;
import org.example.hibernatefinal.entity.House;
import org.example.hibernatefinal.entity.Human;
import org.example.hibernatefinal.repository.HumanRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HibernateFinalApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(HibernateFinalApplication.class, args);
        HumanRepository humanAndHouseRepository = context.getBean(HumanRepository.class);

        List <House> houseList = new ArrayList<>();

        houseList.add(new House("Москва"));
        houseList.add(new House("Питер"));

        List <Car> carList = new ArrayList<>();

        carList.add(new Car("БМВ"));
        carList.add(new Car("Мицубиси"));

       humanAndHouseRepository.save(new Human("Костя", houseList, carList));
       humanAndHouseRepository.deleteById(6);




    }

}