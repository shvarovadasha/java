package PainoApp;

import java.util.Objects;

public class Pedal {
    private String type;

    public Pedal(String type) {
        this.type = type;
    }

    public Pedal() {
        this.type = "сустейн";
    }

    public void press() {
        System.out.println("Педаль типа " + type + " нажата.");
    }

    @Override
    public String toString() {
        return "Pedal{type='" + type + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedal pedal = (Pedal) o;
        return Objects.equals(type, pedal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
