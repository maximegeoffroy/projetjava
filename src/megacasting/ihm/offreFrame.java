/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megacasting.ihm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import megacasting.dao.AnnonceurDAO;
import megacasting.dao.DomaineMetierDAO;
import megacasting.dao.MetierDAO;
import megacasting.dao.OffreDAO;
import megacasting.dao.SocieteDAO;
import megacasting.dao.TypeContratDAO;
import megacasting.entite.Annonceur;
import megacasting.entite.DomaineMetier;
import megacasting.entite.Metier;
import megacasting.entite.Offre;
import megacasting.entite.Societe;
import megacasting.entite.TypeContrat;

/**
 *
 * @author ihamel
 */
public class offreFrame extends javax.swing.JFrame {

    /**
     * Creates new form offreFrame
     */
    public offreFrame() {
        initComponents();
        refreshList();
        refreshComboBox();
    }

    private void refreshList(int selectedIndex) {
        DefaultListModel listModel = null;

        if (listeOffre.getModel() instanceof DefaultListModel) {
            listModel = (DefaultListModel) listeOffre.getModel();
            listModel.setSize(0);
        } else {
            listModel = new DefaultListModel();
            listeOffre.setModel(listModel);
        }

        List<Offre> lOffre = OffreDAO.lister(mainFrame.cnx);
        for (Offre o : lOffre) {
            listModel.addElement(o);
        }

        if (listModel.getSize() > 0) {
            listeOffre.setSelectedIndex(selectedIndex);
        }
    }

    private void refreshList() {
        refreshList(0);
    }

    private void refreshComboBox() {
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        for (int i = 1; i < 11; i++) {
            comboBoxModel.addElement(i);
        }
        comboBoxNombrePoste.setModel(comboBoxModel);

        // TypeContrat
        DefaultComboBoxModel comboBoxModelTypeContrat = new DefaultComboBoxModel();
        List<TypeContrat> lTypeContrat = TypeContratDAO.lister(mainFrame.cnx);
        for (TypeContrat tc : lTypeContrat) {
            comboBoxModelTypeContrat.addElement(tc.getLibelle());
        }
        comboBoxTypeContrat.setModel(comboBoxModelTypeContrat);

        // Metier
        DefaultComboBoxModel comboBoxModelMetier = new DefaultComboBoxModel();
        List<Metier> lMetier = MetierDAO.lister(mainFrame.cnx);
        for (Metier m : lMetier) {
            comboBoxModelMetier.addElement(m.getLibelle());
        }
        comboBoxMetier.setModel(comboBoxModelMetier);

        // Domaine Metier
        DefaultComboBoxModel comboBoxModelDomaineMetier = new DefaultComboBoxModel();
        List<DomaineMetier> lDomaineMetier = DomaineMetierDAO.lister(mainFrame.cnx);
        for (DomaineMetier dm : lDomaineMetier) {
            comboBoxModelDomaineMetier.addElement(dm.getLibelle());
        }
        comboBoxDomaineMetier.setModel(comboBoxModelDomaineMetier);

        // annonceur
        DefaultComboBoxModel comboBoxModelAnnonceur = new DefaultComboBoxModel();
        List<Annonceur> lAnnonceur = AnnonceurDAO.lister(mainFrame.cnx);
        for (Annonceur a : lAnnonceur) {
            Societe s = SocieteDAO.trouver(mainFrame.cnx, a.getId());
            comboBoxModelAnnonceur.addElement(s.getRaisonSociale());
        }
        comboBoxAnnonceur.setModel(comboBoxModelAnnonceur);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOffre = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeOffre = new javax.swing.JList();
        labelIntitule = new javax.swing.JLabel();
        labelReference = new javax.swing.JLabel();
        labelDatePublication = new javax.swing.JLabel();
        labelDureeDiffusion = new javax.swing.JLabel();
        labelDateDebutContrat = new javax.swing.JLabel();
        labelNbPoste = new javax.swing.JLabel();
        labelLocalisation = new javax.swing.JLabel();
        labelDescriptionPoste = new javax.swing.JLabel();
        labelDescriptionProfil = new javax.swing.JLabel();
        labelTelephone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelTypeContrat = new javax.swing.JLabel();
        labelMetier = new javax.swing.JLabel();
        labelDomaineMetier = new javax.swing.JLabel();
        labelAnnonceur = new javax.swing.JLabel();
        textFieldIntitule = new javax.swing.JTextField();
        textFieldReference = new javax.swing.JTextField();
        textFieldLocalisation = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldTelephone = new javax.swing.JTextField();
        comboBoxNombrePoste = new javax.swing.JComboBox();
        labelJour = new javax.swing.JLabel();
        buttonAjouter = new javax.swing.JButton();
        buttonModifier = new javax.swing.JButton();
        buttonSupprimer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaDescriptionPoste = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaDescriptionProfil = new javax.swing.JTextArea();
        spinnerDureeDiffusion = new javax.swing.JSpinner();
        comboBoxTypeContrat = new javax.swing.JComboBox();
        comboBoxMetier = new javax.swing.JComboBox();
        comboBoxAnnonceur = new javax.swing.JComboBox();
        comboBoxDomaineMetier = new javax.swing.JComboBox();
        dateChooserDatePublication = new com.toedter.calendar.JDateChooser();
        dateChooserDebutContrat = new com.toedter.calendar.JDateChooser();
        labelGestionOffre = new javax.swing.JLabel();

        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        panelOffre.setBackground(new java.awt.Color(153, 153, 153));

        listeOffre.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listeOffreValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listeOffre);

