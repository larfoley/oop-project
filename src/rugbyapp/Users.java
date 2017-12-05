/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author x15047911
 */
public class Users implements Serializable {
    private ArrayList<User> users;
    
    public Users() {
        // Check if a user file exists
        boolean userFileExists = false;
       
        try {
            // Try Read user file
            File file = new File("users.dat");
            FileInputStream fStream = new FileInputStream(file);
            ObjectInputStream iStream = new ObjectInputStream(fStream);
            this.users = (ArrayList<User>)iStream.readObject();
            userFileExists = true;
            
        } catch(IOException | ClassNotFoundException e) {
            System.out.println("Error reading file: " + e);
        }
        
        if (!userFileExists) {
            // If user file does not exist create one
            System.out.println("Creating new user file...");
            
            try {
                this.users = new ArrayList();
                FileOutputStream outputStream = new FileOutputStream(new File("users.dat"));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(this.users);
                System.out.println("user file updated");

            } catch(IOException e) {
                System.out.println(e);
            }
            
        }
        
        System.out.println(this.users);
    }
    
    public boolean addUser(User user) {
        System.out.println("Adding user...");
        this.users.add(user);
        
        // update user.dat file
        try {
            FileOutputStream outputStream = new FileOutputStream(new File("users.dat"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this.users);
            outputStream.close();
            objectOutputStream.close();
            System.out.println("user file updated");
            return true;
            
        } catch(IOException e) {
            System.out.println("Unable to update user file: " + e);
            return false;
        }
    }
    
    public boolean deleteUser(String username) {
        for (int i = 0; i < this.users.size(); i++) {
            if (this.users.get(i).getUsername().equals(username)) {
                this.users.remove(i);
                try {
                    FileOutputStream outputStream = new FileOutputStream(new File("users.dat"));
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                    objectOutputStream.writeObject(this.users);
                    outputStream.close();
                    objectOutputStream.close();
                    System.out.println("user file updated");
                    return true;
            
                } catch(IOException e) {
                    System.out.println("Unable to update user file: " + e);
                    return false;
                }
                
            }
        }
        return false;
    }
    
    public boolean userExists(String username) {
        for (int i = 0; i < this.users.size(); i++) {
            if (this.users.get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
    
}
