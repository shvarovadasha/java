package dairy;

public class MilkProduct {
    private String expirationDate;
    private double proteinContent;
    private double fatContent;
    private String manufacturer;

    public MilkProduct() {
        this.expirationDate = "не указано";
        this.proteinContent = 0.0;
        this.fatContent = 0.0;
        this.manufacturer = "не указан";
    }

    public MilkProduct(String expirationDate, String manufacturer) {
        this.expirationDate = expirationDate;
        this.proteinContent = 0.0;
        this.fatContent = 0.0;
        this.manufacturer = manufacturer;
    }

    public MilkProduct(String expirationDate, double proteinContent, double fatContent, String manufacturer) {
        this.expirationDate = expirationDate;
        this.proteinContent = proteinContent;
        this.fatContent = fatContent;
        this.manufacturer = manufacturer;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public double getProteinContent() {
        return proteinContent;
    }

    public double getFatContent() {
        return fatContent;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void manufacturerInfo() {
        System.out.println("Производитель: " + manufacturer);
    }
}
