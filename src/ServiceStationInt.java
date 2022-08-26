public interface ServiceStationInt {
    default void check(Bicycle bicycle) {
        if (bicycle != null) {
            bicycle.updateTyre();
        }
    }

    default void check(Car car) {
        if (car != null) {
            car.updateTyre();
        }
    }

    default void check(Truck truck) {
        if (truck != null) {
            truck.updateTyre();
        }
    }
}
