package CarServis;

import model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServis implements CarInterface {

    private final List<Car> carList;

    public CarServis() {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", 2020, "Corolla"));
        carList.add(new Car("Honda", 2019, "Activ"));
        carList.add(new Car("Ford", 2018, "Focus"));
        carList.add(new Car("Chevrolet", 2017, "Camara"));
        carList.add(new Car("Nissan", 2021, "Palmer"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size() || count <= 0) {
            return carList;
        }
        return carList.subList(0, count);

    }
}

