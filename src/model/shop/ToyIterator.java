package model.shop;

import java.util.Iterator;
import java.util.List;

public class ToyIterator <E> implements Iterator<E> {
    private int index;
    private final List<E> lst;
    public ToyIterator(List<E> toyList) {
        this.lst = toyList;
    }
    @Override
    public boolean hasNext() {
        return index < lst.size();
    }

    @Override
    public E next() {
        return lst.get(index++);
    }
}
