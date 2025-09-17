package transport;

public class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String model, int passengerCapacity) {
        super(model);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    double calculateFuelEfficiency() {
        return 80.0 / passengerCapacity;
    }
}