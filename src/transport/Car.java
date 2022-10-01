package transport;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {

    public void messageKey() {

    }

    @Override
    public void refill() {
        System.out.println("Необходимо заправить автомобиль топливом.");
    }

    public record Key(String remoteEngineStart, String keylessAccess) {
        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = Objects.requireNonNullElse(remoteEngineStart, "default");
            this.keylessAccess = Objects.requireNonNullElse(keylessAccess, "default");
        }

        public void messageKey() {
            System.out.println("Удалённый запуск двигателя: " + remoteEngineStart +
                    ", бесключевой доступ: " + keylessAccess + ".");
        }
    }

    public static class Insurance {
        private Serializable validityPeriod;
        private final double cost;
        private String number;

        public Insurance(Serializable validityPeriod, double cost, String number) {
            this.validityPeriod = validityPeriod;
            this.cost = cost;
            setNumber(number);
        }

        public void messageInsurance() {
            System.out.print("Срок действия страховки: " + validityPeriod +
                    ", стоимость страховки: ");
            System.out.printf("%.2f", cost);
            System.out.println(" руб., № страховки: " + number + ".");
        }

        public Serializable getValidityPeriod() {
            return validityPeriod;
        }

        public void setValidityPeriod(Serializable validityPeriod) {
            this.validityPeriod = validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            Matcher number1 = java.util.regex.Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d").matcher(number);
            if (number1.find()) {
                this.number = number;
            } else {
                this.number = " некорректный номер ";
            }
        }
    }

    private final String bodyType;
    private final Serializable numberOfSeats;
    double engineVolume;
    String transmission;
    String registrationNumber;
    String rubber;
    private Pattern Pattern;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, double engineVolume, String bodyColor, int yearOfRelease,
               String countryOfProduction, String bodyType, int numberOfSeats, String transmission,
               String registrationNumber, String rubber, int maxMovementSpeed) {
        super(brand, model, yearOfRelease, countryOfProduction, bodyColor, maxMovementSpeed);
        setEngineVolume(engineVolume);
        this.bodyType = Objects.requireNonNullElse(bodyType, "default");
        this.numberOfSeats = Objects.requireNonNullElse(numberOfSeats, "default");
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setRubber(rubber);
    }

    public void messageCar() {
        System.out.println("Марка: " + brand + ", модель: " + model + ", тип кузова: " + bodyType + ", цвет кузова: "
                + bodyColor + ", посадочных мест: " + numberOfSeats + ", объём двигателя: " + engineVolume +
                ", \nкоробка передач: " + transmission + ", год выпуска: " + getYearOfRelease() + ", страна сборки: "
                + getCountryOfProduction() + ", регистрационный номер: " + registrationNumber + ", \nрезина: " + rubber +
                ", максимальная скорость: " + maxMovementSpeed + " км/ч.");
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
    }
}