        labelIntitule.setText("Intitule");

        labelReference.setText("Référence");

        labelDatePublication.setText("Date de publication");

        labelDureeDiffusion.setText("Durée de diffusion");

        labelDateDebutContrat.setText("Date du début du contrat");

        labelNbPoste.setText("Nombre de poste");

        labelLocalisation.setText("Localisation");

        labelDescriptionPoste.setText("Description du poste");

        labelDescriptionProfil.setText("Description du profil");

        labelTelephone.setText("Numéro de téléphone");

        labelEmail.setText("Email");

        labelTypeContrat.setText("Type de contrat");

        labelMetier.setText("Métier");

        labelDomaineMetier.setText("Domaine de métier");

        labelAnnonceur.setText("Annonceur");

        labelJour.setText("Jour(s)");

        buttonAjouter.setText("Ajouter une offre");
        buttonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjouterActionPerformed(evt);
            }
        });

        buttonModifier.setText("Modifier");
        buttonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifierActionPerformed(evt);
            }
        });

        buttonSupprimer.setText("Supprimer");
        buttonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSupprimerActionPerformed(evt);
            }
        });

        textAreaDescriptionPoste.setColumns(20);
        textAreaDescriptionPoste.setRows(5);
        jScrollPane2.setViewportView(textAreaDescriptionPoste);

        textAreaDescriptionProfil.setColumns(20);
        textAreaDescriptionProfil.setRows(5);
        jScrollPane3.setViewportView(textAreaDescriptionProfil);

        comboBoxDomaineMetier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelOffreLayout = new javax.swing.GroupLayout(panelOffre);
        panelOffre.setLayout(panelOffreLayout);
        panelOffreLayout.setHorizontalGroup(
            panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOffreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSupprimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAjouter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIntitule)
                    .addComponent(labelDatePublication)
                    .addComponent(labelDureeDiffusion)
                    .addComponent(labelDateDebutContrat)
                    .addComponent(labelNbPoste)
                    .addComponent(labelLocalisation)
                    .addComponent(labelDescriptionPoste)
                    .addComponent(labelDescriptionProfil)
                    .addComponent(labelTelephone)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelReference)
                    .addComponent(buttonModifier)
                    .addComponent(labelTypeContrat)
                    .addComponent(labelMetier, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDomaineMetier)
                    .addComponent(labelAnnonceur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOffreLayout.createSequentialGroup()
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldEmail)
                            .addComponent(textFieldTelephone)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2)
                            .addComponent(textFieldLocalisation)
                            .addComponent(textFieldIntitule, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldReference))
                        .addGap(42, 42, 42))
                    .addGroup(panelOffreLayout.createSequentialGroup()
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxAnnonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxMetier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxTypeContrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxNombrePoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelOffreLayout.createSequentialGroup()
                                .addComponent(spinnerDureeDiffusion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelJour))
                            .addComponent(comboBoxDomaineMetier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooserDebutContrat, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(dateChooserDatePublication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelOffreLayout.setVerticalGroup(
            panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOffreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOffreLayout.createSequentialGroup()
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIntitule)
                            .addComponent(textFieldIntitule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelReference)
                            .addComponent(textFieldReference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDatePublication)
                            .addComponent(dateChooserDatePublication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDureeDiffusion)
                            .addComponent(labelJour)
                            .addComponent(spinnerDureeDiffusion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDateDebutContrat)
                            .addComponent(dateChooserDebutContrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNbPoste)
                            .addComponent(comboBoxNombrePoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLocalisation)
                            .addComponent(textFieldLocalisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDescriptionPoste))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDescriptionProfil))
                        .addGap(6, 6, 6)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelephone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelOffreLayout.createSequentialGroup()
                                .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelTypeContrat)
                                    .addComponent(comboBoxTypeContrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMetier)
                                    .addComponent(comboBoxMetier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDomaineMetier)
                                    .addComponent(comboBoxDomaineMetier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOffreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxAnnonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAnnonceur)))
                    .addGroup(panelOffreLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonModifier)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        labelGestionOffre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelGestionOffre.setText("Gestion des offres");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panelOffre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelGestionOffre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelGestionOffre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOffre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listeOffreValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listeOffreValueChanged
        
        // Changement des champs
        Offre o = (Offre) listeOffre.getSelectedValue();
        if (o != null) {
            textFieldIntitule.setText(o.getIntitule());
            textFieldReference.setText(o.getReference());
            //Récuperation date publication
            Date publication = o.getDatePublication();
            dateChooserDatePublication.setDate(publication);
            spinnerDureeDiffusion.setValue(o.getDureeDiffusion());
            //Récupération date début contrat
            Date debutContrat = o.getDateDebutContrat();
            dateChooserDebutContrat.setDate(debutContrat);
            comboBoxNombrePoste.setSelectedItem(o.getNbPostes());
            textFieldLocalisation.setText(o.getLocalisation());
            textAreaDescriptionPoste.setText(o.getDescriptionPoste());
            textAreaDescriptionProfil.setText(o.getDescriptionProfil());
            textFieldTelephone.setText(o.getTelephone());
            textFieldEmail.setText(o.getMail());
            // Typecontrat
            TypeContrat tc = TypeContratDAO.trouver(mainFrame.cnx, o.getIdTypeContrat());
            comboBoxTypeContrat.setSelectedItem(tc.getLibelle());
            // Metier
            Metier m = MetierDAO.trouver(mainFrame.cnx, o.getIdMetier());
            comboBoxMetier.setSelectedItem(m.getLibelle());
            //DomaineMetier
            DomaineMetier dm = DomaineMetierDAO.trouver(mainFrame.cnx, o.getIdDomaineMetier());
            comboBoxDomaineMetier.setSelectedItem(dm.getLibelle());
            // Annonceur
            Societe a = SocieteDAO.trouver(mainFrame.cnx, o.getIdAnnonceur());
            comboBoxAnnonceur.setSelectedItem(a.getRaisonSociale());

        }
    }//GEN-LAST:event_listeOffreValueChanged

    private void buttonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSupprimerActionPerformed
        Offre o = (Offre) listeOffre.getSelectedValue();
        try {
            OffreDAO.supprimer(mainFrame.cnx, o);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        refreshList(listeOffre.getSelectedIndex());
    }//GEN-LAST:event_buttonSupprimerActionPerformed

    private void buttonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifierActionPerformed
        Offre o = (Offre) listeOffre.getSelectedValue();

        o.setIntitule(textFieldIntitule.getText());
        o.setReference(textFieldReference.getText());
        o.setDatePublication(dateChooserDatePublication.getDate());
        o.setDureeDiffusion((int) spinnerDureeDiffusion.getValue());
        o.setDateDebutContrat(dateChooserDebutContrat.getDate());
        o.setNbPostes((int) comboBoxNombrePoste.getSelectedItem());
        o.setLocalisation(textFieldLocalisation.getText());
        o.setDescriptionPoste(textAreaDescriptionPoste.getText());
        o.setDescriptionProfil(textAreaDescriptionProfil.getText());
        o.setTelephone(textFieldTelephone.getText());
        o.setMail(textFieldEmail.getText());
        // Type Contrat
        String libelleTempTC = (String) comboBoxTypeContrat.getSelectedItem();
        TypeContrat tc = TypeContratDAO.trouver(mainFrame.cnx, libelleTempTC);
        o.setIdTypeContrat(tc.getId());
        // Metier
        String libelleTempM = (String) comboBoxMetier.getSelectedItem();
        Metier m = MetierDAO.trouver(mainFrame.cnx, libelleTempM);
        o.setIdMetier(m.getId());
        // Domaine metier
        String libelleTempDM = (String) comboBoxDomaineMetier.getSelectedItem();
        DomaineMetier dm = DomaineMetierDAO.trouver(mainFrame.cnx, libelleTempDM);
        o.setIdDomaineMetier(dm.getId());
        // Annonceur
        String libelleTempA = (String) comboBoxAnnonceur.getSelectedItem();
        Societe s = SocieteDAO.trouver(mainFrame.cnx, libelleTempA);
        o.setIdAnnonceur(s.getId());

        try {
            OffreDAO.modifier(mainFrame.cnx, o);
            JOptionPane.showMessageDialog(panelOffre, "La modification a réussie");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        refreshList(listeOffre.getSelectedIndex());
    }//GEN-LAST:event_buttonModifierActionPerformed

    private void buttonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjouterActionPerformed
        new ajouterOffreFrame().setVisible(true);
    }//GEN-LAST:event_buttonAjouterActionPerformed

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
            java.util.logging.Logger.getLogger(offreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(offreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(offreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(offreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new offreFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAjouter;
    private javax.swing.JButton buttonModifier;
    private javax.swing.JButton buttonSupprimer;
    private javax.swing.JComboBox comboBoxAnnonceur;
    private javax.swing.JComboBox comboBoxDomaineMetier;
    private javax.swing.JComboBox comboBoxMetier;
    private javax.swing.JComboBox comboBoxNombrePoste;
    private javax.swing.JComboBox comboBoxTypeContrat;
    private com.toedter.calendar.JDateChooser dateChooserDatePublication;
    private com.toedter.calendar.JDateChooser dateChooserDebutContrat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAnnonceur;
    private javax.swing.JLabel labelDateDebutContrat;
    private javax.swing.JLabel labelDatePublication;
    private javax.swing.JLabel labelDescriptionPoste;
    private javax.swing.JLabel labelDescriptionProfil;
    private javax.swing.JLabel labelDomaineMetier;
    private javax.swing.JLabel labelDureeDiffusion;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelGestionOffre;
    private javax.swing.JLabel labelIntitule;
    private javax.swing.JLabel labelJour;
    private javax.swing.JLabel labelLocalisation;
    private javax.swing.JLabel labelMetier;
    private javax.swing.JLabel labelNbPoste;
    private javax.swing.JLabel labelReference;
    private javax.swing.JLabel labelTelephone;
    private javax.swing.JLabel labelTypeContrat;
    private javax.swing.JList listeOffre;
    private javax.swing.JPanel panelOffre;
    private javax.swing.JSpinner spinnerDureeDiffusion;
    private javax.swing.JTextArea textAreaDescriptionPoste;
    private javax.swing.JTextArea textAreaDescriptionProfil;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldIntitule;
    private javax.swing.JTextField textFieldLocalisation;
    private javax.swing.JTextField textFieldReference;
    private javax.swing.JTextField textFieldTelephone;
    // End of variables declaration//GEN-END:variables
}
