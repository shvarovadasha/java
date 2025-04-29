package dairy;

public class Kefir extends MilkProduct {
    private double containerVolume;
    private int bifidobacteriaCount;


    public Kefir() {
        super();
        this.containerVolume = 0.0;
        this.bifidobacteriaCount = 0;
    }

    public Kefir(String expirationDate, String manufacturer) {
        super(expirationDate, manufacturer);
        this.containerVolume = 0.0;
        this.bifidobacteriaCount = 0;
    }

    public Kefir(String expirationDate, double proteinContent, double fatContent, String manufacturer, double containerVolume, int bifidobacteriaCount) {
        super(expirationDate, proteinContent, fatContent, manufacturer);
        this.containerVolume = containerVolume;
        this.bifidobacteriaCount = bifidobacteriaCount;
    }

    @Override
    public void manufacturerInfo() {
        System.out.println("Производитель кефира: " + getManufacturer());
    }

    public double getContainerVolume() {
        return containerVolume;
    }

    public int getBifidobacteriaCount() {
        return bifidobacteriaCount;
    }
}
