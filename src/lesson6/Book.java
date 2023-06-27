package lesson6;

public class Book {
    String author;
    int numberOfPage;
    String name;
    boolean weHasThisBookInLibrary;

    public Book() {
        System.out.println("This constructor is called");
        numberOfPage = 100;
    }

    public Book(String author, int numberOfPage, String name) {
        System.out.println("This constructor is called");
        this.name = name;
        this.author = author;
        this.numberOfPage = numberOfPage;

    }
//
//    public static void setWeHasThisBookInLibrary(boolean weHasThisBookInLibrary){
//        this.weHasThisBookInLibrary = weHasThisBookInLibrary;
//    }
}
