package CarServis;

import Car.Car;
import Daoi.CarsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service

public class CarServis  {
    private CarsDao carsDao;
    @Autowired
    public CarServis(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    public List<Car> getCars(int count) {
        if (count < 5) {
            return carsDao.getCars().stream()
                    .limit(count)
                    .collect(Collectors.toList());
        } else {
            return carsDao.getCars();
        }
    }
}
