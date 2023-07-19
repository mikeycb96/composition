package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Speedboat extends Vehicle implements IMotorised, IWaterVehicle {

    private String hullType;
    private IMotorised motor;

    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, IMotorised motor){
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;
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
        return this.motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.setHp(hp);

    }

    @Override
    public int getFuel() {
        return this.motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.setFuel(fuel);
    }

    @Override
    public String gethullType() {
        return this.gethullType();
    }

    @Override
    public void setHullType(String hullType) {
        this.setHullType(hullType);
    }

    public IMotorised getMotor() {
        return motor;
    }

    public void setMotor(IMotorised motor) {
        this.motor = motor;
    }
}
