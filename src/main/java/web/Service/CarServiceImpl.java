package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> findTheNumberOfCars(int count) {
        return carDAO.findTheNumberOfCars(count);
    }
}
