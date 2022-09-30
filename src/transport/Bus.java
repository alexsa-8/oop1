package transport;

public class Bus extends Transport{
    double priceTrip;
    double travelTime;
    String departureStations;
    String finalStop;
    int numberOfSeats;
    public Bus(String brand, String model, int yearOfRelease, String countryOfProduction, String bodyColor,
                 int maxMovementSpeed, double priceTrip, double travelTime, String departureStations, String finalStop,
                 int numberOfSeats) {
        super(brand, model, yearOfRelease, countryOfProduction, bodyColor, maxMovementSpeed);
        this.priceTrip = priceTrip;
        this.travelTime = travelTime;
        this.departureStations = departureStations;
        this.finalStop = finalStop;
        this.numberOfSeats = numberOfSeats;
    }

    public void messageBus() {
        System.out.println("Автобус: " + brand + ", Модель: " + model + ", Год выпуска: " + getYearOfRelease() +
                ", Производитель: " + getCountryOfProduction() + ", Скорость передвижения: " + maxMovementSpeed +
                " км/ч., \nЦена поездки: " + priceTrip + " руб., Время поездки: " + travelTime +
                " ч., Название места отбытия: " + departureStations + ", \nКонечная остановка: " + finalStop +
                ", Количество мест: " + numberOfSeats + ".");
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
        return numberOfSeats;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfSeats = numberOfWagons;
    }

    @Override
    public void refill() {
        System.out.println("Необходимо заправить автобус топливом.");
    }
}
