/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyapp;

/**
 *
 * @author x16103530
 */
public class UsersGUI extends javax.swing.JFrame {

    private Views view;
    /**
     * Creates new form UsersGUI
     */
    public UsersGUI(Views view) {
        initComponents();
        this.view=view;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserTitleLabel = new javax.swing.JLabel();
        CreateUseLabel = new javax.swing.JLabel();
        createUserTf = new javax.swing.JTextField();
        CreateUsernameLable = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordTf = new javax.swing.JTextField();
        CreateUserBtn = new javax.swing.JToggleButton();
        DeleteUseLabel = new javax.swing.JLabel();
        DeleteUsernameLable = new javax.swing.JLabel();
        DeleteUserTf = new javax.swing.JTextField();
        DeletUserBtn = new javax.swing.JToggleButton();
        addProductBtn = new javax.swing.JToggleButton();
        viewProductBtn = new javax.swing.JToggleButton();
        UserBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserTitleLabel.setText("Users");

        CreateUseLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CreateUseLabel.setText("Creats User");

        CreateUsernameLable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        CreateUsernameLable.setText("Username :");

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        PasswordLabel.setText("Password :");

        CreateUserBtn.setText("Create User");

        DeleteUseLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteUseLabel.setText("Delete User");

        DeleteUsernameLable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        DeleteUsernameLable.setText("Username");

        DeletUserBtn.setText("Delete User");

        addProductBtn.setText("Add Products");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });

        viewProductBtn.setText("View Products");
        viewProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductBtnActionPerformed(evt);
            }
        });

        UserBtn.setText("Users");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addProductBtn)
                        .addGap(57, 57, 57)
                        .addComponent(UserBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewProductBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CreateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DeleteUseLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DeletUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(CreateUsernameLable)
                                                .addComponent(CreateUseLabel)
                                                .addComponent(createUserTf, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(PasswordLabel)))
                                        .addComponent(DeleteUsernameLable)
                                        .addComponent(DeleteUserTf)))))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(UserTitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProductBtn)
                    .addComponent(viewProductBtn)
                    .addComponent(UserBtn))
                .addGap(18, 18, 18)
                .addComponent(UserTitleLabel)
                .addGap(18, 18, 18)
                .addComponent(CreateUseLabel)
                .addGap(26, 26, 26)
                .addComponent(CreateUsernameLable)
                .addGap(18, 18, 18)
                .addComponent(createUserTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(CreateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(DeleteUseLabel)
                .addGap(18, 18, 18)
                .addComponent(DeleteUsernameLable)
                .addGap(18, 18, 18)
                .addComponent(DeleteUserTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(DeletUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductBtnActionPerformed
        // TODO add your handling code here:
        view.render("viewProduct");
    }//GEN-LAST:event_viewProductBtnActionPerformed

    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
        // TODO add your handling code here:
        view.render("addProduct");
    }//GEN-LAST:event_addProductBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UsersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel CreateUseLabel;
    private javax.swing.JToggleButton CreateUserBtn;
    private javax.swing.JLabel CreateUsernameLable;
    private javax.swing.JToggleButton DeletUserBtn;
    private javax.swing.JLabel DeleteUseLabel;
    private javax.swing.JTextField DeleteUserTf;
    private javax.swing.JLabel DeleteUsernameLable;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField PasswordTf;
    private javax.swing.JToggleButton UserBtn;
    private javax.swing.JLabel UserTitleLabel;
    private javax.swing.JToggleButton addProductBtn;
    private javax.swing.JTextField createUserTf;
    private javax.swing.JToggleButton viewProductBtn;
    // End of variables declaration//GEN-END:variables
}