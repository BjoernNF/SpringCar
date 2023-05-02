package de.neuefische.springcar.service;

import de.neuefische.springcar.model.Car;
import de.neuefische.springcar.repository.CarRepository;

import java.util.UUID;

public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Object[] getCars() {
        return carRepository.getCars();
    }

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public void deleteCar(String id) {
        if (id == null) {
            throw new IllegalArgumentException("id must not be null");
        }
        carRepository.deleteCar(UUID.fromString(id));
    }

    public void updateCar(String id, Car car) {
        if (id == null) {
            throw new IllegalArgumentException("id must not be null");
        }
        carRepository.updateCar(UUID.fromString(id), car);
    }
}
