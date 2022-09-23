public class car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand=brand;
        this.model=model;
        this.engineVolume=engineVolume;
        this.color=color;
        this.productionYear=productionYear;
        this.productionCountry=productionCountry;
        System.out.println("Марка: " + brand + ", модель: " + model + ", объём двигателя " + engineVolume + ", цвет кузова: "
                + color + ", год выпуска: " + productionYear + ", страна сборки: " + productionCountry + ".");
    }
}
