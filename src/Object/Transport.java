package Object;

import java.util.Objects;

public abstract class Transport<D extends Driver> implements Competing{
    final String brand;

    final String model;

    public String engVolume;

    private D driver;

    public Transport(String brand, String model, String engVolume, D driver) {
        if (brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null){
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engVolume == null){
            this.engVolume = "1.6";
        } else {
            this.engVolume = engVolume;
        }
        setDriver(driver);
    }

    public abstract void startMove();

    public abstract void finishMove();

    @Override
    public void pitStop() {

    }

    @Override
    public void bestTimeLap() {

    }

    @Override
    public void maxSpeed(String brand) {

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngVolume() {
        return engVolume;
    }

    public void setEngVolume(String engVolume) {
        if (engVolume != null && !engVolume.isEmpty() && !engVolume.isBlank()){
            this.engVolume = engVolume;
        }
    }

    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(engVolume, transport.engVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engVolume);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engVolume='" + engVolume + '\'' +
                '}';
    }

    public void infoCar(){
        System.out.println("Марка - " + getBrand() + ", модель - " + getModel() + ", обьем двигателя - " + getEngVolume());
    }
}
