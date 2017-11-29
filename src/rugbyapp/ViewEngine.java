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
    Login loginGUI = new Login();
    AddProductGUI addProductGUI = new AddProductGUI();
    ViewProductsGUI viewProductsGUI = new ViewProductsGUI();
    
    public ViewEngine() {
        loginGUI.setVisible(true);
        addProductGUI.setVisible(true);
        viewProductsGUI.setVisible(true);
    }
    
    public void render(String viewName) {
        switch(viewName) {
            case "login" :
               loginGUI.setVisible(true);
               addProductGUI.setVisible(true);
               viewProductsGUI.setVisible(true);
               // Statements
               break; // optional

            case "add" :
               loginGUI.setVisible(true);
               addProductGUI.setVisible(true);
               viewProductsGUI.setVisible(true);
               break;
            
            default :
               throw new Error("Wrong Filed name");
         }
        loginGUI.setVisible(true);
        loginGUI.setVisible(true);
        loginGUI.setVisible(true);
    }
    
    
}
