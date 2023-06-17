import model.ShopService;
import model.shop.Shop;
import model.toy.Toy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "Конструктор", 3, 10);// создание игрушек
        Toy toy2 = new Toy(2, "Робот", 7, 5);
        Toy toy3 = new Toy(3, "Кукла", 10, 60);

        Shop<Toy> shop = new Shop();
        ShopService srv = new ShopService(shop);

        srv.addToy(toy1);
        srv.addToy(toy2);
        srv.addToy(toy3);// метод добавления игрушек
        srv.addToy(4, "Машинка", 5, 15);// метод добавления новых игрушек


        srv.changeWeight(toy1, 18);// метод изменения веса
        System.out.println("Весь асортимент магазина: ");
        System.out.println(srv);//вывод всех игрушек магазина
//        srv.saveAllToys();// метод записи в файл всех игрушек

        List<Toy> listPrizeToys = srv.getListPrizeToys(20);// метод получения призовых игрушек с весом менее
        // введеного значения (20)
        System.out.println("Список призовых игрушек:");
        System.out.println(listPrizeToys);// вывод призовых игрушек

        listPrizeToys = srv.raffle(listPrizeToys);// розыгриш + запись игрушки в файл
        System.out.println(listPrizeToys);
        listPrizeToys = srv.raffle(listPrizeToys);// розыгриш + запись игрушки в файл
        System.out.println(listPrizeToys);
        listPrizeToys = srv.raffle(listPrizeToys);// розыгриш + запись игрушки в файл
        System.out.println(listPrizeToys);
    }

}