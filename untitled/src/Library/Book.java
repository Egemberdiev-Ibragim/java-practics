package Library;

public class Book {
    private String title;//Название книги.
    private String author;// Автор книги.
    private Catalog genre;// Жанр книги
    private String publicationYear;//Год публикации книги.
    private Users userName;//Пользователь, который взял книгу (если она взята)
    private String status;//Статус книги (свободна, занята)

    public Book(String title, String author, Catalog genre, String publicationYear, Users userName, String status) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.userName = userName;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Catalog getGenre() {
        return genre;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public Users getUserName() {
        return userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "title: " + title + '\n';
    }
}
