package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalSumWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total = total + items[i].getAmount() * items[i].getPrice();
        }
        return total;
    }

    public double getTotalSumWithDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            double itemTotal = items[i].getAmount() * items[i].getPrice();  // Стоимость 1 товара без скидки
            double discount = items[i].getDiscount();  // Получаем скидку для товара (0% или 60%)
            double totalSumWithDiscount = itemTotal - (itemTotal * discount / 100);  // Применяем скидку
            total = total + totalSumWithDiscount;  // Добавляем товар с учётом скидки к общей сумме
        }
        return total;  // Возвращаем общую сумму с учётом скидок
    }

    public double getTotalSumVegiProducts() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()) {
                total = total + items[i].getAmount() * items[i].getPrice();
            }
        }
        return total;
    }
}

