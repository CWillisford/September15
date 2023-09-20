package Moving;

public class Duck implements Flying,Swimming{
    @Override
    public void takeOff() {
        System.out.println("flying");
    }

    @Override
    public void land() {
        System.out.println("landing");
    }

    @Override
    public void tread() {
        System.out.println("treading");
    }

    @Override
    public void dive() {
        System.out.println("diving");
    }
}
