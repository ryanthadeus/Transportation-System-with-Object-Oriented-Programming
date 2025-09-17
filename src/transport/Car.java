package transport;

public class Car extends Vehicle {
    private int engineSize;

    public Car(String model, int engineSize) {
        super(model);
        this.engineSize = engineSize;
    }

    @Override
    double calculateFuelEfficiency() {
        return 100.0 / engineSize;
    }
}