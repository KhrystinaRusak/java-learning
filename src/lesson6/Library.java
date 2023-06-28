package lesson6;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Akunin";
        book.name = "Diamond car";
        book.numberOfPage = 500;
        printBook(book);

        Book book2 = new Book();
        printBook(book2);

        Book book3 = new Book();
        printBook(book3);

        Book book4 = new Book("Metro2033", 333, "Gluhovski");
        printBook(book4);

        BookShelf bookshelf = new BookShelf(3);
        bookshelf.books[0] = new Book();
    }

    public static void printBook(Book book) {
        System.out.println(book.author + " " + book.name + " " + book.numberOfPage);
    }
}
