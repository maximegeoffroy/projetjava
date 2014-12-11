/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package megacasting.ihm;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import static megacasting.Fonctions.Error.ErrorTest;
import megacasting.dao.OffreDAO;
import megacasting.dao.TypeContratDAO;
import megacasting.entite.Offre;
import megacasting.entite.TypeContrat;



/**
 *
 * @author ihamel
 */
public class contratFrame extends javax.swing.JFrame {

    /**
     * Creates new form contratFrame
     */
    public contratFrame() {
        initComponents();
        refreshList();
       
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContrat = new javax.swing.JPanel();
        buttonSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeContrat = new javax.swing.JList();
        buttonModifier = new javax.swing.JButton();
        buttonAjouter = new javax.swing.JButton();
        labelLibelleModifier = new javax.swing.JLabel();
        textFieldLibelleModifier = new javax.swing.JTextField();
        labelError = new javax.swing.JLabel();

        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        buttonSupprimer.setText("Supprimer");
        buttonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSupprimerActionPerformed(evt);
            }
        });

        listeContrat.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listeContratValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listeContrat);

        buttonModifier.setText("Modifier");
        buttonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifierActionPerformed(evt);
            }
        });

        buttonAjouter.setText("Ajouter un type de contrat");
        buttonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjouterActionPerformed(evt);
            }
        });

        labelLibelleModifier.setText("Contrat ");

        labelError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelContratLayout = new javax.swing.GroupLayout(panelContrat);
        panelContrat.setLayout(panelContratLayout);
        panelContratLayout.setHorizontalGroup(
            panelContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContratLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(buttonSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelLibelleModifier)
                .addGap(18, 18, 18)
                .addGroup(panelContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContratLayout.createSequentialGroup()
                        .addComponent(textFieldLibelleModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelContratLayout.createSequentialGroup()
                        .addGroup(panelContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelContratLayout.setVerticalGroup(
            panelContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContratLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelContratLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelLibelleModifier)
                    .addGroup(panelContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldLibelleModifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonModifier)
                .addGap(45, 45, 45)
                .addComponent(buttonAjouter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContrat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContrat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshList(int selectedIndex){
        DefaultListModel listModel = null;  
        
        if(listeContrat.getModel() instanceof DefaultListModel){
            listModel = (DefaultListModel) listeContrat.getModel();
            listModel.setSize(0);
        }else{
          listModel = new DefaultListModel(); 
          listeContrat.setModel(listModel);
        }
                
        List<TypeContrat> ltypeContrats = TypeContratDAO.lister(mainFrame.cnx);
        for (TypeContrat tc : ltypeContrats)
        {
            listModel.addElement(tc);
        }
        
        if(listModel.getSize() > 0){
            listeContrat.setSelectedIndex(selectedIndex);
        }
    }
    
    private void refreshList(){
        refreshList(0);
    }
    
    private void listeContratValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listeContratValueChanged
        TypeContrat tc = (TypeContrat) listeContrat.getSelectedValue();
        
        if (tc != null){
            textFieldLibelleModifier.setText(tc.getLibelle()); 
        }

    }//GEN-LAST:event_listeContratValueChanged

    private void buttonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifierActionPerformed
        TypeContrat tc = (TypeContrat) listeContrat.getSelectedValue();
        if(textFieldLibelleModifier.getText().isEmpty()){
            labelError.setText(ErrorTest.getTxt());
        }else{
            tc.setLibelle(textFieldLibelleModifier.getText());
        try {
            TypeContratDAO.modifier(mainFrame.cnx, tc);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(panelContrat, ex.toString());
        }
        JOptionPane.showMessageDialog(panelContrat, "La modification à réussie");
        refreshList(listeContrat.getSelectedIndex());
        }
    }//GEN-LAST:event_buttonModifierActionPerformed

    private void buttonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjouterActionPerformed
        new ajouterTypeContratFrame().setVisible(true);
    }//GEN-LAST:event_buttonAjouterActionPerformed

    private void buttonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSupprimerActionPerformed
        TypeContrat tc = (TypeContrat) listeContrat.getSelectedValue();
        int retour = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(panelContrat, "Êtes vous sur de vouloir supprimer ce contrat et toutes les offres qui y sont associées ?", "Attention", retour);
        
        if(retour == YES_OPTION){
            List<Offre> loffre = OffreDAO.lister(mainFrame.cnx);
            for(Offre o : loffre){
                if(o.getIdTypeContrat() == tc.getId()){
                    try {
                        OffreDAO.supprimer(mainFrame.cnx, o);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
            try {
                TypeContratDAO.supprimer(mainFrame.cnx, tc);
            } catch (Exception ex){
                JOptionPane.showMessageDialog(panelContrat, ex.toString());
            }
            JOptionPane.showMessageDialog(panelContrat, "La suppression à réussie");
            refreshList(listeContrat.getSelectedIndex());
        }
    }//GEN-LAST:event_buttonSupprimerActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        refreshList();
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(contratFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contratFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contratFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contratFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contratFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAjouter;
    private javax.swing.JButton buttonModifier;
    private javax.swing.JButton buttonSupprimer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelLibelleModifier;
    private javax.swing.JList listeContrat;
    private javax.swing.JPanel panelContrat;
    private javax.swing.JTextField textFieldLibelleModifier;
    // End of variables declaration//GEN-END:variables
}
