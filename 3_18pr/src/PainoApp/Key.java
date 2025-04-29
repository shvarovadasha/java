package PainoApp;
import java.util.Objects;

public class Key {
    private String note;

    public Key(String note) {
        this.note = note;
    }

    public Key() {
        this.note = "до"; // По умолчанию
    }

    public void press() {
        System.out.println("Клавиша с нотой " + note + " нажата.");
    }

    @Override
    public String toString() {
        return "Key{note='" + note + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return Objects.equals(note, key.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(note);
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
