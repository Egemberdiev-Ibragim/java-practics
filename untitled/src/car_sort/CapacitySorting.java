package car_sort;

import java.util.Comparator;

public class CapacitySorting implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return (int) (o1.getCapacity() - o2.getCapacity());
    }
}
