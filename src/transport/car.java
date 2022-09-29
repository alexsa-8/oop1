package transport;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class car {
    private final String brand;
    private final String model;
    private final String productionCountry;
    private final int productionYear;
    private final String bodyType;
    private final Serializable numberOfSeats;
    double engineVolume;
    String color;
    String transmission;
    String registrationNumber;
    String rubber;
    private Pattern Pattern;
    public car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String bodyType, int numberOfSeats, String transmission,
               String registrationNumber, String rubber) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        setEngineVolume(engineVolume);
        setColor(color);
        this.productionYear = Objects.requireNonNullElse(productionYear, 2000);
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "default");
        this.bodyType = Objects.requireNonNullElse(bodyType, "default");
        this.numberOfSeats = Objects.requireNonNullElse(numberOfSeats, "default");
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setRubber(rubber);
    }

    public void messageCar() {
        System.out.println("Марка: " + brand + ", модель: " + model + ", тип кузова: " + bodyType + ", цвет кузова: "
                + color + ", посадочных мест: " + numberOfSeats + ", объём двигателя: " + engineVolume +
                ", коробка передач: " + transmission + ", год выпуска: " + productionYear + ", страна сборки: "
                + productionCountry + ", регистрационный номер: " + registrationNumber + ", резина: " + rubber + ".");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getBodyType() {
        return bodyType;
    }

    public Serializable getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0.0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Objects.requireNonNullElse(color, "default");
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = Objects.requireNonNullElse(transmission, "default");
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
    //Matcher

    public void setRegistrationNumber(String registrationNumber) {
        Matcher number = java.util.regex.Pattern.compile("[a-zA-Z]\\d\\d\\d[a-zA-Z][a-zA-Z]\\d\\d\\d").matcher(registrationNumber);
        if (number.find()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = " некорректный номер ";
        }
    }

    public String getRubber() {
        return rubber;
    }

    public void setRubber(String rubber) {
        Calendar calendar = new GregorianCalendar();
        if (Objects.equals(rubber, "зимняя") && calendar.get(Calendar.MONTH) > 3 && calendar.get(Calendar.MONTH) < 10) {
            this.rubber = "смените резину на летнюю";
        } else if (Objects.equals(rubber, "летняя") && calendar.get(Calendar.MONTH) <= 3 && calendar.get(Calendar.MONTH) >= 10) {
            this.rubber = "смените резину на зинюю";
        } else {
            this.rubber = Objects.requireNonNullElse(rubber, "default");
        }
        //System.out.println("Месяц: " + calendar.get(Calendar.MONTH));
    }
}
