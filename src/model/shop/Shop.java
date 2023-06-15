package model.shop;
import model.toy.Toy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shop<E extends Toy> implements Iterable<E> {
    private List<E> shop;

    public Shop() {
        this.shop = new ArrayList<>();
    }

    public void add(E o) {
        this.shop.add(o);
    }

    @Override
    public String toString() {
        return shop.toString();
    }
    @Override
    public Iterator<E> iterator() {
        return new ToyIterator<>(shop);
    }
}
