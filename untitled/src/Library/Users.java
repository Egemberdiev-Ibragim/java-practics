package Library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Users {
    private String username;// Имя пользователя или логин.
    private String password;// Пароль пользователя.
    private String fullName;// Полное имя пользователя.
    private String email;// Адрес электронной почты пользователя.
    private String role;// Роль пользователя (ученик, учитель, библиотекарь).
    private String membershipStatus;// Статус членства пользователя в библиотеке (активный, заблокированный).
    private List<Book> borrowedBooks; // Список книг, взятых в аренду пользователем
    private List<Date> dueDates; // Список дат возврата книг

    public Users(String username, String password, String fullName, String email, String role, String membershipStatus) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.membershipStatus = membershipStatus;
        borrowedBooks = new ArrayList<>();
        dueDates = new ArrayList<>();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public List<Date> getDueDates() {
        return dueDates;
    }

    public void setDueDates(List<Date> dueDates) {
        this.dueDates = dueDates;
    }

    @Override
    public String toString() {
        return "UserName:" + username + '\'';
    }
}
