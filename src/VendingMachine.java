/**
 * Реализовать у класса VendingMachine, метод void restore() и реализовать логику.
 * Создать в main список из нескольких объектов VendingMachine и нескольких объектов
 * его наследников.
 * Вызвать метод restore() для каждого элемента в списке.
 * Переопределить метод restore() у потомков и повторить пункт 3
 */


import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    public static void main(String[] args) {






        List<Product> productList = new ArrayList<>();
        productList.add(new Product());
        productList.add(new Fish());

        for (Product product : productList){
             product.doSmth();

        }

    }
    void initProducts(List<Product> productList){
        Product product1 = new Product("Шоколад", 150);
        Product  product2 = new Ets(2.0,100.0);
        Product  product3 = new Ets("Chips",1.0, 40.0,100.0);
        Ets  product4 = new Ets("Chips",1.0, 40.0,100.0);
        product4.getVolume();
    }

    void getProduct(String name){

    }

    public void restore(){
        System.out.println("Продукт выдан");
    }
}
