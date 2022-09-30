package transport;

public class Train extends Transport {
    double priceTrip;
    double travelTime;
    String departureStations;
    String finalStop;
    int numberOfWagons;

    public Train(String brand, String model, int yearOfRelease, String countryOfProduction, String bodyColor,
                 int maxMovementSpeed) {
        super(brand, model, yearOfRelease, countryOfProduction, bodyColor, maxMovementSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Необходимо заправить поезд топливом.");
    }

    public Train(String brand, String model, int yearOfRelease, String countryOfProduction, String bodyColor,
                 int maxMovementSpeed, double priceTrip, double travelTime, String departureStations, String finalStop,
                 int numberOfWagons) {
        super(brand, model, yearOfRelease, countryOfProduction, bodyColor, maxMovementSpeed);
        this.priceTrip = priceTrip;
        this.travelTime = travelTime;
        this.departureStations = departureStations;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    }

    public void messageTrain() {
        System.out.println("Поезд: " + brand + ", Модель: " + model + ", Год выпуска: " + getYearOfRelease() +
                ", Производитель: " + getCountryOfProduction() + ", Скорость передвижения: " + maxMovementSpeed +
                " км/ч., \nЦена поездки: " + priceTrip + " руб., Время поездки: " + travelTime +
                " ч., Название станции отбытия: " + departureStations + ", \nКонечная остановка: " + finalStop +
                ", Количество вагонов: " + numberOfWagons + ".");
    }

    public double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(double priceTrip) {
        this.priceTrip = priceTrip;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStations() {
        return departureStations;
    }

    public void setDepartureStations(String departureStations) {
        this.departureStations = departureStations;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
}
