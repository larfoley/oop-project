/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;

/**
 *
 * @author x15047911-Laurence Foley
 */
public class Views {
    
    // Views
    LoginGUI loginGUI = new LoginGUI(this);
    AddProductGUI addProductGUI = new AddProductGUI(this);
    ViewProductsGUI viewProductsGUI = new ViewProductsGUI(this);
    UsersGUI users=new UsersGUI(this);
    DeleteForm delete = new DeleteForm(this);
    
    public Views() {
        loginGUI.setVisible(false);
        addProductGUI.setVisible(false);
        viewProductsGUI.setVisible(false);
        users.setVisible(false);
        delete.setVisible(false);
    }
    
    public void render(String viewName) {
        switch(viewName) {
            case "login" :
               loginGUI.setVisible(true);
               addProductGUI.setVisible(false);
               viewProductsGUI.setVisible(false);
               users.setVisible(false);
               delete.setVisible(false);
               break; 

            case "addProduct" :
               loginGUI.setVisible(false);
               addProductGUI.setVisible(true);
               viewProductsGUI.setVisible(false);
               users.setVisible(false);
               delete.setVisible(false);
               break;
            
            case "viewProduct" :
                loginGUI.setVisible(false);
                addProductGUI.setVisible(false);
                viewProductsGUI.setVisible(true);
                users.setVisible(false);
                delete.setVisible(false);
            break;
            
            case "users" :
                loginGUI.setVisible(false);
                addProductGUI.setVisible(false);
                viewProductsGUI.setVisible(false);
                users.setVisible(true);
                delete.setVisible(false);
            break;
                        case "delete" :
                loginGUI.setVisible(false);
                addProductGUI.setVisible(false);
                viewProductsGUI.setVisible(false);
                users.setVisible(false);
                delete.setVisible(true);
            break;
            default :
               throw new Error("Wrong Filed name");
         }
 
    }
    
    
}


