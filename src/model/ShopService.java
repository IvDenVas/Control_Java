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

    public void saveToysFromFile(String i){
        wr.write(i, "File.txt");
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

    public List<Toy> raffle(List<Toy> lst) {
        Random random = new Random();
        int indexTemp = random.nextInt(lst.size());
        System.out.println( "Индекс рандомной игрушки: " + indexTemp); // вывод индекс списка призовых игрушек
        // для проверки!!!
        saveToysFromFile(lst.get(indexTemp).print());
        lst.add(indexTemp + 1, new Toy(lst.get(indexTemp).getId(), lst.get(indexTemp).getName(),
                lst.get(indexTemp).getCount() - 1, lst.get(indexTemp).getWeight()));
        lst.remove(indexTemp);
        return lst;
    }
}
