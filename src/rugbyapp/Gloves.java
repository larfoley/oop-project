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
public class Gloves extends Product {
    String gloveType;
    String material;
    String weather;

    public Gloves(String gloveType, String material, String weather, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.gloveType = gloveType;
        this.material = material;
        this.weather = weather;
    }
  

    public String getGloveType() {
        return gloveType;
    }

    public void setGloveType(String gloveType) {
        this.gloveType = gloveType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

  
   

}

