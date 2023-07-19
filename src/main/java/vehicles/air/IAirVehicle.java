package vehicles.air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {
    
    int getLandingSpeed();
    void setLandingSpeed(int landingSpeed);
    
}
