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

/**
 *
 * @author x15047911
 */


public class Stock implements Serializable {
    
    private String stockFilePath = "stock.dat";
    private ArrayList<Product> products;
    
    public Stock() {
        
        // Check if a stock file exists
        boolean stockFileExists = false;
       
        try {
            // Try Read stock file
            File file = new File("stock.dat");
            FileInputStream fStream = new FileInputStream(file);
            ObjectInputStream iStream = new ObjectInputStream(fStream);
            this.products = (ArrayList<Product>)iStream.readObject();
            stockFileExists = true;
            
        } catch(IOException | ClassNotFoundException e) {
            System.out.println("Error reading file: " + e);
        }
        
        if (!stockFileExists) {
            // If stock file does not exist create one
            System.out.println("Creating new sotck file...");
            
            try {
                this.products = new ArrayList();
                FileOutputStream outputStream = new FileOutputStream(new File("stock.dat"));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(this.products);
                System.out.println("stock file updated");

            } catch(IOException e) {
                System.out.println(e);
            }
            
        }
    }
    
    
    public ArrayList<Product> getProducts() {
        return this.products;
    }
    
    public void addProduct(Product p) {
        boolean productIsInStock = false;
        
        // Check if product already exists
        for (int i = 0; i < this.products.size(); i++) {
            
            if (this.products.get(i).getName().equals(p.getName())) {
              // Product exists so just increase the quatity
               this.products.get(i).increaseQuantity();
               productIsInStock = true;
              break;
            }
        }
        
        if (!productIsInStock) {
            
            // add a unique id to add to the new product
            if (this.products.size() > 0) {     
                p.setId(this.products.get(this.products.size() - 1).id + 1);
            } else {
                p.setId(100);
            }
            
            // Add Product
            this.products.add(p);
        
        }
        
        
        // Write products to the stock.dat file;
        System.out.println("Writing to stock file...");
        
        try {
            FileOutputStream outputStream = new FileOutputStream(new File("stock.dat"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this.products);
            outputStream.close();
            objectOutputStream.close();
            System.out.println("stock file updated");
            
        } catch(IOException e) {
            System.out.println("Unable to update stock file: " + e);
        }
        
        
    }
    
    public void removeProduct(int id) {
        
        for (int i = 0; i < this.products.size(); i++) {
      
            if (this.products.get(i).getId() == id) {
                
              if (this.products.get(i).getQuantity() > 1) {
                  this.products.get(i).decreaseQuantity();
              } else {
                  // remove product
                  this.products.remove(i);
              }
              break;
            }
        }
        
        // Write products to stock.dat file;
        System.out.println("Writing to stock file...");
        
        try {
            FileOutputStream outputStream = new FileOutputStream(new File("stock.dat"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this.products);
            outputStream.close();
            objectOutputStream.close();
            System.out.println("stock file updated");
            
        } catch(IOException e) {
            System.out.println("Unable to update stock file: " + e);
        }
        
        
    }
    
 
    
   
    
}
