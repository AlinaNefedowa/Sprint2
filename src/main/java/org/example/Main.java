package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5,100);
        Apple redApple = new Apple(10, 50, "red");
        Apple greenApple = new Apple(8, 60, "green");

        Food [] items = {meat,redApple,greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(items);

        System.out.println("Общая сумма без скидки: " + shoppingCart.getTotalSumWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + shoppingCart.getTotalSumWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + shoppingCart.getTotalSumVegiProducts());
    }
}