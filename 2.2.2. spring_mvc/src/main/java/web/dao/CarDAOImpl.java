package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    @Override
    public List<Car> createCars() {
        List<Car> theCars = new ArrayList<>();
        Car car1 = new Car(1, "BMW", "325", "2.5");
        Car car2 = new Car(2, "Opel", "Astra", "2.0");
        Car car3 = new Car(3, "Skoda", "Octavia", "1.8");
        Car car4 = new Car(4, "Lada", "Granta", "1.8");
        Car car5 = new Car(5, "Porshe", "Macan", "3.2");
        theCars.add(car1);
        theCars.add(car2);
        theCars.add(car3);
        theCars.add(car4);
        theCars.add(car5);
        return theCars;
    }

    @Override
    public List<Car> getCars(Integer count, List<Car> list) {
        List<Car> res = list;
        if (count != null && count < 5) {
            res = list.subList(0, count);
        }
        return res;
    }
}
