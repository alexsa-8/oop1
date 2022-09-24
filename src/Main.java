public class Main {
    public static void main(String[] args) {

        car lada = new car(null, "Grand", 1.7, "жёлтый",
                2015, "Россия");
        car audi = new car("Audi", "A8 50 L TDI quattro",  null, "черный",
                2020, "Германия");
        car bmw = new car("BMW", "Z8", 3.0, null, 2021,
                "Германия");
        car kia = new car("Kia", "Sportage 4 поколение", 2.4, "красный",
                null, "Южная Корея");
        car hyundai = new car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южная Корея");

        lada.messageCar();
        audi.messageCar();
        bmw.messageCar();
        kia.messageCar();
        hyundai.messageCar();
    }
}