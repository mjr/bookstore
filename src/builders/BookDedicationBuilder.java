package builders;

import data.BookDedication;
import data.BookType;

public class BookDedicationBuilder implements Builder {
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

    public BookDedication getResult() {
        return new BookDedication(type, name, price, weight, downloadLink);
    }
}
