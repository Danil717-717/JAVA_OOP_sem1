/*
HW
Создать наследника реализованного класса HotDrink с дополнительным полем int температура.
Создать класс HotDrinkVendingMachine, реализующий интерфейс VendingMachine и реализовать перегруженный метод getProduct(String name, double volume, double temperature), выдающий продукт соответствующего имени,
объема и температуры.
В main проинициализировать несколько экземпляров HotDrink и HotDrinkVendingMachine и воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */


import java.util.Scanner;

public abstract class HotDrinkVendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите напиток из списка: ");
        System.out.println("1 - Late\n2 - Expresso\n3 - tea\n4 - water");
        System.out.print("Ввод: ");
        int a = sc.nextInt();

        Coffe drink1 = new Coffe("Late", 200, 40);
        Coffe drink2 = new Coffe("Expresso", 300, 40);
        Coffe drink3 = new Coffe("tea", 200, 40);
        HotDrink drink4 = new HotDrink("water", 250);


        if (a == 1) {
            System.out.println(drink1);
        } else if (a == 2) {
            System.out.println(drink2);
        } else if (a == 3) {
            System.out.println(drink3);
        } else if (a == 4) {
            System.out.println(drink4);
        } else {
            System.out.println();
        }

    }



}
