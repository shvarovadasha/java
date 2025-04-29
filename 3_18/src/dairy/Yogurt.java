package dairy;

public class Yogurt extends MilkProduct {
    private String flavoring;
    private double containerVolume;
    private boolean isThermalized;

    public Yogurt() {
        super();
        this.containerVolume = 0.0;
        this.isThermalized = false;
    }

    public Yogurt(String expirationDate, String manufacturer) {
        super(expirationDate, manufacturer);
        this.flavoring = "не указано";
        this.containerVolume = 0.0;
        this.isThermalized = false;
    }

    public Yogurt(String expirationDate, double proteinContent, double fatContent, String manufacturer, String flavoring, double containerVolume, boolean isThermalized) {
        super(expirationDate, proteinContent, fatContent, manufacturer);
        this.flavoring = flavoring;
        this.containerVolume = containerVolume;
        this.isThermalized = isThermalized;
    }

    @Override
    public void manufacturerInfo() {
        System.out.println("Производитель йогурта: " + getManufacturer());
    }

    public String getFlavoring() {
        return flavoring;
    }

    public double getContainerVolume() {
        return containerVolume;
    }

    public boolean isThermalized() {
        return isThermalized;
    }
}
