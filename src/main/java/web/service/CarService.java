package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarService {

    private Car car;
    public List<Car> getCarList() {
        return car.getCars();
    }
}
