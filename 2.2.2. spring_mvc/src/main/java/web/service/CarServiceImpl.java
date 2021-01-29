package web.service;

import web.dao.CarDAOImpl;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDAOImpl carDao;

    @Autowired
    public void setCarServiceImpl(CarDAOImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> createCars() {
        return carDao.createCars();
    }

    @Override
    public List<Car> getCars(Integer count, List<Car> list) {
        return carDao.getCars(count, list);
    }
}
