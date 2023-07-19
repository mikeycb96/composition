package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Plane extends Vehicle implements IMotorised, IAirVehicle {

    private boolean hasPropeller;
    private IMotorised engine;
    private IAirVehicle landingSpeed;

    public Plane(float weight, int maxSpeed, IProduct baseIProduct, IMotorised engine) {
        super(weight, maxSpeed, baseIProduct);
        this.hasPropeller = false;
        this.engine = engine;
        this.landingSpeed = landingSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("engine stopped");
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }

    @Override
    public int getLandingSpeed() {
        return this.getLandingSpeed();
    }

    @Override
    public void setLandingSpeed(IAirVehicle landingSpeed) {
        this.landingSpeed = landingSpeed;
    }

    public boolean isHasPropeller() {
        return hasPropeller;
    }

    public void setHasPropeller(boolean hasPropeller) {
        this.hasPropeller = hasPropeller;
    }

    public IMotorised getEngine() {
        return engine;
    }

    public void setEngine(IMotorised engine) {
        this.engine = engine;
    }
}
