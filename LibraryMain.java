package JavaPractice;

abstract class LibraryItem {
    private String title;
    private String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return title;
    }

    abstract void checkOut();

    abstract void returnItem();

    void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }

}

class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    void checkOut() {
        System.out.println("Checking out book: " + getTitle());
    }

    void returnItem() {

        System.out.println("\"Returning book:" + getTitle());
    }
}

class DVD extends LibraryItem {
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    void checkOut() {
        System.out.println("Checking out DVD: " + getTitle());

    }

    void returnItem() {
        System.out.println("\"Returning DVD:" + getTitle());
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        LibraryItem obj1 = new Book("Ramsetu", "prakhar", 330);
        LibraryItem obj2 = new DVD("Neekamal movie", "rajkumar", 120);

        obj1.checkOut();
        obj1.returnItem();
        obj1.displayInfo();

        obj2.checkOut();
        obj2.returnItem();
        obj2.displayInfo();
    }
}
