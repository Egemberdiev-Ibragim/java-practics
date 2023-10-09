package car_sort;

import java.util.Comparator;

public class MileageSorting implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getMileage() - o2.getMileage();
    }
}
