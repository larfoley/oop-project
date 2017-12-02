/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;

/**
 *
 * @author James Ganley
 */
public class ViewProductsGUI extends javax.swing.JFrame {
    private Views view;
    /**
     * Creates new form ViewProductsGUI
     */
    
    public ViewProductsGUI() {
    }
    
    public ViewProductsGUI(Views view) {
        initComponents();
        this.view = view;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewProductsLabel = new javax.swing.JLabel();
        addProductsChangePageButton = new javax.swing.JButton();
        viewProductsChangePageButton = new javax.swing.JButton();
        productsTypeLabel = new javax.swing.JLabel();
        productsTypeComboBox = new javax.swing.JComboBox<>();
        viewProductsGetListButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewProductsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewProductsLabel.setText("View Products");

        addProductsChangePageButton.setText("Add Products");
        addProductsChangePageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductsChangePageButtonActionPerformed(evt);
            }
        });

        viewProductsChangePageButton.setText("View Products");

        productsTypeLabel.setText("Products Type");

        productsTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        productsTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsTypeComboBoxActionPerformed(evt);
            }
        });

        viewProductsGetListButton.setText("View Products");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(addProductsChangePageButton)
                        .addGap(78, 78, 78)
                        .addComponent(viewProductsChangePageButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productsTypeLabel)
                            .addComponent(productsTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(viewProductsLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(viewProductsGetListButton)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProductsChangePageButton)
                    .addComponent(viewProductsChangePageButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewProductsLabel)
                .addGap(18, 18, 18)
                .addComponent(productsTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productsTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewProductsGetListButton)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productsTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productsTypeComboBoxActionPerformed

    private void addProductsChangePageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductsChangePageButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addProductsChangePageButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProductsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProductsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProductsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProductsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ViewProductsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductsChangePageButton;
    private javax.swing.JComboBox<String> productsTypeComboBox;
    private javax.swing.JLabel productsTypeLabel;
    private javax.swing.JButton viewProductsChangePageButton;
    private javax.swing.JButton viewProductsGetListButton;
    private javax.swing.JLabel viewProductsLabel;
    // End of variables declaration//GEN-END:variables
}
