package transport;

import java.util.Objects;

public abstract class Transport {
    String brand;
    String model;
    private final int yearOfRelease;
    private final String countryOfProduction;
    String bodyColor;
    int maxMovementSpeed;

    public Transport(String brand, String model, int yearOfRelease, String countryOfProduction,
                     String bodyColor, int maxMovementSpeed) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.yearOfRelease = Objects.requireNonNullElse(yearOfRelease, 2000);
        this.countryOfProduction = Objects.requireNonNullElse(countryOfProduction, "default");
        this.bodyColor = Objects.requireNonNullElse(bodyColor, "default");
        this.maxMovementSpeed = Objects.requireNonNullElse(maxMovementSpeed, 0);
    }
    public abstract void refill();

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        this.maxMovementSpeed = maxMovementSpeed;
    }
}
