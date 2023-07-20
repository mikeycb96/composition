package vehicles.air;

import products.IProduct;
import vehicles.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle{

    private int numberOfPropellers;
    private int landingSpeed;

    public Helicopter(float weight, int maxSpeed, IProduct baseIProduct, int landingSpeed){
        super(weight, maxSpeed, baseIProduct);
        this.numberOfPropellers = 2;
        this.landingSpeed = 0;
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

    public void setLandingSpeed(int landingSpeed) {
        this.landingSpeed = 0;
    }
}
