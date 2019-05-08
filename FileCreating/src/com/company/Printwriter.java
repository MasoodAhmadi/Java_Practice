package com.company;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

class Printwriter {
    public static void printwriterr() {

        File filename = new File("Masood.txt");
        ArrayList alist = new ArrayList();
        String friend = "";
        while (!friend.isEmpty()) {
            friend = JOptionPane.showInputDialog("Name of your Friend, Hurry");
            if (!friend.isEmpty()) alist.add(friend);
        }
        try {
            FileWriter PrintW = new FileWriter(filename);
            Writer output = new BufferedWriter(PrintW);
            int asize = alist.size();
            for (int i = 0; i < asize; i++) {
                output.write(alist.get(i).toString() + "\n");
            }
            output.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "I cannot create that file");
        }
    }

}
