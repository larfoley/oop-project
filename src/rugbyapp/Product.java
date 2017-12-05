/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;
import java.io.Serializable;

/**
 *
 * @author x16103530-Ashish Kumar Singh
 */
public class Product implements Serializable {
    protected int id;
    protected String name;
    protected double price;
    protected int quantity;
    
    public Product() {
        id = 100;
        quantity = 1;
        name = "";
        price = 0.0;
    }

    public Product(String name, double price) {
        id = 100;
        quantity = 1;
        this.name = name;
        this.price = price;
    }
    
    public void increaseQuantity() {
        this.quantity++;
    }
    
    public void decreaseQuantity() {
        System.out.println(this.quantity);
        if (this.quantity > 0 ) {
            this.quantity--;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getInfo(){
        return "Product ID: "+id+"\nProduct Name: "+name+"\nProduct Price: "+price+"\nQuantity: "+quantity;
    }

}
