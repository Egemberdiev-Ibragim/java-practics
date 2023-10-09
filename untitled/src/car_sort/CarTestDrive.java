package car_sort;

import java.util.*;

public class CarTestDrive {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Mersedes-Benz", "Maybach", 2022, 3.5, 110_000, 200_000_000),
                new Car("Mazda", "Attenza", 2007, 2.5, 120_000, 10_000_000),
                new Car("Toyota", "Land Cruiser", 2020, 5.0, 100_000, 100_000_000),
                new Car("Mersedes-Benz", "S-class", 2022, 3.5, 110_000, 100_000_000),
                new Car("Toyota", "Camri", 2022, 2.5, 120_000, 20_000_000));
        Comparator<Car> brandSort = new BrandSorting();
        Comparator<Car> modelSort = new ModelSorting();
        Comparator<Car> yearSort = new YearSorting();
        Comparator<Car> capacitySort = new CapacitySorting();
        Comparator<Car> mileageSort = new MileageSorting();
        Comparator<Car> priceSort = new PriceSorting();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Каталог:\n"
                + "1.Сортировать по бренду\n"
                + "2.Сортировать по модели\n"
                + "3.Сортировать по году выпуска\n"
                + "4.Сортировать по объему двигателя\n"
                + "5.Сортировать по пробегу\n"
                + "6.Сортировать по цене");
        System.out.println("Выбирите сортировку: ");

        int num = scanner.nextInt();
        switch (num) {
            case 1:
                cars.sort(brandSort);
                break; // Добавляем break, чтобы остановить выполнение switch
            case 2:
                cars.sort(modelSort);
                break;
            case 3:
                cars.sort(yearSort);
                break;
            case 4:
                cars.sort(capacitySort);
                break;
            case 5:
                cars.sort(mileageSort);
                break;
            case 6:
                cars.sort(priceSort);
                break;
            default:
                System.out.println("Неправильный выбор сортировки.");
                return; // Выйти из метода, если выбор неверен
        }

        System.out.println("Выбирете приоритетность сортировки по (1) убыванию или по (2) возрастанию");
        int num2 = scanner.nextInt();
        if (num2 == 1) {
            Collections.reverse(cars);
        }
        System.out.println(cars);
    }
}
