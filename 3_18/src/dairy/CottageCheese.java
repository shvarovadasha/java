package dairy;

public class CottageCheese extends MilkProduct {
    private double weight;
    private String granularity;

    public CottageCheese() {
        super();
        this.weight = 0.0;
        this.granularity = "не указано";
    }

    public CottageCheese(String expirationDate, String manufacturer) {
        super(expirationDate, manufacturer);
        this.weight = 0.0;
        this.granularity = "не указано";
    }

    public CottageCheese(String expirationDate, double proteinContent, double fatContent, String manufacturer, double weight, String granularity) {
        super(expirationDate, proteinContent, fatContent, manufacturer); // Вызов конструктора базового класса
        this.weight = weight;
        this.granularity = granularity;
    }

    @Override
    public void manufacturerInfo() {
        System.out.println("Производитель творога: " + getManufacturer());
    }

    public double getWeight() {
        return weight;
    }

    public String getGranularity() {
        return granularity;
    }
}
