package data;

public class BookDedication {
    private BookType type;
    private String name;
    private float price;
    private int weight;
    private String downloadLink;

    public BookDedication(BookType type, String name, float price, int weight, String downloadLink) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.downloadLink = downloadLink;
    }

    public String print() {
        if (this.type == BookType.EBOOK) {
            return "Tipo do livro: " + this.type + "\n" + "Dedicatória: Digital por e-mail!" + "\n";
        }
        return "Tipo do livro: " + this.type + "\n" + "Dedicatória: Livro vai ser assinado!" + "\n";
    }
}
