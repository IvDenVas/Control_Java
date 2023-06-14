package model;

import model.shop.Shop;
import model.toy.Toy;

public class ShopService extends Data {
    private final Shop<Toy> shop;
    private final Writeable wr = new Data();

    public ShopService(Shop<Toy> shop) {
        this.shop = shop;
    }

    public void saveAllToys(){
        wr.write(shop, "AllToys.txt");
    }

    @Override
    public String toString() {
        return shop.toString();
    }
    public void addToy(int id, String name, int count, int weight) {
        shop.add(new Toy(id, name, count, weight));
    }

}
