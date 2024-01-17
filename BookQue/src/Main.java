import java.util.*;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;
    private String publicationDate;

    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.title.compareTo(otherBook.getTitle());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Kitapları isme göre sıralayan TreeSet
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("Java Programming", 400, "John Smith", "2022-01-01"));
        bookSetByName.add(new Book("Python Essentials", 350, "Jane Doe", "2022-02-15"));
        bookSetByName.add(new Book("Algorithms Unleashed", 500, "Alice Johnson", "2021-12-10"));
        bookSetByName.add(new Book("Web Development with Spring", 450, "Bob Williams", "2022-03-20"));
        bookSetByName.add(new Book("Data Science Mastery", 600, "Charlie Brown", "2022-04-05"));

        System.out.println("Kitaplar isme göre sıralı:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        // Kitapları sayfa sayısına göre sıralayan TreeSet
        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nKitaplar sayfa sayısına göre sıralı:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}
