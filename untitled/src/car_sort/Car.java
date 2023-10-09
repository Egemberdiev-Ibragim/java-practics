package car_sort;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final double capacity;
    private final int mileage;
    private final int price;

    public Car(String brand, String model, int year, double capacity, int mileage, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
        this.mileage = mileage;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "brand: " + brand + '\n' + "model: " + model + '\n' + "year: " + year + '\n' + "capacity: " + capacity + '\n' + "mileage: " + mileage + '\n' + "price: " + price + '\n' + "\n";
    }
}