package com.company;
public class ComicBook extends Book {
    private String illustrator;

    public ComicBook(String aname, Author author, int quantity, double price, String illustrator) {
        super(aname, author, quantity, price);
        this.illustrator = illustrator;
    }
    public String getIllustrator() {
        return illustrator;
    }
    public String toString() {
        return super.toString() + "ComicBook{" +
                "illustrator='" + illustrator + '\'' +
                '}';
    }
}
