package PainoApp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание клавиш (ноты: до, ре, ми, фа, соль, ля, си)
        Key keyDo = new Key("до");
        Key keyRe = new Key("ре");
        Key keyMi = new Key("ми");
        Key keyFa = new Key("фа");
        Key keySol = new Key("соль");
        Key keyLa = new Key("ля");
        Key keySi = new Key("си");

        // Создание педалей
        Pedal sustainPedal = new Pedal("сустейн");
        Pedal softPedal = new Pedal("мягкая");

        // Создание пианино
        Piano piano = new Piano(
                Arrays.asList(keyDo, keyRe, keyMi, keyFa, keySol, keyLa, keySi),
                Arrays.asList(sustainPedal, softPedal)
        );

        piano.tune();
        piano.play();
    }
}

