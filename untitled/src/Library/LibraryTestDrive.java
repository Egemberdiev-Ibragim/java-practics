package Library;

import java.util.Scanner;

public class LibraryTestDrive {
    public static void main(String[] args) {
        // Создаем объекты
        Librarian librarian = new Librarian("John Doe");
        LibraryBackground libraryBackground = new LibraryBackground();
        BookMethods methods = new BookMethods();
        Library library = new Library("School Library.Library", "Abylaikhana 23/3", librarian,"Mon-Fri: 9 AM - 5 PM");

        // Создаем и добавляем пользователей
        Users user1 = new Users("user1", "password1", "Alice", "alice@example.com", "Student", "active");
        Users user2 = new Users("user2", "password2", "Bob", "bob@example.com", "Teacher", "blocked");
        library.addUser(user1);
        library.addUser(user2);

        Book book1 = new Book("Java Effective programming", "Joshua Bloch", Catalog.NOVEL, "2001", user1, "Свободна");
        Book book2 = new Book("Harry Potter", "Joanne Rowling", Catalog.NOVEL, "1997", user2, "Занята");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в библиотеку!"  + "\n"
                + "Выберите действия: " + "\n"
                + "(1)Взять книгу" + "\n"
                + "(2)Вернуть книгу" + "\n"
                + "(3)Вывести информацию о пользователе" +"\n"
                + "(4)Вывести информацию о библеотеке");
        int count = scanner.nextInt();
        switch (count){
            case 1:
                System.out.println("Выберите книгу" +"(1)" +  book1 + " " + "(2)" + book2);
                int num = scanner.nextInt();
                if (num == 1) {
                    methods.takeBook(book1);
                } else if (num == 2) {
                    methods.takeBook(book2);
                }break;
            case 2:
                methods.returnBook(book1);
            case 3:
                System.out.println("Выберите пользователя" +"(1)" +  user1 + " " + "(2)" + user2);
                int number = scanner.nextInt();
                if (number == 1){
                    libraryBackground.usersPrintInfo(user1);
                } else if (number == 2) {
                    libraryBackground.usersPrintInfo(user2);
                }break;
            case 4:
                libraryBackground.displayLibraryInfo(library);
        }
    }
}
