package vehicles.water;
import products.IProduct;
import vehicles.Vehicle;

public class Kayak extends Vehicle implements IWaterVehicle{

    private String hullType;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
    }

    @Override
    public String gethullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

}
