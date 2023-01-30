import Object.*;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){
            Driver_B driver_b = new Driver_B("DriverB" + i, true, "3");
            Car car = new Car("Audi", "RS-7", "2.8", driver_b);
            Driver_C driver_c = new Driver_C("DriverC" + i, true, "4");
            Truck truck = new Truck("Loko", "truck", "1.7", driver_c);
            Driver_D driver_d = new Driver_D("DriverD" + i, true, "5");
            Bus bus = new Bus("Hyundai", "bus", "1.5", driver_d);
            infoAll(car);
            infoAll(truck);
            infoAll(bus);
        }
    }

    public static void infoAll(Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getFIO() + " управляет " + transport.getBrand() + " и будет участвовать в заезде");
    }
}