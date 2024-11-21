package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.models.Car;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") String count,  Model model) {
        model.addAttribute("listOfCars", carService.findTheNumberOfCars(Integer.parseInt(count)));
        return "cars";
    }
}
