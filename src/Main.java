public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        bicycle.setModelName("bicycle1");
        bicycle2.setModelName("bicycle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        car.setModelName("car1");
        car2.setModelName("car2");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck1", 8);
        truck.setModelName("truck1");
        truck2.setModelName("truck2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        ServiceStationInt station = new ServiceStation();
        station.check(bicycle);
        station.check(bicycle2);
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
    }
}