import java.util.Objects;

public class car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    car(String brand, String model, Double engineVolume, String color, Integer productionYear, String productionCountry) {
        this.brand= Objects.requireNonNullElse(brand,"default");
        this.model=Objects.requireNonNullElse(model,"default");
        this.engineVolume=Objects.requireNonNullElse(engineVolume, 1.5);
        this.color=Objects.requireNonNullElse(color,"default");
        this.productionYear=Objects.requireNonNullElse(productionYear, 2000);
        this.productionCountry=Objects.requireNonNullElse(productionCountry,"default");
    }

    void messageCar(){
        System.out.println("Марка: " + brand + ", модель: " + model + ", объём двигателя " + engineVolume + ", цвет кузова: "
                + color + ", год выпуска: " + productionYear + ", страна сборки: " + productionCountry + ".");
    }
}
