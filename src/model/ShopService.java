package model;

import model.shop.Shop;
import model.toy.Toy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShopService extends Data {
    private final Shop<Toy> shop;
    private final Writeable wr = new Data();

    public ShopService(Shop<Toy> shop) {
        this.shop = shop;
    }

    public void saveAllToys(){
        for (var i : shop) {
            wr.write(i, "AllToys.txt");
        }
//        wr.write(shop.toString(), "AllToys.txt");
    }

    @Override
    public String toString() {
        return shop.toString();
    }
    public void addToy(int id, String name, int count, int weight) {
        shop.add(new Toy(id, name, count, weight));
    }
    public void addToy(Toy toy) {
        shop.add(toy);
    }
    public void changeWeight(Toy inp, int newWeight) {
        inp.setWeight(newWeight);
    }

    public List<Toy> getListPrizeToys(int weight) {
        List<Toy> res = new ArrayList<>();
        for (Toy i : shop) {
            if (i.getWeight() < weight) {
                res.add(i);
            }
        }
        return res;
    }

    public List getPrizeToys(int weight) {
        List<Toy> res = new ArrayList<>();
        List temp = new ArrayList<>();
        for (Toy i : getListPrizeToys(weight)) {
            temp.add(i.getId());
        }
        Random random = new Random();
        int indexTemp = random.nextInt(getListPrizeToys(weight).size());
        int idRandomToy = (int) temp.get(indexTemp);
        for (var i : getListPrizeToys(weight)) {
            if (i.getId() == idRandomToy) {
                res.add(i);
            }
        }
        return res;
    }

}
