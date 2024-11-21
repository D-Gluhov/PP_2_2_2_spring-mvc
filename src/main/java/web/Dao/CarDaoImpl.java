package web.Dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDAO{
    private List<Car> listOfCars;

    {
        listOfCars = new ArrayList<>();
        listOfCars.add(new Car("BMW", "blue", 2010));
        listOfCars.add(new Car("MB", "black", 2015));
        listOfCars.add(new Car("AUDI", "grey", 2012));
        listOfCars.add(new Car("LADA", "white", 2020));
        listOfCars.add(new Car("Lexus", "yellow", 2024));
    }

    @Override
    public List<Car> findTheNumberOfCars(int count) {
        List<Car> result = new ArrayList<>();
        if (count > listOfCars.size()) {
            count = listOfCars.size();
        }
        for (int i = 0; i < count; i++) {
            result.add(listOfCars.get(i));
        }
        return result;
    }
}
