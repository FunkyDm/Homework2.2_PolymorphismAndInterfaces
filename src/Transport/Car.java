package Transport;

import Service.VehicleServiceEngine;
import Service.VehicleServiceWheels;

public class Car extends TransportVehicle implements VehicleServiceWheels,VehicleServiceEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
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

}
