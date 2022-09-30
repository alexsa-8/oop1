import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car(null, "Grand", 1.7, "жёлтый",
                2015, "Россия", "седан", 5,
                "механическая", "a001aa123", "летняя",100);
        Car audi = new Car("Audi", "A8 50 L TDI quattro",  0, "черный",
                2020, "Германия", "купе", 5,
                "автоматическая", "a002aa123", "летняя",120);
        Car bmw = new Car("BMW", "Z8", 3.0, null, 2021,
                "Германия", "кабриолет", 2,
                "механическая", "a003aa123", "летняя",150);
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный",
                0, "Южная Корея", "кроссовер", 5,
                "автоматическая", "a004aa123", "зимняя", 140);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южная Корея", "седан", 5,
                "механическая", "a005aa123","зимняя", 110);
        Car.Key lada1=new Car.Key("да", "да");
        Car.Key audi1=new Car.Key("да", "нет");
        Car.Key bmw1=new Car.Key("нет", "нет");
        Car.Key kia1=new Car.Key("нет", "да");
        Car.Key hyundai1=new Car.Key("да", "да");
        Car.Insurance lada2=new Car.Insurance(0101.2021,2000,"1234567890");
        Car.Insurance audi2=new Car.Insurance(0101.2022,2500,"2345678901");
        Car.Insurance bmw2=new Car.Insurance(2112.2021,2300,"3456789012");
        Car.Insurance kia2=new Car.Insurance(0103.2021,2400,"4567890123");
        Car.Insurance hyundai2=new Car.Insurance(0104.2021,2200,"5678901234");
        Train lastochka=new Train("Ласточка", "B-901", 2011, "Россия",
                null, 301, 3500,0.0,"Белорусский вокзал",
                "Минск-Пассажирский",11);
        Train leningrad=new Train("Ленинград", "D-125", 2019, "Россия",
                null, 270, 1700,0.0,"Ленинградский вокзал",
                "Ленинград-Пассажирский",8);
        Bus ekarus=new Bus("Экарус", "А-45", 2015, "Россия",
                null, 100, 3000,8.0,"Ленинградский автовокзал",
                "Московский автовокзал",8);
        Bus mersedes=new Bus("Мерседес", "С-112", 2016, "Германия",
                null, 120, 1500,7.0,"Брянский автовокзал",
                "Московский автовокзал",8);
        Bus opel=new Bus("Опель", "А-421", 2017, "Китай",
                null, 130, 2500,9.0,"Минский автовокзал",
                "Московский автовокзал",8);
        lada.messageCar();
        lada1.messageKey();
        lada2.messageInsurance();
        lada.refill();
        System.out.println();
        audi.messageCar();
        audi1.messageKey();
        audi2.messageInsurance();
        audi.refill();
        System.out.println();
        bmw.messageCar();
        bmw1.messageKey();
        bmw2.messageInsurance();
        bmw.refill();
        System.out.println();
        kia.messageCar();
        kia1.messageKey();
        kia2.messageInsurance();
        kia.refill();
        System.out.println();
        hyundai.messageCar();
        hyundai1.messageKey();
        hyundai2.messageInsurance();
        hyundai.refill();
        System.out.println();
        lastochka.messageTrain();
        lastochka.refill();
        System.out.println();
        leningrad.messageTrain();
        leningrad.refill();
        System.out.println();
        ekarus.messageBus();
        ekarus.refill();
        System.out.println();
        mersedes.messageBus();
        mersedes.refill();
        System.out.println();
        opel.messageBus();
        opel.refill();
    }
}