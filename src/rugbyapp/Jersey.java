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
public class Jersey extends Product implements Serializable{
    protected String team;
    protected String sleeveType;
    protected String collarType;
    
    public Jersey() {
        super();
        this.team = "";
        this.sleeveType = "";
        this.collarType = "";
    }

    public Jersey(String name, double price, String team, String sleeveType, String collarType) {
        super(name, price);
        this.team = team;
        this.sleeveType = sleeveType;
        this.collarType = collarType;
    }
   

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getSleeveType() {
        return sleeveType;
    }

    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }

    public String getCollarType() {
        return collarType;
    }

    public void setCollarType(String collarType) {
        this.collarType = collarType;
    }
    @Override
    public String getInfo(){
        return "Product ID: "+id+"\nProduct Name: "+name+"\nProduct Price: "+price+"\nQuantity: "+quantity+
                "\nTeam Name: "+team+"\nSleeve Type: "+sleeveType+"\nCollar Type: "+collarType;
    }
    
}
