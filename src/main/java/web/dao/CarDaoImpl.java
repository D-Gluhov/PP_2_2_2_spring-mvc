package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDAO {
    private final List<Car> listOfCars;

    {
        listOfCars = new ArrayList<>();
        listOfCars.add(new Car("BMW", "blue", 2010));
        listOfCars.add(new Car("MB", "black", 2015));
        listOfCars.add(new Car("AUDI", "grey", 2012));
        listOfCars.add(new Car("LADA", "white", 2020));
        listOfCars.add(new Car("Lexus", "yellow", 2024));
    }

    @Override
    public List<Car> listOfCars(int count) {
        return listOfCars.stream()
                .limit(count > listOfCars.size() ? 5 : count)
                .collect(Collectors.toList());
    }
}
