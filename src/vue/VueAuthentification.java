/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author btssio
 */
public class VueAuthentification extends VueGenerique {

    /**
     * Creates new form VueAuthentification
     */
    public VueAuthentification() {
        super();
        initComponents();
    }

    /**
     * Retourne un objet graphique de type <b>JTextField</b>
     *
     * @return jTextFieldLoggin
     */
    public JTextField getJTextFieldLoggin() {
        return jTextFieldLoggin;
    }

    /**
     * Retourne un objet graphique de type <b>JTextField</b>
     *
     * @return JpasswordFieldPassword
     */
    public JTextField getJTextFieldMdp() {
        return jPasswordFieldPassword;
    }

    /**
     * Retourne un objet graphique de type <b>JTextField</b>
     *
     * @return jTextFieldMode
     */
    public JTextField getJTextFieldMode() {
        return jTextFieldMode;
    }

    /**
     * Retourne un objet graphique de type <b>JButton</b>
     *
     * @return jButtonConnexion
     */
    public JButton getJButtonConnexion() {
        return jButtonConnexion;
    }

    /**
     * Retourne un objet graphique de type <b>JButton</b>
     *
     * @return jButtonQuitter
     */
    public JButton getJButtonQuitter() {
        return jButtonQuitter;
    }

    /**
     * Retourne un objet graphique de type <b>JButton</b>
     *
     * @return jButtonMode
     */
    public JButton getJButtonMode() {
        return jButtonMode;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldLoggin = new javax.swing.JTextField();
        jButtonConnexion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonQuitter = new javax.swing.JButton();
        jButtonMode = new javax.swing.JButton();
        jTextFieldMode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLogginActionPerformed(evt);
            }
        });

        jButtonConnexion.setText("Valider");
        jButtonConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnexionActionPerformed(evt);
            }
        });

        jLabel1.setText("Authentification locale");

        jButtonQuitter.setText("Quitter l'application");

        jButtonMode.setText("Changer le mode de connection");

        jTextFieldMode.setEditable(false);
        jTextFieldMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMode)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 89, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jTextFieldLoggin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonConnexion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldPassword))
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonMode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonQuitter)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldLoggin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButtonConnexion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonMode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQuitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLogginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLogginActionPerformed

    private void jButtonConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConnexionActionPerformed

    private void jTextFieldModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModeActionPerformed

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
            java.util.logging.Logger.getLogger(VueAuthentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueAuthentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueAuthentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueAuthentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueAuthentification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnexion;
    private javax.swing.JButton jButtonMode;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldLoggin;
    private javax.swing.JTextField jTextFieldMode;
    // End of variables declaration//GEN-END:variables
}
