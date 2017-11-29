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
public class ViewEngine {
    
    // Views
    Login loginGUI = new Login(this);
    AddProductGUI addProductGUI = new AddProductGUI(this);
    ViewProductsGUI viewProductsGUI = new ViewProductsGUI(this);
    
    public ViewEngine() {
        loginGUI.setVisible(false);
        addProductGUI.setVisible(false);
        viewProductsGUI.setVisible(false);
    }
    
    public void render(String viewName) {
        switch(viewName) {
            case "login" :
               loginGUI.setVisible(true);
               addProductGUI.setVisible(false);
               viewProductsGUI.setVisible(false);
               // Statements
               break; // optional

            case "addProduct" :
               loginGUI.setVisible(false);
               addProductGUI.setVisible(true);
               viewProductsGUI.setVisible(false);
               break;
            
            case "viewProduct" :
                loginGUI.setVisible(false);
                addProductGUI.setVisible(false);
                viewProductsGUI.setVisible(true);
            break;
            
            default :
               throw new Error("Wrong Filed name");
         }
 
    }
    
    
}
