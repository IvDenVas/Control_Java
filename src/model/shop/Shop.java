package model.shop;
import model.toy.Toy;

import java.util.ArrayList;
import java.util.List;

public class Shop<E extends Toy> {
    private final List<E> shop;

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

    public List<E> getShop() {
        return shop;
    }
}
