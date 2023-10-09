package car_sort;

import java.util.Comparator;

public class YearSorting implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYear() - o2.getYear();
    }
}
