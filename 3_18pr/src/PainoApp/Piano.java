package PainoApp;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Piano {
    private List<Key> keys;
    private List<Pedal> pedals;

    public Piano() {

    }

    public Piano(List<Key> keys, List<Pedal> pedals) {
        this.keys = keys;
        this.pedals = pedals;
    }

    public void tune() {
        System.out.println("Пианино настроено.");
    }

    public void play() {
        System.out.println("Игра на пианино началась...");

        Collections.shuffle(keys);

        Random random = new Random();
        int notesToPlay = random.nextInt(keys.size()) + 1; // От 1 до числа клавиш

        for (int i = 0; i < notesToPlay; i++) {
            keys.get(i).press(); // Нажатие клавиши
        }

        for (Pedal pedal : pedals) {
            pedal.press();
        }

        // Сообщаем об окончании игры
        System.out.println("Игра на пианино окончена.");
    }

    public List<Key> getKeys() {
        return keys;
    }

    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }

    public List<Pedal> getPedals() {
        return pedals;
    }

    public void setPedals(List<Pedal> pedals) {
        this.pedals = pedals;
    }
}

