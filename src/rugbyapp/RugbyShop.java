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
public class RugbyShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 
        Boots p = new Boots(
                "Metals",
                "Green",
                10,
                "Neon",
                9.99,
                "8",
                2,
                "neon",
                "amazing glow in the dark boots made of admanatie",
                "Puma",
                "foo.jpg"
        );
        System.out.println(p.getLaceColour());
    }
    
}
