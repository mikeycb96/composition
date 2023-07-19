package vehicles.air;

import products.IProduct;
import vehicles.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle{

    private int numberOfPropellers;
    private IAirVehicle landingSpeed;

    public Helicopter(float weight, int maxSpeed, IProduct baseIProduct, IAirVehicle landingSpeed){
        super(weight, maxSpeed, baseIProduct);
        this.numberOfPropellers = 2;
        this.landingSpeed = landingSpeed;
    }

    public int getNumberOfPropellers() {
        return numberOfPropellers;
    }

    public void setNumberOfPropellers(int numberOfPropellers) {
        this.numberOfPropellers = numberOfPropellers;
    }

    @Override
    public int getLandingSpeed() {
        return this.getLandingSpeed();
    }

    @Override
    public void setLandingSpeed(int landingSpeed) {
        this.setLandingSpeed(landingSpeed);
    }
}
