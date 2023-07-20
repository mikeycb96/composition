package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Plane extends Vehicle implements IMotorised, IAirVehicle {

    private boolean hasPropeller;
    private IMotorised engine;
    private int landingSpeed;

    public Plane(float weight, int maxSpeed, IProduct baseIProduct, IMotorised engine, int landingSpeed) {
        super(weight, maxSpeed, baseIProduct);
        this.hasPropeller = false;
        this.engine = engine;
        this.landingSpeed = 0;
    }


    public void startEngine() {
        this.engine.startEngine();
    }

    public void stopEngine() {
        this.engine.stopEngine();
    }

    public int getHp() {
        return this.engine.getHp();
    }

    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    public int getFuel() {
        return this.engine.getFuel();
    }

    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }

    public int getLandingSpeed() {
        return this.getLandingSpeed();
    }

    public void setLandingSpeed(int landingSpeed) {
        this.landingSpeed = 0;
    }
}
