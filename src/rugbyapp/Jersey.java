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
public class Jersey extends Product{
    String team;
    String sleeveType;
    String collarType;

    public Jersey(String team, String sleeveType, String collarType, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
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


   

   
   
    
}
