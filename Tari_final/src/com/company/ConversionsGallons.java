package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * this program is basically in SWING or GUI "Graphical User Interface"
 *
 * Author = Masood Ahmadi:
 * **/
public class ConversionsGallons implements ActionListener {
    private JFrame Window;
    private JLabel Label_1;
    private JLabel Label_2;
    private JLabel Label_3;
    private JLabel Label_5;
    private JTextField Countertextfield_1;
    private JTextField Countertextfield_2;
    private JTextField Countertextfield_3;
    private JButton Gallons;
    private JButton Litrs;
    private JLabel BG;


    public void actionPerformed(ActionEvent e) {
if (e.getSource()==Gallons){
    double MM=Double.parseDouble(Countertextfield_1.getText());
    double MN=Double.parseDouble(Countertextfield_2.getText());
    double ML=Double.parseDouble(Countertextfield_3.getText());
    double Gallon =MM+MN+ML;
    JOptionPane.showMessageDialog(Window,"Gallons: "+Gallon);
}

if (e.getSource()==Litrs){

    double KL=Double.parseDouble(Countertextfield_1.getText());
    double HL=Double.parseDouble(Countertextfield_2.getText());
    double FL=Double.parseDouble(Countertextfield_3.getText());
    double Liters=(KL+HL+FL)*3.79;
    JOptionPane.showMessageDialog(Window,"Liters: "+Liters);
}


    }

/** Implementing Constructor for the class above line 7 **/
    public ConversionsGallons() {
        Window = new JFrame("Converter");
        Label_5=new JLabel();
        Label_5.setBounds(100,100,300,100);

        Label_1 = new JLabel("Please enter the total gallons for item 1:");
        Label_1.setBounds(50,20,300,100);
        Label_1.setForeground(Color.BLACK);
        Countertextfield_1=new JTextField(20);
        Countertextfield_1.setBounds(300,60,150,20);


        Label_2 = new JLabel("Please enter the total gallons for item 2:");
        Label_2.setBounds(50,60,400,100);
        Label_2.setForeground(Color.BLUE);
        Countertextfield_2=new JTextField(20);
        Countertextfield_2.setBounds(300,100,150,20);


        Label_3 = new JLabel("Please enter the total gallons for item 3:");
        Label_3.setBounds(50,100,500,100);
        Countertextfield_3  = new JTextField(20);
        Countertextfield_3.setBounds(300,140,150,20);


        Label_3.setForeground(Color.RED);
        Label_5.setBounds(0,0,0,0);


        Gallons=new JButton("Press Gallon");
        Gallons.setBounds(200,250,120,40);
        Litrs  = new JButton("Press Liter");
        Litrs.setBounds(340,250,120,40);

        Gallons.addActionListener(this);
        Litrs.addActionListener(this);

        Window.add(Label_1);
        Window.add(Label_2);
        Window.add(Label_3);
        Window.add(Label_5);
        Window.add(Gallons);
        Window.add(Litrs);
        Window.add(Countertextfield_1);
        Window.add(Countertextfield_2);
        Window.add(Countertextfield_3);
        /**Here I have used the Background design for my application , I have set the dimension width and height for
         * the application and then add them into main window**/

        BG = new JLabel(new ImageIcon("tari.jpg"));
        BG.setBounds(0,-70,600,500);
        Window.add(BG);
        /** this is only for the main windows **/
        Window.setLocation(100,100);
        Window.setLayout(new FlowLayout());
        Window.setLayout(null);
        Window.setSize(600,400);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setVisible(true);
    }
}