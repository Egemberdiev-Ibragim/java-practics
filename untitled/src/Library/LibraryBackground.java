package Library;

public class LibraryBackground {
    public void usersPrintInfo(Users users){
        System.out.println("Информация о пользователе:" + users.getUsername());
        System.out.println("User name: " + users.getUsername());
        System.out.println("Password: " + users.getPassword());
        System.out.println("Full name: " + users.getFullName());
        System.out.println("Email: " + users.getEmail());
        System.out.println("User role: " + users.getRole());
        System.out.println("MembershipStatus: " + users.getMembershipStatus());
        System.out.println();
    }
    public void displayLibraryInfo(Library library) {
        System.out.println("Информация о библиотеке:");
        System.out.println("Library.Library Name: " + library.getName());
        System.out.println("Library.Library Address: " + library.getAddress());
        System.out.println("Library.Librarian: " + library.getLibrarian().getName());
        System.out.println("Opening Hours: " + library.getOpeningHours());
        System.out.println();
    }
}
