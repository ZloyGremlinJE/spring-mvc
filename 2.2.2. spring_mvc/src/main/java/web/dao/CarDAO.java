package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> createCars();

    List<Car> getCars(Integer count, List<Car> list);
}
