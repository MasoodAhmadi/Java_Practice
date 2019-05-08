package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Bookstore {
    ArrayList<Book> books = new ArrayList<>();

    public Bookstore() {
    }
    public Book addBook(Book b) {
                  books.add(b);
                    JOptionPane.showMessageDialog(null,"Book with name: "+b.getAname()+  " stored in DB");
                return(b) ;
    }
    public Book findBook(String bookName) {
        for (Book b : books) {
            JOptionPane.showMessageDialog( null, b.getAname());
            if (b.getAname().equals(bookName)) {
                return b;

            }
        }
        JOptionPane.showMessageDialog( null, "Book not found!");
        return null;
    }
    public void deleteByName( String bookName ){
        for( Book b : books ){
            if(b.getAname().equals( bookName )){
                books.remove( b );
                JOptionPane.showMessageDialog( null, "Book with name " + b.getAname() + " removed from the store.");
                return;
            }
        }
        JOptionPane.showMessageDialog( null, "Book not found! Nothing removed!");
    }
    public Book printBooks(String Bookn) {
        for (Book b : books) {
            if (b.getAname().equals(Bookn)) ;
            {
                return b;
            }
        }
        JOptionPane.showMessageDialog(null,"Book not found to Print!");
        return null;
    }
    public void printByPrice(double price) {
        for (Book b : books) {
            System.out.println(b);
        }
    }
    public void discountBooks(double percentage) {
    }

}

