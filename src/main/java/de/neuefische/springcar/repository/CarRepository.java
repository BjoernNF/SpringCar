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
        if (cars.containsKey(id)) {
            cars.remove(id);
        }
        else
        {
            throw new IllegalArgumentException("id not found");
        }
    }

    public void updateCar(UUID id, Car car) {
        car.setId(id);
        cars.replace(id, car);
    }
}