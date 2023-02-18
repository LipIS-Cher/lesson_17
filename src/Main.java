import Object.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){
            Driver_B driver_b = new Driver_B("DriverB" + i, "", true, "3");
            Car car = new Car("Audi", "RS-7", "2.8", driver_b, "Купе");
            Driver_C driver_c = new Driver_C("DriverC" + i, "C",  true, "4");
            Truck truck = new Truck("Loko", "truck", "1.7", driver_c, 3.8f);
            Driver_D driver_d = new Driver_D("DriverD" + i, "D", true, "5");
            Bus bus = new Bus("Hyundai", "bus", "1.5", driver_d, 45);
            infoAll(car);
            infoAll(truck);
            infoAll(bus);
        }
    }

    public static void infoAll(Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getFIO() + " управляет " + transport.getBrand() + " и будет участвовать в заезде");
        transport.printType();
        try{
            transport.getDiagnosis();
        } catch (IdDriverException e){
            System.out.println(e.getMessage());
        }
    }
}