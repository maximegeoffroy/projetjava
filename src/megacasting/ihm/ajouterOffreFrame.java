/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package megacasting.ihm;

import javax.swing.JOptionPane;
import megacasting.dao.OffreDAO;
import megacasting.entite.Offre;

/**
 *
 * @author ihamel
 */
public class ajouterOffreFrame extends javax.swing.JFrame {

    /**
     * Creates new form ajouterOffreFrame
     */
    public ajouterOffreFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        labelIntitule2 = new javax.swing.JLabel();
        labelReference2 = new javax.swing.JLabel();
        labelDatePublication2 = new javax.swing.JLabel();
        labelDureeDiffusion2 = new javax.swing.JLabel();
        labelDateDebutContrat2 = new javax.swing.JLabel();
        labelNbPoste2 = new javax.swing.JLabel();
        labelLocalisation2 = new javax.swing.JLabel();
        labelDescriptionPoste2 = new javax.swing.JLabel();
        labelDescriptionProfil2 = new javax.swing.JLabel();
        labelTelephone2 = new javax.swing.JLabel();
        labelEmail2 = new javax.swing.JLabel();
        labelTypeContrat2 = new javax.swing.JLabel();
        labelMetier2 = new javax.swing.JLabel();
        labelDomaineMetier2 = new javax.swing.JLabel();
        labelAnnonceur2 = new javax.swing.JLabel();
        textFieldIntitule2 = new javax.swing.JTextField();
        textFieldReference2 = new javax.swing.JTextField();
        textFieldLocalisation2 = new javax.swing.JTextField();
        textFieldEmail2 = new javax.swing.JTextField();
        textFieldTelephone2 = new javax.swing.JTextField();
        textFieldTypeContrat2 = new javax.swing.JTextField();
        textFieldMetier2 = new javax.swing.JTextField();
        textFieldDomaineMetier2 = new javax.swing.JTextField();
        textFieldAnnonceur2 = new javax.swing.JTextField();
        comboBoxNombrePoste2 = new javax.swing.JComboBox();
        comboBoxDateDebutContratMois2 = new javax.swing.JComboBox();
        comboBoxDateDebutContratJour2 = new javax.swing.JComboBox();
        comboBoxDateDebutContratAn2 = new javax.swing.JComboBox();
        comboBoxDatePublicationJour2 = new javax.swing.JComboBox();
        comboBoxDatePublicationMois2 = new javax.swing.JComboBox();
        comboboxDatePublicationAn2 = new javax.swing.JComboBox();
        labelJour2 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        textAreaDescriptionPoste2 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        textAreaDescriptionProfil2 = new javax.swing.JTextArea();
        spinnerDureeDiffusion2 = new javax.swing.JSpinner();
        buttonAjouterOffre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelIntitule2.setText("Intitule");

        labelReference2.setText("Référence");

        labelDatePublication2.setText("Date de publication");

        labelDureeDiffusion2.setText("Durée de diffusion");

        labelDateDebutContrat2.setText("Date du début du contrat");

        labelNbPoste2.setText("Nombre de poste");

        labelLocalisation2.setText("Localisation");

        labelDescriptionPoste2.setText("Description du poste");

        labelDescriptionProfil2.setText("Description du profil");

        labelTelephone2.setText("Numéro de téléphone");

        labelEmail2.setText("Email");

        labelTypeContrat2.setText("Type de contrat");

        labelMetier2.setText("Métier");

        labelDomaineMetier2.setText("Domaine de métier");

        labelAnnonceur2.setText("Annonceur");

        labelJour2.setText("Jour(s)");

        textAreaDescriptionPoste2.setColumns(20);
        textAreaDescriptionPoste2.setRows(5);
        jScrollPane8.setViewportView(textAreaDescriptionPoste2);

        textAreaDescriptionProfil2.setColumns(20);
        textAreaDescriptionProfil2.setRows(5);
        jScrollPane9.setViewportView(textAreaDescriptionProfil2);

