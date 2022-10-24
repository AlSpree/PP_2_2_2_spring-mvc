package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarService {
    @Autowired
    private Car car;
    public List<Car> getCarList(String count) {

        List<Car> ourCarList;

        if (count == null) {
            ourCarList = car.getCars();
        } else if (Integer.parseInt(count) < 5) {
            ourCarList = car.getCars().stream().limit(Integer.parseInt(count)).toList();
        } else {
            ourCarList = car.getCars();
        }

        return ourCarList;
    }
}
