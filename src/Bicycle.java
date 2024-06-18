public class Bicycle extends TransportVehicle implements VehicleService{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {

    }

    @Override
    public void checkTrailer() {

    }

}
