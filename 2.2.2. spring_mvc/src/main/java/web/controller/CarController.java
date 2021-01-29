package web.controller;


import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private List<Car> theCars;

    @PostConstruct
    private void loadData(){

        Car car1 = new Car(1,"BMW","325","2.5" );
        Car car2 = new Car(2,"Opel","Astra","2.0" );
        Car car3 = new Car(3,"Skoda","Octavia","1.8" );
        Car car4 = new Car(4,"Lada","Granta","1.8" );
        Car car5 = new Car(5,"Porshe","Macan","3.2" );

        theCars= new ArrayList<>();
        theCars.add(car1);
        theCars.add(car2);
        theCars.add(car3);
        theCars.add(car4);
        theCars.add(car5);
    }

    @GetMapping("/list")
    public String listCars(Model theModel){
       theModel.addAttribute("cars", theCars);
       return "cars";
    }


}
