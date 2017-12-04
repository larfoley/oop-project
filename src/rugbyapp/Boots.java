/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;

import java.io.Serializable;

/**
 *
 * @author x16103530
 */
public class Boots extends Product implements Serializable {
    
    protected String studType;
    
    public Boots() {
        super();
        this.studType = "";
    }

    public Boots(String name, double price, String studType) {
        super(name, price);
        this.studType = studType;
    }

    public String getStudType() {
        return studType;
    }

    public void setStudType(String studType) {
        this.studType = studType;
    }
    
    @Override
    public String getInfo(){
        return "Product ID: "+id+"\nProduct Name: "+name+"\nProduct Price: "+price+"\nQuantity: "+quantity+"\nStud Type"+studType;
    }
  

 
  
    
    
}
