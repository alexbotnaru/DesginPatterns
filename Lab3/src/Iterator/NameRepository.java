package Iterator;

public class NameRepository implements Container {
    public String[] names;

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator<String> getIterator() {
        return new NameIterator(names);
    }
}
