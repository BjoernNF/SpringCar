package de.neuefische.springcar.controller;

import de.neuefische.springcar.model.Car;
import de.neuefische.springcar.repository.CarRepository;
import de.neuefische.springcar.service.CarService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CarController {
    private final CarService carService;

    public CarController() {
        CarRepository carRepository = new CarRepository();
        carService = new CarService(carRepository);
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
