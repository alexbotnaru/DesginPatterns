package State;

public class OrderedState implements PackageState{
    @Override
    public void next(Package pkg) {
        pkg.setState(new InTransitState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("The package is created.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package was ordered.");
    }
}
