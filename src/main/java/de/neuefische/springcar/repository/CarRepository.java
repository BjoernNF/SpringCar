package de.neuefische.springcar.repository;

import de.neuefische.springcar.model.Car;
import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class CarRepository {
    HashMap<UUID, Car> cars = new HashMap<>();
    public void addCar(Car car) {
        cars.put(car.getId(), car);
    }

    public Object[] getCars() {
        return cars.values().toArray();
    }

    public void deleteCar(UUID id) {
        cars.remove(id);
    }

    public void updateCar(UUID id, Car car) {
        cars.put(id, car);
    }
}