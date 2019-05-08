package com.company;

public class Dictionary extends Book  {
    private int difinition=0;

    public Dictionary(String aname, Author author, int quantity, double price, int difinition) {
        super(aname, author, quantity, price);
        this.difinition = difinition;
    }
    public int getDifinition() {
        return difinition;
    }
    public void setDifinition(int difinition) {
        this.difinition = difinition;
    }
    public String toString() {
        return "Dictionary{" +
                "difinition=" + difinition + '}';
    }
}
