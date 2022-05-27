package Iterator;

public class NameIterator implements Iterator<String> {

    String[] names;
    int index;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public String next() {
        if (this.hasNext()) return names[index++];

        return null;
    }
}
