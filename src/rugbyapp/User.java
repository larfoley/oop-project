/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;

/**
 *
 * @author x15047911
 */
public class User {
    private String username = "admin";
    private String password = "letmein";
    private boolean loggedIn = false;
    
    public void login(String username, String password) {

        if (username.equals(this.username) && password.equals(this.password)) {
            loggedIn = true;
        }
    }
    
    public boolean isLoggedIn() {
        return loggedIn;
    }
    
}
