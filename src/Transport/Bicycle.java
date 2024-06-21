package Transport;

import Service.VehicleServiceWheels;

public class Bicycle extends TransportVehicle implements VehicleServiceWheels {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
    }

    @Override
    public void updateTyre() {
        System.out.println("Обслуживаем " + getModelName());
        for(int i = 0; i < getWheelsCount(); i++){
            System.out.println("Меняем покрышку");
        }
    }

}
