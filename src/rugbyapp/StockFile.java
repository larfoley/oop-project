/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import jdk.internal.util.xml.impl.Input;

/**
 *
 * @author x15047911
 */


public class StockFile implements Serializable {
    
    private String stockFilePath = "stock.dat";
    
    public static void write(ArrayList data) {
        try {
            FileOutputStream outputStream = new FileOutputStream(new File("stock.dat"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(data);
            System.out.println("stock file updated");
        } catch(IOException e) {
            System.out.println("error");
        }
    }
    
    public static ArrayList read() {
        try {
            File file = new File("stock.dat");
            FileInputStream fStream = new FileInputStream(file);
            ObjectInputStream iStream = new ObjectInputStream(fStream);
            System.out.println(iStream);
       
        } catch (IOException e) {
            System.out.println("error");
        }
        
        return new ArrayList<>();
    }
    
}
