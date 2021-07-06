package builders;

import data.BookType;

public interface Builder {
    void setBookType(BookType type);
    void setName(String name);
    void setPrice(float price);
    void setWeight(int weight);
    void setDownloadLink(String downloadLink);
}
