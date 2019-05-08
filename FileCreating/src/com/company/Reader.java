package com.company;

import java.io.*;
import java.util.ArrayList;

public class Reader {
    public static void Readerr (){
        String filename= "Masood.txt";
        String line;
        ArrayList alist=new ArrayList();
        try{
            BufferedReader input= new BufferedReader(new FileReader(filename));
            if (!input.ready()){
                throw new IOException();
            }
            while ((line=input.readLine()) !=null){
                alist.add(line);
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        int size=alist.size();
        for (int i=0; i<size; i++){
            System.out.println(alist.get(i).toString());
        }

    }
}
