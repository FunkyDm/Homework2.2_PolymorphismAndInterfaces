package Transport;

import Service.VehicleServiceEngine;
import Service.VehicleServiceTrailer;
import Service.VehicleServiceWheels;

public class Truck extends TransportVehicle implements VehicleServiceWheels, VehicleServiceEngine, VehicleServiceTrailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }

    @Override
    public void updateTyre() {
        System.out.println("Обслуживаем " + getModelName());
        for(int i = 0; i < getWheelsCount(); i++){
            System.out.println("Меняем покрышку");
        }
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
