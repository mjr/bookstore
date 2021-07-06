package data;

public class Book {
    private BookType type;
    private String name;
    private float price;
    private int weight;
    private String downloadLink;

    public Book(BookType type, String name, float price, int weight, String downloadLink) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.downloadLink = downloadLink;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }
}
