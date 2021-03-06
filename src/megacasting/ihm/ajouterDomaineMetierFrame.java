/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megacasting.ihm;

import javax.swing.JOptionPane;
import megacasting.dao.DomaineMetierDAO;
import megacasting.entite.DomaineMetier;

/**
 *
 * @author MAXIME
 */
public class ajouterDomaineMetierFrame extends javax.swing.JFrame {

    /**
     * Creates new form ajouterDomaineMetierFrame
     */
    public ajouterDomaineMetierFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAjouterDomaineMetier = new javax.swing.JPanel();
        labelLibelle = new javax.swing.JLabel();
        textFieldLibelle = new javax.swing.JTextField();
        buttonAjouter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAjouterDomaineMetier.setBackground(new java.awt.Color(153, 153, 153));

        labelLibelle.setText("Libellé");

        buttonAjouter.setText("Ajouter");
        buttonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAjouterDomaineMetierLayout = new javax.swing.GroupLayout(panelAjouterDomaineMetier);
        panelAjouterDomaineMetier.setLayout(panelAjouterDomaineMetierLayout);
        panelAjouterDomaineMetierLayout.setHorizontalGroup(
            panelAjouterDomaineMetierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjouterDomaineMetierLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelLibelle)
                .addGap(64, 64, 64)
                .addGroup(panelAjouterDomaineMetierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAjouter)
                    .addComponent(textFieldLibelle, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        panelAjouterDomaineMetierLayout.setVerticalGroup(
            panelAjouterDomaineMetierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjouterDomaineMetierLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelAjouterDomaineMetierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldLibelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLibelle))
                .addGap(18, 18, 18)
                .addComponent(buttonAjouter)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ajouter un domaine métier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(panelAjouterDomaineMetier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAjouterDomaineMetier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjouterActionPerformed
        DomaineMetier dm = new DomaineMetier();
        dm.setLibelle(textFieldLibelle.getText());
        
        try {
            DomaineMetierDAO.creer(mainFrame.cnx, dm);
            JOptionPane.showMessageDialog(panelAjouterDomaineMetier, "L'ajout a réussie");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelAjouterDomaineMetier, ex.toString());
        }
        this.dispose();
    }//GEN-LAST:event_buttonAjouterActionPerformed

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
            java.util.logging.Logger.getLogger(ajouterDomaineMetierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajouterDomaineMetierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajouterDomaineMetierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajouterDomaineMetierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajouterDomaineMetierFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAjouter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelLibelle;
    private javax.swing.JPanel panelAjouterDomaineMetier;
    private javax.swing.JTextField textFieldLibelle;
    // End of variables declaration//GEN-END:variables
}
