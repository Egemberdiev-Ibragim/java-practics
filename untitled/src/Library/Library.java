package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;// Название библиотеки.
    private String address;// Адрес библиотеки.
    private Librarian librarian; // Информация о библиотекаре или библиотекарях, работающих в библиотеке.
    private String openingHours;// Расписание и часы работы библиотеки.
    private List<Users> users;


    public Library(String name, String address, Librarian librarian, String openingHours) {
        this.name = name;
        this.address = address;
        this.librarian = librarian;
        this.users = new ArrayList<>();
        this.openingHours = openingHours;
    }

    // Другие методы класса Library.Library
    public void addUser(Users user) {
        users.add(user);
    }

    public void removeUser(Users user) {
        users.remove(user);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public List<Users> getUsers() {
        return users;
    }
}