        buttonAjouterOffre.setText("Ajouter");
        buttonAjouterOffre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjouterOffreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIntitule2)
                    .addComponent(labelAnnonceur2)
                    .addComponent(labelDomaineMetier2)
                    .addComponent(labelReference2)
                    .addComponent(labelDatePublication2)
                    .addComponent(labelDureeDiffusion2)
                    .addComponent(labelDateDebutContrat2)
                    .addComponent(labelNbPoste2)
                    .addComponent(labelLocalisation2)
                    .addComponent(labelDescriptionPoste2)
                    .addComponent(labelDescriptionProfil2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelMetier2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTelephone2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(labelEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTypeContrat2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldReference2)
                    .addComponent(textFieldIntitule2)
                    .addComponent(textFieldDomaineMetier2)
                    .addComponent(textFieldMetier2)
                    .addComponent(textFieldTypeContrat2)
                    .addComponent(textFieldLocalisation2)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane9)
                    .addComponent(textFieldTelephone2)
                    .addComponent(textFieldEmail2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAjouterOffre)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboBoxDateDebutContratJour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxDateDebutContratMois2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxDateDebutContratAn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboBoxDatePublicationJour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxDatePublicationMois2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboboxDatePublicationAn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBoxNombrePoste2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldAnnonceur2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spinnerDureeDiffusion2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelJour2)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIntitule2)
                    .addComponent(textFieldIntitule2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelReference2)
                    .addComponent(textFieldReference2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDatePublication2)
                    .addComponent(comboBoxDatePublicationJour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDatePublicationMois2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboboxDatePublicationAn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDureeDiffusion2)
                    .addComponent(labelJour2)
                    .addComponent(spinnerDureeDiffusion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateDebutContrat2)
                    .addComponent(comboBoxDateDebutContratMois2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDateDebutContratJour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDateDebutContratAn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNbPoste2)
                    .addComponent(comboBoxNombrePoste2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLocalisation2)
                    .addComponent(textFieldLocalisation2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDescriptionPoste2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDescriptionProfil2))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldTelephone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelephone2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTypeContrat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTypeContrat2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldMetier2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetier2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldDomaineMetier2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDomaineMetier2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAnnonceur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAnnonceur2))
                .addGap(18, 18, 18)
                .addComponent(buttonAjouterOffre)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAjouterOffreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjouterOffreActionPerformed
        Offre o = (Offre) listeOffre.getSelectedValue();
        
        o.setIntitule(textFieldIntitule.getText());
        o.setReference(textFieldReference.getText());
        // Date public 
        o.setDureeDiffusion((int)spinnerDureeDiffusion.getValue());
        // Date Debut
        o.setNbPostes((int)comboBoxNombrePoste.getSelectedItem());
        o.setLocalisation(textFieldLocalisation.getText());
        o.setDescriptionPoste(textAreaDescriptionPoste.getText());
        o.setDescriptionProfil(textAreaDescriptionPoste.getText());
        o.setTelephone(textFieldTelephone.getText());
        o.setMail(textFieldEmail.getText());
        // TypeContrat
        // Metier
        // Domaine Metier
        // annonceur
        
        try {
            OffreDAO.creer(mainFrame.cnx, o);
        } catch (Exception ex){
            ex.printStackTrace();
        }     
        JOptionPane.showMessageDialog(null, "Offre Ajoutée !");
        this.dispose();
    }//GEN-LAST:event_buttonAjouterOffreActionPerformed

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
            java.util.logging.Logger.getLogger(ajouterOffreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajouterOffreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajouterOffreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajouterOffreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajouterOffreFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAjouter;
    private javax.swing.JButton buttonAjouter1;
    private javax.swing.JButton buttonAjouterOffre;
    private javax.swing.JButton buttonModifier;
    private javax.swing.JButton buttonModifier1;
    private javax.swing.JButton buttonSupprimer;
    private javax.swing.JButton buttonSupprimer1;
    private javax.swing.JComboBox comboBoxDateDebutContratAn;
    private javax.swing.JComboBox comboBoxDateDebutContratAn1;
    private javax.swing.JComboBox comboBoxDateDebutContratAn2;
    private javax.swing.JComboBox comboBoxDateDebutContratJour;
    private javax.swing.JComboBox comboBoxDateDebutContratJour1;
    private javax.swing.JComboBox comboBoxDateDebutContratJour2;
    private javax.swing.JComboBox comboBoxDateDebutContratMois;
    private javax.swing.JComboBox comboBoxDateDebutContratMois1;
    private javax.swing.JComboBox comboBoxDateDebutContratMois2;
    private javax.swing.JComboBox comboBoxDatePublicationJour;
    private javax.swing.JComboBox comboBoxDatePublicationJour1;
    private javax.swing.JComboBox comboBoxDatePublicationJour2;
    private javax.swing.JComboBox comboBoxDatePublicationMois;
    private javax.swing.JComboBox comboBoxDatePublicationMois1;
    private javax.swing.JComboBox comboBoxDatePublicationMois2;
    private javax.swing.JComboBox comboBoxNombrePoste;
    private javax.swing.JComboBox comboBoxNombrePoste1;
    private javax.swing.JComboBox comboBoxNombrePoste2;
    private javax.swing.JComboBox comboboxDatePublicationAn;
    private javax.swing.JComboBox comboboxDatePublicationAn1;
    private javax.swing.JComboBox comboboxDatePublicationAn2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel labelAnnonceur;
    private javax.swing.JLabel labelAnnonceur1;
    private javax.swing.JLabel labelAnnonceur2;
    private javax.swing.JLabel labelDateDebutContrat;
    private javax.swing.JLabel labelDateDebutContrat1;
    private javax.swing.JLabel labelDateDebutContrat2;
    private javax.swing.JLabel labelDatePublication;
    private javax.swing.JLabel labelDatePublication1;
    private javax.swing.JLabel labelDatePublication2;
    private javax.swing.JLabel labelDescriptionPoste;
    private javax.swing.JLabel labelDescriptionPoste1;
    private javax.swing.JLabel labelDescriptionPoste2;
    private javax.swing.JLabel labelDescriptionProfil;
    private javax.swing.JLabel labelDescriptionProfil1;
    private javax.swing.JLabel labelDescriptionProfil2;
    private javax.swing.JLabel labelDomaineMetier;
    private javax.swing.JLabel labelDomaineMetier1;
    private javax.swing.JLabel labelDomaineMetier2;
    private javax.swing.JLabel labelDureeDiffusion;
    private javax.swing.JLabel labelDureeDiffusion1;
    private javax.swing.JLabel labelDureeDiffusion2;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmail1;
    private javax.swing.JLabel labelEmail2;
    private javax.swing.JLabel labelIntitule;
    private javax.swing.JLabel labelIntitule1;
    private javax.swing.JLabel labelIntitule2;
    private javax.swing.JLabel labelJour;
    private javax.swing.JLabel labelJour1;
    private javax.swing.JLabel labelJour2;
    private javax.swing.JLabel labelLocalisation;
    private javax.swing.JLabel labelLocalisation1;
    private javax.swing.JLabel labelLocalisation2;
    private javax.swing.JLabel labelMetier;
    private javax.swing.JLabel labelMetier1;
    private javax.swing.JLabel labelMetier2;
    private javax.swing.JLabel labelNbPoste;
    private javax.swing.JLabel labelNbPoste1;
    private javax.swing.JLabel labelNbPoste2;
    private javax.swing.JLabel labelReference;
    private javax.swing.JLabel labelReference1;
    private javax.swing.JLabel labelReference2;
    private javax.swing.JLabel labelTelephone;
    private javax.swing.JLabel labelTelephone1;
    private javax.swing.JLabel labelTelephone2;
    private javax.swing.JLabel labelTypeContrat;
    private javax.swing.JLabel labelTypeContrat1;
    private javax.swing.JLabel labelTypeContrat2;
    private javax.swing.JList listeOffre;
    private javax.swing.JList listeOffre1;
    private javax.swing.JSpinner spinnerDureeDiffusion;
    private javax.swing.JSpinner spinnerDureeDiffusion1;
    private javax.swing.JSpinner spinnerDureeDiffusion2;
    private javax.swing.JTextArea textAreaDescriptionPoste;
    private javax.swing.JTextArea textAreaDescriptionPoste1;
    private javax.swing.JTextArea textAreaDescriptionPoste2;
    private javax.swing.JTextArea textAreaDescriptionProfil;
    private javax.swing.JTextArea textAreaDescriptionProfil1;
    private javax.swing.JTextArea textAreaDescriptionProfil2;
    private javax.swing.JTextField textFieldAnnonceur;
    private javax.swing.JTextField textFieldAnnonceur1;
    private javax.swing.JTextField textFieldAnnonceur2;
    private javax.swing.JTextField textFieldDomaineMetier;
    private javax.swing.JTextField textFieldDomaineMetier1;
    private javax.swing.JTextField textFieldDomaineMetier2;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEmail1;
    private javax.swing.JTextField textFieldEmail2;
    private javax.swing.JTextField textFieldIntitule;
    private javax.swing.JTextField textFieldIntitule1;
    private javax.swing.JTextField textFieldIntitule2;
    private javax.swing.JTextField textFieldLocalisation;
    private javax.swing.JTextField textFieldLocalisation1;
    private javax.swing.JTextField textFieldLocalisation2;
    private javax.swing.JTextField textFieldMetier;
    private javax.swing.JTextField textFieldMetier1;
    private javax.swing.JTextField textFieldMetier2;
    private javax.swing.JTextField textFieldReference;
    private javax.swing.JTextField textFieldReference1;
    private javax.swing.JTextField textFieldReference2;
    private javax.swing.JTextField textFieldTelephone;
    private javax.swing.JTextField textFieldTelephone1;
    private javax.swing.JTextField textFieldTelephone2;
    private javax.swing.JTextField textFieldTypeContrat;
    private javax.swing.JTextField textFieldTypeContrat1;
    private javax.swing.JTextField textFieldTypeContrat2;
    // End of variables declaration//GEN-END:variables
}