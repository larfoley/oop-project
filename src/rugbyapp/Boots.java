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
    String laceColour;

    public Boots(String studType, String laceColour, int id, String name, double price, String size, int quantity, String colour, String details, String brand, String imageUrl) {
        super(id, name, price, size, quantity, colour, details, brand, imageUrl);
        this.studType = studType;
        this.laceColour = laceColour;
    }

    public String getStudType() {
        return studType;
    }

    public void setStudType(String studType) {
        this.studType = studType;
    }

    public String getLaceColour() {
        return laceColour;
    }

    public void setLaceColour(String laceColour) {
        this.laceColour = laceColour;
    }


 
    

 
  
    
    
}
