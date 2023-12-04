package event_validation;

public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Джуманжи", 2015, 16)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 10),
                new Theatre("Черная Пантера", 2020, 16)
        };
    }

    public static void validEvent(Event event) {
        if (event.getTitle().equals(null) || event.getTitle().isEmpty() ||
                event.getReleaseYear() == 0 || event.getAge() == 0) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        try {
            for (Event event : getMovies()) {
                validEvent(event);
            }
            for (Event event : getTheatres()) {
                validEvent(event);
            }
            System.out.println("Все события корректны");
        } catch (RuntimeException ex) {
            System.out.println("Ошибка");
        }
    }
}
