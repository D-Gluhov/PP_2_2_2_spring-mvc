package web.Dao;

import web.models.Car;

import java.util.List;

public interface CarDAO {

    List<Car> findTheNumberOfCars(int count);
}
