package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import java.util.Scanner;


public class Last implements ActionListener {
    private JFrame Window;
    private JLabel Label1;
    private JLabel Label2;
    private JButton Button_Add;
    private JButton Button_Print;
    private JButton Button_Delete;
    private JButton Button_Find;
    private JLabel BG;
    Bookstore myStore = new Bookstore();
    public void actionPerformed(ActionEvent e) {
        Scanner reader = new Scanner(System.in);

        while (e.getSource() == Button_Add) {
            try {
                String bookType = JOptionPane.showInputDialog(null, "Book type (B=book, D=dictionary, C=comic?");
                // user pressed cancel button
                if (bookType == null) {
                    return;
                }
                String name = JOptionPane.showInputDialog(Window, "Book name?");
                String authorName = JOptionPane.showInputDialog(Window, "Author name?");
                String authorEmail = JOptionPane.showInputDialog(Window, "Author email?");
                String authorGender = JOptionPane.showInputDialog(Window, "Gender (M=male/F=female)?");
                int quantity = Integer.parseInt(JOptionPane.showInputDialog(Window, "Quantity of books?"));
                double price = Double.parseDouble(JOptionPane.showInputDialog(Window, "Book price?"));
                if( bookType.equals("D")){
                    int definitions = Integer.parseInt(JOptionPane.showInputDialog(null, "How many definitions?"));
                    myStore.addBook(new Dictionary(name, new Author(authorName, authorEmail, authorGender.charAt(0)), quantity, price, definitions));
                }
                else if( bookType.equals( "C")){
                    String illustrator = JOptionPane.showInputDialog(null, "Illustrator?");
                    myStore.addBook(new ComicBook(name, new Author(authorName, authorEmail, authorGender.charAt(0)), (int) price, quantity, illustrator));
                }
                else {
                    myStore.addBook(new Book(name, new Author(authorName, authorEmail, authorGender.charAt(0)), (int) price, quantity));
                }

            } catch (Exception a) {
                JOptionPane.showMessageDialog(Window, "No Book Added ");
            }
        }
        if (e.getSource() == Button_Find) {
            try {
                String bookName = JOptionPane.showInputDialog(Window, "Book name?");
                Book b = myStore.findBook( bookName );
                if (b != null ){  // book was found, show it in a dialog
                    JOptionPane.showMessageDialog( Window, b );
                }
            } catch (Exception a) {
               // JOptionPane.showMessageDialog(Window, "Not Found");
            }
        } else if (e.getSource() == Button_Print) {
            try {
                String book_toPrint = JOptionPane.showInputDialog(Window, "Book name to Print?");
                if (book_toPrint == null) {
                    // user pressed cancel button
                    return;
                }
                Book c = myStore.printBooks(book_toPrint);
                if (c != null) {
                    JOptionPane.showMessageDialog(Window, c);
                }
            } catch (Exception a) {
                JOptionPane.showMessageDialog(Window, "Wrong Spell! check type spell to Print.");
            }
        } else if (e.getSource() == Button_Delete) {
            try {
                String Deleteby_name = JOptionPane.showInputDialog(Window, "Book name to Delete?");

                myStore.deleteByName(Deleteby_name);


            } catch (Exception a) {

            }
        }
    }

    public Last()
    {

        Window = new JFrame("Masood Book Store");

        Label1 = new JLabel("Welcome to Library Store");
        Label2 = new JLabel("Press Button to : Add book,Find book, Print, books,Delete Book");
        Label1.setFont(new Font("System", Font.BOLD, 26));
        Label1.setForeground(Color.white);
        Label2.setFont(new Font("System", Font.BOLD, 18));


        Label1.setBounds(300, 100, 350, 100);
        Label2.setBounds(200, 120, 600, 100);

        Label2.setForeground(Color.white);
        Window.add(Label1);
        Window.add(Label2);

        Button_Add = new JButton(new ImageIcon("Add.png"));
        Button_Add.setBounds(250, 200, 50, 50);
        Window.add(Button_Add);



        Button_Find = new JButton(new ImageIcon("Search.png"));
        Button_Find.setBounds(350, 200, 50, 50);
        Window.add(Button_Find);

        Button_Print = new JButton(new ImageIcon("Print.png"));
        Button_Print.setBounds(450, 200, 50, 50);
        Window.add(Button_Print);

        Button_Delete = new JButton(new ImageIcon("Delete.png"));
        Button_Delete.setBounds(550, 200, 50, 50);
        Window.add(Button_Delete);

        Button_Add.addActionListener(this);
        Button_Find.addActionListener(this);
        Button_Print.addActionListener(this);
        Button_Delete.addActionListener(this);

        Window.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        //File inside menuBar.
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_L);

        //New File to Create inside file.
        JMenuItem New = new JMenuItem("New");
        New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        file.add(New);
        New.addActionListener(this);

        //Open your file.
        JMenuItem Open = new JMenuItem("Open");
        file.add(Open);
        Open.addActionListener(this);
        //Save your file.
        JMenuItem save = new JMenuItem("Save");
        save.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.CTRL_MASK));
        file.add(save);
        save.addActionListener(this);
        // Recent file you have used.
        JMenuItem Recent = new JMenuItem("Recent");
        file.add(Recent);
        Recent.addActionListener(this);
        //close your File.
        JMenuItem Close = new JMenuItem("Close");
        Close.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        file.add(Close);
        Close.addActionListener(this);
        //Another Menu Edit
        JMenu edit = new JMenu("Edit");
        edit.setMnemonic(KeyEvent.VK_E);

        //Inside Edit menu you have Undo
        JMenuItem Undo = new JMenuItem("Undo");
        Undo.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        edit.add(Undo);
        Undo.addActionListener(this);
        //Cut what you want to.
        JMenuItem Cut = new JMenuItem("Cut");
        Cut.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        edit.add(Cut);
        Undo.addActionListener(this);

        JMenuItem Paste = new JMenuItem("Paste");
        edit.add(Paste);
        Paste.addActionListener(this);

        JMenuItem Proterties = new JMenuItem("Properties");
        edit.add(Proterties);
        Proterties.addActionListener(this);

        JMenu Help = new JMenu("Help");
        Help.setMnemonic(KeyEvent.VK_H);


        JMenuItem Info = new JMenuItem("Info");
        Help.add(Info);
        Info.addActionListener(this);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        Help.add(Exit);
        Exit.addActionListener(this);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(Help);
        Window.setJMenuBar(menuBar);
        // for the background
        BG=new JLabel(new ImageIcon("Library.png"));
        BG.setBounds(0,0,800,700);
        Window.add(BG);

        Window.setSize(800, 700);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setVisible(true);
    }


}
