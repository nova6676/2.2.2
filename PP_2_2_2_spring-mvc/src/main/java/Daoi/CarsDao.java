package Daoi;

import lombok.Data;
import org.springframework.stereotype.Component;
import Car.Car;

import java.util.Arrays;
import java.util.List;


@Component
@Data
public class CarsDao {
    private List<Car> cars = Arrays.asList(
            new Car("BMW", 2, "BOBI"),
            new Car("VAZ", 2014, "SAVR"),
            new Car("RENO", 2001, "LIAPIN"),
            new Car("GAZEL", 560, "FARYX"),
            new Car("AUDI",2020,"FREDI"));


    public List<Car> getCars(int count) {
        if (count >= cars.size() || count <= 0) {
            return cars;
        }
        return cars.subList(0, count);
    }


}