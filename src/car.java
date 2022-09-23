import java.util.Objects;

public class car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand= Objects.requireNonNullElse(brand,"default");
        this.model=Objects.requireNonNullElse(model,"default");
        this.engineVolume=engineVolume;
        this.color=Objects.requireNonNullElse(color,"default");
        this.productionYear=productionYear;
        this.productionCountry=Objects.requireNonNullElse(productionCountry,"default");
    }
    car(String brand, String model, String color, int productionYear, String productionCountry){
        this(brand, model, 1.5, color, productionYear, productionCountry);
    }
    car(String brand, String model, double engineVolume, int productionYear, String productionCountry){
        this(brand, model, engineVolume, "белый", productionYear, productionCountry);
    }
    car(String brand, String model, double engineVolume, String color, String productionCountry){
        this(brand, model, engineVolume, color, 2000, productionCountry);
    }

    void messageCar(){
        System.out.println("Марка: " + brand + ", модель: " + model + ", объём двигателя " + engineVolume + ", цвет кузова: "
                + color + ", год выпуска: " + productionYear + ", страна сборки: " + productionCountry + ".");
    }
}
