package Object;

import java.sql.Time;

public class Car extends Transport<Driver_B>{

    public Car(String brand, String model, String engVolume, Driver_B driver) {
        super(brand, model, engVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println(brand + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println(brand + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Тип стоп у автомобиля");;
    }

    @Override
    public void bestTimeLap() {
        int bestTime = (int) (Math.random() - Math.random());
        System.out.println("Лучшее время - " + Math.abs(bestTime) + " секунд");
    }

    @Override
    public void maxSpeed(String brand) {
        int minBound = 80;
        int maxBound = 250;
        int maxSpeed = (int) (minBound + (maxBound - minBound)*Math.random());
        System.out.println("Максимальная скорость - " + maxSpeed);
    }
}
