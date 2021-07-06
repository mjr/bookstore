package builders;

import data.Book;
import data.BookType;

public class BookBuilder implements Builder {
    private BookType type;
    private String name;
    private float price;
    private int weight;
    private String downloadLink;

    @Override
    public void setBookType(BookType type) {
        this.type = type;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public Book getResult() {
        return new Book(type, name, price, weight, downloadLink);
    }
}
