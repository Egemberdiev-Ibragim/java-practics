package Library;

public class BookMethods{

    public void takeBook(Book book){
        try {
            if (book != null && "Свободна".equalsIgnoreCase(book.getStatus())){
                System.out.println("Книга: " + book.getTitle() + " выдана пользователю: " + book.getUserName());
                book.setStatus("Занята");
            }else {
                System.out.println("Книга не доступна или уже занята!");
            }
        }catch (NullPointerException e){
            System.out.println("Ошибка IBRA303!");
        }
    }
    public void returnBook(Book book){
        System.out.println("Пользователь: " + book.getUserName() + "вернул книгу: " + book.getTitle());
        book.setStatus("Свободна");
    }

}
