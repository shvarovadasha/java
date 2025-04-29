package utils;

import dairy.*;

public class WriterInfo {
    public static void printClassInfo(MilkProduct product) {
        System.out.println("Класс: " + product.getClass().getSimpleName());

        // Вывод базовых данных
        System.out.println("Срок годности: " + product.getExpirationDate());
        System.out.println("Количество белка: " + product.getProteinContent() + " г");
        System.out.println("Жирность: " + product.getFatContent() + " %");

        product.manufacturerInfo();

        if (product instanceof Yogurt) {
            Yogurt yogurt = (Yogurt) product;
            System.out.println("Вкус: " + yogurt.getFlavoring());
            System.out.println("Объем: " + yogurt.getContainerVolume() + " л");
            System.out.println("Термизированность: " + (yogurt.isThermalized() ? "Да" : "Нет"));
        } else if (product instanceof CottageCheese) {
            CottageCheese cheese = (CottageCheese) product;
            System.out.println("Масса: " + cheese.getWeight() + " г");
            System.out.println("Зернистость: " + cheese.getGranularity());
        } else if (product instanceof Kefir) {
            Kefir kefir = (Kefir) product;
            System.out.println("Объем: " + kefir.getContainerVolume() + " л");
            System.out.println("Количество бифидобактерий: " + kefir.getBifidobacteriaCount());
        }

        System.out.println("----------");
    }
}
