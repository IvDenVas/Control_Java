import model.ShopService;
import model.shop.Shop;
import model.toy.Toy;
public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "Конструктор", 3, 20);
        Toy toy2 = new Toy(2, "Робот", 5, 20);
        Toy toy3 = new Toy(3, "Кукла", 10, 60);

        Shop<Toy> shop = new Shop<>();
        shop.add(toy1);
        shop.add(toy2);
        shop.add(toy3);

        ShopService srv = new ShopService(shop);

        System.out.println(shop);
        toy1.setCount(4);
        System.out.println(toy1.getCount());
        srv.saveAllToys();
    }

}