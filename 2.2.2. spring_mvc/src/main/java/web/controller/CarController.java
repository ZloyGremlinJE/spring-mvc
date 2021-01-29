package web.controller;


import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private CarServiceImpl carService;

    @Autowired
    public void setCarService(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String listCars(@RequestParam(name = "count", required = false) Integer count, Model theModel) {
        List<Car> res = carService.getCars(count, carService.createCars());
        theModel.addAttribute("cars", res);
        return "cars";
    }


}
