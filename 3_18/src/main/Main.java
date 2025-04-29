package main;

import dairy.*;
import utils.WriterInfo;

public class Main {
    public static void main(String[] args) {

        Yogurt defaultYogurt = new Yogurt();
        Yogurt partialYogurt = new Yogurt("2025-06-15", "Здравушка");
        Yogurt fullYogurt = new Yogurt("2025-06-20", 3.5, 2.0, "Минский молочный завод", "Клубника", 0.5, true);

        CottageCheese defaultCheese = new CottageCheese();
        CottageCheese partialCheese = new CottageCheese("2025-06-15", "Савушкин");
        CottageCheese fullCheese = new CottageCheese("2025-06-20", 15.0, 9.0, "Минский молочный завод", 250, "Мелкозернистый");

        Kefir defaultKefir = new Kefir();
        Kefir partialKefir = new Kefir("2025-06-15", "Минский молочный завод");
        Kefir fullKefir = new Kefir("2025-06-20", 3.2, 1.5, "Савушкин", 1.0, 100000);

        System.out.println("==================== Йогурты ====================");
        WriterInfo.printClassInfo(defaultYogurt);
        WriterInfo.printClassInfo(partialYogurt);
        WriterInfo.printClassInfo(fullYogurt);

        System.out.println("==================== Творог =====================");
        WriterInfo.printClassInfo(defaultCheese);
        WriterInfo.printClassInfo(partialCheese);
        WriterInfo.printClassInfo(fullCheese);

        System.out.println("==================== Кефир ======================");
        WriterInfo.printClassInfo(defaultKefir);
        WriterInfo.printClassInfo(partialKefir);
        WriterInfo.printClassInfo(fullKefir);
    }
}
