package de.neuefische.springcar.controller;

import de.neuefische.springcar.model.Car;
import de.neuefische.springcar.model.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CarController {

    private CarService carService;

    public CarController() {
        carService = new CarService();
    }

    @PostMapping("/addcar")
    public void post(@RequestBody Car car) {
        carService.addCar(car);
    }

    @GetMapping("/getcars")
    public Object[] getCars() {
        return carService.getCars();
    }

    @DeleteMapping("/deletecar/{id}")
    public void deleteCar(@PathVariable String id) {
        carService.deleteCar(id);
    }

    @PutMapping("/updatecar/{id}")
    public void updateCar(@PathVariable String id, @RequestBody Car car) {
        carService.updateCar(id, car);
    }
}
