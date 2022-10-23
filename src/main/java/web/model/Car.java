package web.model;


import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private String color;
    private int yearOfProduce;

       public Car() {
    }

    public Car(String model, String color, int yearOfProduce) {
        this.model = model;
        this.color = color;
        this.yearOfProduce = yearOfProduce;
    }

    public List<Car> getCars() {
        List<Car> list = new ArrayList<>();
        Car car1 = new Car("Audi", "white", 2010);
        Car car2 = new Car("BMW", "black", 2015);
        Car car3 = new Car("Subaru", "blue", 2020);
        Car car4 = new Car("Nissan", "grey", 2018);
        Car car5 = new Car("M-Benz", "white", 2021);
        Car car6 = new Car("BMW", "red", 2019);
        Car car7 = new Car("Suzuki", "orange", 2018);
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        list.add(car6);
        list.add(car7);
        return list;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduce=" + yearOfProduce +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduce() {
        return yearOfProduce;
    }

    public void setYearOfProduce(int yearOfProduce) {
        this.yearOfProduce = yearOfProduce;
    }

}
