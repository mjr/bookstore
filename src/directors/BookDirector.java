package directors;

import builders.Builder;
import data.BookType;

public class BookDirector {
    public void addBook(Builder builder) {
        builder.setBookType(BookType.BOOK);
        builder.setName("Java Tricks");
        builder.setPrice(1000);
        builder.setWeight(200);
    }

    public void addEBook(Builder builder) {
        builder.setBookType(BookType.EBOOK);
        builder.setName("The Old Man and the Sea");
        builder.setPrice(1500);
        builder.setDownloadLink("https://books.com/12345");
    }
}
