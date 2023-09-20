package Vehicle;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("starting");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void ignition() {
        System.out.println("ignition");
    }

    @Override
    public void fuelCap() {
        System.out.println("fuel cap");
    }
}
