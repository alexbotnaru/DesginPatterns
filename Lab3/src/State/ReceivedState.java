package State;

public class ReceivedState implements PackageState{
    @Override
    public void next(Package pkg) {
        System.out.println("The package was already received by the client");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package received");
    }
}
