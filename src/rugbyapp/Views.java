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


public class Views {
    
    LoginGUI loginGUI = new LoginGUI(this);
    AddProductGUI addProductGUI = new AddProductGUI(this);
    ViewProductsGUI viewProductsGUI = new ViewProductsGUI(this);
    
    
    public void render(String viewName) {
        
        loginGUI.setVisible(false);
        addProductGUI.setVisible(false);
        viewProductsGUI.setVisible(false);
        
        switch(viewName.toLowerCase()) {
            case "login" :
               loginGUI.setVisible(true);
               break; 

            case "addproduct" :
                addProductGUI.setVisible(true);
               break;
            
            case "viewproduct" :
                viewProductsGUI.setVisible(true);
            break;
            
            default :
               throw new Error("Wrong Filed name");
         }
 
    }
    
    
}


