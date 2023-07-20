package vehicles;

public class Motor implements IMotorised{

    private int hp;
    private int fuel;

    public Motor(int hp, int fuel) {
        this.hp = hp;
        this.fuel = fuel;
    }

    public void startEngine() {
        System.out.println("motor started");
    }

    public void stopEngine() {
        System.out.println("motor stopped");
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getFuel() {
        return this.fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
