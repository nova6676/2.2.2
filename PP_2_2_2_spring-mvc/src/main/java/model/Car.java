package model;

public class Car {
    private String model;
    private int series;
    private  String nameCar;

    public Car(String model, int series, String nameCar) {
        this.model = model;
        this.series = series;
        this.nameCar = nameCar;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }


}
