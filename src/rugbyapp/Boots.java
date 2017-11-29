/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;

/**
 *
 * @author x16103530
 */
public class Boots extends Product{
    
    String studType;

    public Boots(String studType, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.studType = studType;
    }

    public String getStudType() {
        return studType;
    }

    public void setStudType(String studType) {
        this.studType = studType;
    }

  

 
  
    
    
}
