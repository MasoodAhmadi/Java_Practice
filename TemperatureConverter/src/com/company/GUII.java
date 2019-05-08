package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class GUII implements ActionListener {
    private JFrame mainWindow;
    private JLabel counterLabel;
    private JTextField counterTextField;
    private JButton FahrinhitButton;
    private JButton CelcuisButton;
    private double inputvalue1;
    private double inputvalue2;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==FahrinhitButton){
            DecimalFormat nmfarmat =new DecimalFormat("#.00");


            double FAH =Double.parseDouble(counterTextField.getText());
            double CEL=(FAH*1.8)+32;
            counterTextField.setText(nmfarmat.format(CEL));
            JOptionPane.showMessageDialog(mainWindow,nmfarmat.format(CEL));

        }
        else if(e.getSource()==CelcuisButton){
            DecimalFormat nmfarmat =new DecimalFormat("#.00");
            double CEL =Double.parseDouble(counterTextField.getText());
            double FAH=(CEL-32)*0.55;
            inputvalue1=(1.8)*(inputvalue2+32);
            counterTextField.setText(" "+FAH%10.2f);
            counterTextField.setText(nmfarmat.format(FAH));
            JOptionPane.showMessageDialog(mainWindow,nmfarmat.format(FAH));
        }
    }
    public GUII (){
        mainWindow =new JFrame("Temperature Window");
        counterLabel=new JLabel("input data");                            //
        counterTextField= new JTextField("                                "); //CELSIUS AREA
        CelcuisButton=new JButton("Convert-Celsius");                   ////
      //  CelcuisButton.setSize(100,100);                        ////
        CelcuisButton.addActionListener(this);
                                                                                    ////FAHREINHIT AREA
        FahrinhitButton=new JButton("Convert-Fahrinheit");                    ////
        FahrinhitButton.addActionListener(this);                                /////
        mainWindow.getContentPane().setBackground(new Color(109,246,246));
        counterLabel.setBackground(new Color(246,246,246));
        mainWindow.add(counterLabel);
        mainWindow.add(counterTextField);
        mainWindow.add(CelcuisButton);
        mainWindow.add(FahrinhitButton);
       mainWindow.setLayout(new FlowLayout());
     //   JMenuBar   menuBar=new JMenuBar();
       // JMenu file = new JMenu("File");
     //   file.add("SAVE");
       mainWindow.setSize(900,820);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }

}
