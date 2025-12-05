public class FourWheelerVehicle extends Vehicle{
    private boolean isAutomatic;
    private boolean isDiesel;

    public FourWheelerVehicle(String engine, String model, long price, boolean isAutomatic, boolean isDiesel) {
        super(engine, model, price);
        this.isAutomatic = isAutomatic;
        this.isDiesel = isDiesel;
    }

    @Override
    protected FourWheelerVehicle clone() throws CloneNotSupportedException {
        return (FourWheelerVehicle) super.clone();
    }
}
