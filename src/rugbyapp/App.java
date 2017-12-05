/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;

import java.util.ArrayList;

/**
 *
 * @author x16103530
 */


public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Add default user
        Users users = new Users();
        
        if (users.userExists("admin")) {
            users.addUser(new User("admin", "password"));
        }
        
        // Render the login view
         new Views().render("login");
        
    }
    
}
