package com.company;

class Book  {
    private String aname;
    private Author author;
    private double price;
    private int quantity = 0;
    public Book(String aname, Author author, int quantity, double price) {
        this.aname = aname;
        this.author=author;
        this.quantity=quantity;
        this.price = price;
    }
    public String getAname() {
        return aname;
    }
    public String getAuthorName() {
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString(){
        return "Book{" +
                "name='" + aname + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", qty=" + quantity +
                '}';
    }
}


