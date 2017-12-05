/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author x15047911
 */
public class User implements Serializable {
    private String username;
    private String password;
    private boolean loggedIn;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.loggedIn = false;
        
    }
    
    public void login(String username, String password) {
        ArrayList<User> users = new ArrayList();
        
        try {
            // Try Read user file
            File file = new File("users.dat");
            FileInputStream fStream = new FileInputStream(file);
            ObjectInputStream iStream = new ObjectInputStream(fStream);
            users = (ArrayList<User>)iStream.readObject();
            System.out.println(users);
            
        } catch(IOException | ClassNotFoundException e) {
            System.out.println("Error reading file: " + e);
        }

        for (int i = 0; i < users.size(); i++) {
            System.out.println("username");
            System.out.println(users.get(i).getUsername());
            System.out.println("password");
            System.out.println(users.get(i).getPassword());
            
            if (users.get(i).getUsername().equals(username) && users.get(i).getPassword().equals(password)) {
                loggedIn = true;
            }
        }
        
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    
    public boolean isLoggedIn() {
        return loggedIn;
    }
    
}
