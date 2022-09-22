public class car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        System.out.println("Марка: " + brand + ", модель: " + model + ", объём двигателя " + engineVolume + ", цвет кузова: "
                + color + ", год выпуска: " + productionYear + ", страна сборки: " + productionCountry + ".");
    }
}
