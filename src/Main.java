import transport.car;
public class Main {
    public static void main(String[] args) {

        car lada = new car(null, "Grand", 1.7, "жёлтый",
                2015, "Россия", "седан", 5,
                "механическая", "a001aa123", "летняя");
        car audi = new car("Audi", "A8 50 L TDI quattro",  0, "черный",
                2020, "Германия", "купе", 5,
                "автоматическая", "a002aa123", "летняя");
        car bmw = new car("BMW", "Z8", 3.0, null, 2021,
                "Германия", "кабриолет", 2,
                "механическая", "a003aa123", "летняя");
        car kia = new car("Kia", "Sportage 4 поколение", 2.4, "красный",
                0, "Южная Корея", "кроссовер", 5,
                "автоматическая", "a004aa123", "зимняя");
        car hyundai = new car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южная Корея", "седан", 5,
                "механическая", "a005aa123","зимняя");
        lada.messageCar();
        audi.messageCar();
        bmw.messageCar();
        kia.messageCar();
        hyundai.messageCar();
    }
}