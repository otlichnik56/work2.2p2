public class ServiceStation {
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            bicycle.updateTyre();
        }
    }
    public void check(Car car) {
        if (car != null) {
            car.updateTyre();
            car.checkEngine();
        }
    }
    public void check(Truck truck) {
        if (truck != null) {
            truck.updateTyre();
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
}