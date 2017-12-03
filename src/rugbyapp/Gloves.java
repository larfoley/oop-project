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
public class Gloves extends Product implements Serializable{
    String gloveType;
    String material;
    String weather;
    
    public Gloves() {
        super();
        this.gloveType = "";
        this.material = "";
        this.weather = "";
    }

    public Gloves(String name, double price, String gloveType, String material, String weather) {
        super(name, price);
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

