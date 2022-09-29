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
        car.Key lada1=new car.Key("да", "да");
        car.Key audi1=new car.Key("да", "нет");
        car.Key bmw1=new car.Key("нет", "нет");
        car.Key kia1=new car.Key("нет", "да");
        car.Key hyundai1=new car.Key("да", "да");
        car.Insurance lada2=new car.Insurance(0101.2021,2000,"1234567890");
        car.Insurance audi2=new car.Insurance(0101.2022,2500,"2345678901");
        car.Insurance bmw2=new car.Insurance(2112.2021,2300,"3456789012");
        car.Insurance kia2=new car.Insurance(0103.2021,2400,"4567890123");
        car.Insurance hyundai2=new car.Insurance(0104.2021,2200,"5678901234");
        lada.messageCar();
        lada1.messageKey();
        lada2.messageInsurance();
        audi.messageCar();
        audi1.messageKey();
        audi2.messageInsurance();
        bmw.messageCar();
        bmw1.messageKey();
        bmw2.messageInsurance();
        kia.messageCar();
        kia1.messageKey();
        kia2.messageInsurance();
        hyundai.messageCar();
        hyundai1.messageKey();
        hyundai2.messageInsurance();
    }
}