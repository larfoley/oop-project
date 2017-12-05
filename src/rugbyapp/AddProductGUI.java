/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;

import java.util.ArrayList;
//import java

/**
 *
 * @author blras-Ashish Kumar Singh
 */
public class AddProductGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form AddProductGUI
     */
         private Views view;
         
         private ArrayList<Product> stock;

    public AddProductGUI(Views view) {
        initComponents();
        this.view = view;
        TeamLabel.setVisible(false);  
        SleeveTypeLabel.setVisible(false);  
        CollarTypeLabel.setVisible(false);  
        GloveTypeLabel.setVisible(false);  
        TeamTf.setVisible(false);  
        SleeveComboBox.setVisible(false);  
        CollarComboBox.setVisible(false);  
        GloveTypeComboBox.setVisible(false);  
        GloveMaterialLabel.setVisible(false);  
        GloveMaterialComboBox.setVisible(false);  
        WeatherTypeLabel.setVisible(false);  
        WeatherComboBox.setVisible(false);  
        StudTypeLabel.setVisible(false);  
        StudComboBox.setVisible(false);
        AddProductBtn.setVisible(false);
        PriceLabel.setVisible(false);
        PriceTf.setVisible(false);
        ProductNameLabel.setVisible(false);
        ProductNameTf.setVisible(false);
        QuantityLabel.setVisible(false);
        QuantityTf.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        AddBtn = new javax.swing.JToggleButton();
        ViewBtn = new javax.swing.JToggleButton();
        AddProductLbl = new javax.swing.JLabel();
        ProductTypeLabel = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox<>();
        ProductNameLabel = new javax.swing.JLabel();
        ProductNameTf = new javax.swing.JTextField();
        QuantityLabel = new javax.swing.JLabel();
        QuantityTf = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        PriceTf = new javax.swing.JTextField();
        TeamLabel = new javax.swing.JLabel();
        SleeveTypeLabel = new javax.swing.JLabel();
        CollarTypeLabel = new javax.swing.JLabel();
        GloveTypeLabel = new javax.swing.JLabel();
        TeamTf = new javax.swing.JTextField();
        SleeveComboBox = new javax.swing.JComboBox<>();
        CollarComboBox = new javax.swing.JComboBox<>();
        GloveTypeComboBox = new javax.swing.JComboBox<>();
        GloveMaterialLabel = new javax.swing.JLabel();
        GloveMaterialComboBox = new javax.swing.JComboBox<>();
        WeatherTypeLabel = new javax.swing.JLabel();
        WeatherComboBox = new javax.swing.JComboBox<>();
        StudTypeLabel = new javax.swing.JLabel();
        StudComboBox = new javax.swing.JComboBox<>();
        AddProductBtn = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        logoutBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(233, 72, 101));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 72, 132));

        AddBtn.setText("Add Product");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        ViewBtn.setText("View Product");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        AddProductLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AddProductLbl.setText("Add Product");

        ProductTypeLabel.setText("Product Type");

        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Jersey", "Boots", "Gloves" }));
        TypeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TypeComboBoxItemStateChanged(evt);
            }
        });
        TypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeComboBoxActionPerformed(evt);
            }
        });

        ProductNameLabel.setText("Product Name");

        ProductNameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameTfActionPerformed(evt);
            }
        });

        QuantityLabel.setText("Quantity");

        PriceLabel.setText("Price");

        TeamLabel.setText("Team");

        SleeveTypeLabel.setText("SleeveType");

        CollarTypeLabel.setText("Collar Type");

        GloveTypeLabel.setText("Glove Type");

        SleeveComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Long Sleeve", "Short Sleeve", "No Sleeve", " " }));
        SleeveComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SleeveComboBoxActionPerformed(evt);
            }
        });

        CollarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Round Collar", "V-Neck Collar", "Default Collar" }));

        GloveTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fingerless Gloves", "Full Gloves" }));

        GloveMaterialLabel.setText("Glove Material");

        GloveMaterialComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cotton", "Leather", "Linen" }));
        GloveMaterialComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GloveMaterialComboBoxActionPerformed(evt);
            }
        });

        WeatherTypeLabel.setText("Weather Type");

        WeatherComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dry Weather", "Wet Weather" }));

        StudTypeLabel.setText("Stud Type");

        StudComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metal Studs", "Plastic Studs" }));

        AddProductBtn.setText("Add Product");
        AddProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductBtnActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Users");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddBtn)
                        .addGap(35, 35, 35)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(ViewBtn)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(AddProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ProductTypeLabel)
                                                .addComponent(ProductNameLabel)
                                                .addComponent(QuantityLabel)
                                                .addComponent(PriceLabel)
                                                .addComponent(TeamLabel)
                                                .addComponent(CollarTypeLabel)
                                                .addComponent(GloveTypeLabel)
                                                .addComponent(SleeveTypeLabel)
                                                .addComponent(GloveMaterialLabel)
                                                .addComponent(WeatherTypeLabel)
                                                .addComponent(StudTypeLabel))
                                            .addGap(72, 72, 72)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(TypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ProductNameTf)
                                                .addComponent(QuantityTf)
                                                .addComponent(PriceTf)
                                                .addComponent(GloveTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TeamTf)
                                                .addComponent(SleeveComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CollarComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(GloveMaterialComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(WeatherComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(StudComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addComponent(AddProductLbl)))
                                    .addGap(41, 41, 41)))
                            .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoutBtn)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(ViewBtn)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18)
                .addComponent(AddProductLbl)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductTypeLabel)
                    .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductNameLabel)
                    .addComponent(ProductNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantityLabel)
                    .addComponent(QuantityTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceLabel)
                    .addComponent(PriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeamTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeamLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SleeveTypeLabel)
                    .addComponent(SleeveComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CollarTypeLabel)
                    .addComponent(CollarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GloveTypeLabel)
                    .addComponent(GloveTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GloveMaterialLabel)
                    .addComponent(GloveMaterialComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WeatherTypeLabel)
                    .addComponent(WeatherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudTypeLabel)
                    .addComponent(StudComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(AddProductBtn)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductNameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameTfActionPerformed

    private void GloveMaterialComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GloveMaterialComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GloveMaterialComboBoxActionPerformed

    private void SleeveComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SleeveComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SleeveComboBoxActionPerformed

    private void AddProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductBtnActionPerformed
        // TODO add your handling code here:
        
        Stock stock = new Stock();
        boolean formIsValid=true;
        String productType = (String)TypeComboBox.getSelectedItem();
        int quantity;
        String name;
        double price;
        String team;
        String sleeveType;
        String collarType;
        String gloveType;
        String material;
        String weather;
        String studType;
        
        
        //====================================
        // Validate form inputs
        //====================================
        
        
        try {
            Integer.parseInt(QuantityTf.getText());
            Double.parseDouble(PriceTf.getText());
            
        } catch (NumberFormatException e) {            
            formIsValid=false;
        }
        
        if (formIsValid) {
           if ((QuantityTf.getText().equals("0")) ) {
               formIsValid=false;
           }  
        }
        
        if (ProductNameTf.getText().trim().equals("")) {
            formIsValid=false;
        }
        
        
        if (productType.equals("Jersey")) {
            // Validate jersey inputs
            if(TeamTf.getText().trim().equals("") ){
                formIsValid=false;
            }
        } 
    
        
        //====================================
        // if form is valid add products else 
        // display error
        //=====================================
        
        if (formIsValid) {
            // Add Product
            
            // Asign univeral products variables
            quantity=Integer.parseInt(QuantityTf.getText());
            name = ProductNameTf.getText();
            price = Double.parseDouble(PriceTf.getText());
            
           if (productType.equals("Jersey")) {
               
                team = TeamTf.getText();
                sleeveType = (String)SleeveComboBox.getSelectedItem();
                collarType = (String)CollarComboBox.getSelectedItem();
                
                // add products based on quantity
                for (int i = 0; i < quantity; i++) {
                stock.addProduct(new Jersey(name, price, team, sleeveType, collarType));
                
                    
            }
            
            } else if (productType.equals("Boots")) {
                studType = (String)StudComboBox.getSelectedItem();
                for (int i = 0; i < quantity; i++) {
                stock.addProduct(new Boots(name, price, studType));
                
                    
            }
                
            } else {
                
                gloveType = (String)GloveTypeComboBox.getSelectedItem();
                material = (String)GloveMaterialComboBox.getSelectedItem();
                weather = (String)WeatherComboBox.getSelectedItem();
                
                for (int i = 0; i < quantity; i++) {
                stock.addProduct(new Gloves(name, price, gloveType, material, weather));
                
                }
                
            }
           DialogBox.alert("Product Added");
           QuantityTf.setText("");
           ProductNameTf.setText("");
           PriceTf.setText("");
           TeamTf.setText("");

        } else {
            // Display error
            DialogBox.alert("Some required feilds are blank");
        }
        
        
        
    }//GEN-LAST:event_AddProductBtnActionPerformed

    private void TypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeComboBoxActionPerformed

    private void TypeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TypeComboBoxItemStateChanged
        // TODO add tyour handling code here:
        if (evt.getStateChange() == 2){
            
            String  selectedvalue = "";
            selectedvalue=(String)TypeComboBox.getSelectedItem();
            
            if(selectedvalue.equals("Jersey")) {
                
  
        TeamLabel.setVisible(true);  
        SleeveTypeLabel.setVisible(true);  
        CollarTypeLabel.setVisible(true);  
        GloveTypeLabel.setVisible(false);  
        TeamTf.setVisible(true);  
        SleeveComboBox.setVisible(true);  
        CollarComboBox.setVisible(true);  
        GloveTypeComboBox.setVisible(false);  
        GloveMaterialLabel.setVisible(false);  
        GloveMaterialComboBox.setVisible(false);  
        WeatherTypeLabel.setVisible(false);  
        WeatherComboBox.setVisible(false);  
        StudTypeLabel.setVisible(false);  
        StudComboBox.setVisible(false); 
        PriceLabel.setVisible(true);
        PriceTf.setVisible(true);
        ProductNameLabel.setVisible(true);
        ProductNameTf.setVisible(true);
        QuantityLabel.setVisible(true);
        QuantityTf.setVisible(true);
        AddProductBtn.setVisible(true);
       
        } else if(selectedvalue.equals("Boots")) {
                
              TeamLabel.setVisible(false);  
        SleeveTypeLabel.setVisible(false);  
        CollarTypeLabel.setVisible(false);  
        GloveTypeLabel.setVisible(false);  
        TeamTf.setVisible(false);  
        SleeveComboBox.setVisible(false);  
        CollarComboBox.setVisible(false);  
        GloveTypeComboBox.setVisible(false);  
        GloveMaterialLabel.setVisible(false);  
        GloveMaterialComboBox.setVisible(false);  
        WeatherTypeLabel.setVisible(false);  
        WeatherComboBox.setVisible(false);  
        StudTypeLabel.setVisible(true);  
        StudComboBox.setVisible(true);
        PriceLabel.setVisible(true);
        PriceTf.setVisible(true);
        ProductNameLabel.setVisible(true);
        ProductNameTf.setVisible(true);
        QuantityLabel.setVisible(true);
        QuantityTf.setVisible(true);
        AddProductBtn.setVisible(true);
        
        }else {
                    TeamLabel.setVisible(false);  
        SleeveTypeLabel.setVisible(false);  
        CollarTypeLabel.setVisible(false);  
        GloveTypeLabel.setVisible(true);  
        TeamTf.setVisible(false);  
        SleeveComboBox.setVisible(false);  
        CollarComboBox.setVisible(false);  
        GloveTypeComboBox.setVisible(true);  
        GloveMaterialLabel.setVisible(true);  
        GloveMaterialComboBox.setVisible(true);  
        WeatherTypeLabel.setVisible(true);  
        WeatherComboBox.setVisible(true);  
        StudTypeLabel.setVisible(false);  
        StudComboBox.setVisible(false);
        PriceLabel.setVisible(true);
        PriceTf.setVisible(true);
        ProductNameLabel.setVisible(true);
        ProductNameTf.setVisible(true);
        QuantityLabel.setVisible(true);
        QuantityTf.setVisible(true);
        AddProductBtn.setVisible(true);
        }
        }
        

         
        
    }//GEN-LAST:event_TypeComboBoxItemStateChanged

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        // TODO add your handling code here:
        view.render("viewProduct");
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        view.render("users");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        view.render("addProduct");
    }//GEN-LAST:event_AddBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
                view.render("login");

    }//GEN-LAST:event_logoutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AddProductGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AddBtn;
    private javax.swing.JToggleButton AddProductBtn;
    private javax.swing.JLabel AddProductLbl;
    private javax.swing.JComboBox<String> CollarComboBox;
    private javax.swing.JLabel CollarTypeLabel;
    private javax.swing.JComboBox<String> GloveMaterialComboBox;
    private javax.swing.JLabel GloveMaterialLabel;
    private javax.swing.JComboBox<String> GloveTypeComboBox;
    private javax.swing.JLabel GloveTypeLabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField PriceTf;
    private javax.swing.JLabel ProductNameLabel;
    private javax.swing.JTextField ProductNameTf;
    private javax.swing.JLabel ProductTypeLabel;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JTextField QuantityTf;
    private javax.swing.JComboBox<String> SleeveComboBox;
    private javax.swing.JLabel SleeveTypeLabel;
    private javax.swing.JComboBox<String> StudComboBox;
    private javax.swing.JLabel StudTypeLabel;
    private javax.swing.JLabel TeamLabel;
    private javax.swing.JTextField TeamTf;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JToggleButton ViewBtn;
    private javax.swing.JComboBox<String> WeatherComboBox;
    private javax.swing.JLabel WeatherTypeLabel;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
