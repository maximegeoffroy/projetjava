/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megacasting.ihm;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import megacasting.dao.AnnonceurDAO;
import megacasting.dao.DiffuseurDAO;
import megacasting.dao.SocieteDAO;
import megacasting.entite.Annonceur;
import megacasting.entite.Diffuseur;
import megacasting.entite.Societe;

/**
 *
 * @author ihamel
 */
public class societeFrame extends javax.swing.JFrame {

    /**
     * Creates new form societeFrame
     */
    public societeFrame() {
        initComponents();
        refreshListAnnonceur();
        refreshListDiffuseur();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDiffuseur = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDiffuseur = new javax.swing.JList();
        labelDiffuseurs = new javax.swing.JLabel();
        labelRaisonSocialeDiffuseur = new javax.swing.JLabel();
        labelTelephoneDiffuseur = new javax.swing.JLabel();
        labelEmailDiffuseur = new javax.swing.JLabel();
        labelAdresseDiffuseur = new javax.swing.JLabel();
        labelSiretDiffuseur = new javax.swing.JLabel();
        textFieldRaisonSocialeDiffuseur = new javax.swing.JTextField();
        textFieldTelephoneDiffuseur = new javax.swing.JTextField();
        textFieldEmailDiffuseur = new javax.swing.JTextField();
        textFieldAdresseDiffuseur = new javax.swing.JTextField();
        textFieldSiretDiffuseur = new javax.swing.JTextField();
        buttonModifierDiffuseur = new javax.swing.JButton();
        buttonSupprimerDiffuseur = new javax.swing.JButton();
        buttonAjouterDiffuseur = new javax.swing.JButton();
        labelGestionSociete = new javax.swing.JLabel();
        panelAnnonceur = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAnnonceur = new javax.swing.JList();
        labelAnnonceurs = new javax.swing.JLabel();
        labelRaisonSocialeAnnonceur = new javax.swing.JLabel();
        labelTelephoneAnnonceur = new javax.swing.JLabel();
        labelEmailAnnonceur = new javax.swing.JLabel();
        labelAdresseAnnonceur = new javax.swing.JLabel();
        labelSiretAnnonceur = new javax.swing.JLabel();
        textFieldRaisonSocialeAnnonceur = new javax.swing.JTextField();
        textFieldTelephoneAnnonceur = new javax.swing.JTextField();
        textFieldEmailAnnonceur = new javax.swing.JTextField();
        textFieldAdresseAnnonceur = new javax.swing.JTextField();
        textFieldSiretAnnonceur = new javax.swing.JTextField();
        buttonModifierAnnonceur = new javax.swing.JButton();
        buttonSupprimerAnnonceur = new javax.swing.JButton();
        buttonAjouterAnnonceur = new javax.swing.JButton();

        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        panelDiffuseur.setBackground(new java.awt.Color(153, 153, 153));

        listDiffuseur.setBorder(new javax.swing.border.MatteBorder(null));
        listDiffuseur.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listDiffuseurValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listDiffuseur);

        labelDiffuseurs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDiffuseurs.setText("Diffuseurs");

        labelRaisonSocialeDiffuseur.setText("Raison Sociale");

        labelTelephoneDiffuseur.setText("Telephone");

        labelEmailDiffuseur.setText("Email");

        labelAdresseDiffuseur.setText("Adresse");

        labelSiretDiffuseur.setText("Siret");

        buttonModifierDiffuseur.setText("Enregistrer");
        buttonModifierDiffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifierDiffuseurActionPerformed(evt);
            }
        });

        buttonSupprimerDiffuseur.setText("Supprimer");
        buttonSupprimerDiffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSupprimerDiffuseurActionPerformed(evt);
            }
        });

        buttonAjouterDiffuseur.setText("Ajouter un diffuseur");
        buttonAjouterDiffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjouterDiffuseurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDiffuseurLayout = new javax.swing.GroupLayout(panelDiffuseur);
        panelDiffuseur.setLayout(panelDiffuseurLayout);
        panelDiffuseurLayout.setHorizontalGroup(
            panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiffuseurLayout.createSequentialGroup()
                .addGroup(panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelDiffuseurLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDiffuseurs)
                            .addGroup(panelDiffuseurLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelRaisonSocialeDiffuseur)
                                    .addComponent(labelTelephoneDiffuseur)
                                    .addComponent(labelEmailDiffuseur)
                                    .addComponent(labelAdresseDiffuseur)
                                    .addComponent(labelSiretDiffuseur))
                                .addGap(18, 18, 18)
                                .addGroup(panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldSiretDiffuseur, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(textFieldRaisonSocialeDiffuseur)
                                    .addComponent(textFieldTelephoneDiffuseur)
                                    .addComponent(textFieldEmailDiffuseur)
                                    .addComponent(textFieldAdresseDiffuseur)))))
                    .addGroup(panelDiffuseurLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(buttonSupprimerDiffuseur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonModifierDiffuseur)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(buttonAjouterDiffuseur)
                .addGap(49, 49, 49))
        );
        panelDiffuseurLayout.setVerticalGroup(
            panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiffuseurLayout.createSequentialGroup()
                .addComponent(labelDiffuseurs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDiffuseurLayout.createSequentialGroup()
                        .addGroup(panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRaisonSocialeDiffuseur)
                            .addComponent(textFieldRaisonSocialeDiffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelephoneDiffuseur)
                            .addComponent(textFieldTelephoneDiffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEmailDiffuseur)
                            .addComponent(textFieldEmailDiffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAjouterDiffuseur))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAdresseDiffuseur)
                            .addComponent(textFieldAdresseDiffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSiretDiffuseur)
                            .addComponent(textFieldSiretDiffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelDiffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDiffuseurLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(buttonModifierDiffuseur)
                        .addContainerGap())
                    .addGroup(panelDiffuseurLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSupprimerDiffuseur)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        labelGestionSociete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelGestionSociete.setText("Gestion des sociétés");

        panelAnnonceur.setBackground(new java.awt.Color(153, 153, 153));

        listAnnonceur.setBorder(new javax.swing.border.MatteBorder(null));
        listAnnonceur.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listAnnonceurValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listAnnonceur);

        labelAnnonceurs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelAnnonceurs.setText("Annonceurs");

        labelRaisonSocialeAnnonceur.setText("Raison Sociale");

        labelTelephoneAnnonceur.setText("Telephone");

        labelEmailAnnonceur.setText("Email");

        labelAdresseAnnonceur.setText("Adresse");

        labelSiretAnnonceur.setText("Siret");

        buttonModifierAnnonceur.setText("Enregistrer");
        buttonModifierAnnonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifierAnnonceurActionPerformed(evt);
            }
        });

        buttonSupprimerAnnonceur.setText("Supprimer");
        buttonSupprimerAnnonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSupprimerAnnonceurActionPerformed(evt);
            }
        });

        buttonAjouterAnnonceur.setText("Ajouter un annonceur");
        buttonAjouterAnnonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjouterAnnonceurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAnnonceurLayout = new javax.swing.GroupLayout(panelAnnonceur);
        panelAnnonceur.setLayout(panelAnnonceurLayout);
        panelAnnonceurLayout.setHorizontalGroup(
            panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnnonceurLayout.createSequentialGroup()
                .addGroup(panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelAnnonceurLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAnnonceurs)
                            .addGroup(panelAnnonceurLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelRaisonSocialeAnnonceur)
                                    .addComponent(labelTelephoneAnnonceur)
                                    .addComponent(labelEmailAnnonceur)
                                    .addComponent(labelAdresseAnnonceur)
                                    .addComponent(labelSiretAnnonceur))
                                .addGap(18, 18, 18)
                                .addGroup(panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldSiretAnnonceur, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(textFieldRaisonSocialeAnnonceur)
                                    .addComponent(textFieldTelephoneAnnonceur)
                                    .addComponent(textFieldEmailAnnonceur)
                                    .addComponent(textFieldAdresseAnnonceur)))))
                    .addGroup(panelAnnonceurLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(buttonSupprimerAnnonceur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonModifierAnnonceur)))
                .addGap(104, 104, 104)
                .addComponent(buttonAjouterAnnonceur)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelAnnonceurLayout.setVerticalGroup(
            panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnnonceurLayout.createSequentialGroup()
                .addComponent(labelAnnonceurs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAnnonceurLayout.createSequentialGroup()
                        .addGroup(panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRaisonSocialeAnnonceur)
                            .addComponent(textFieldRaisonSocialeAnnonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelephoneAnnonceur)
                            .addComponent(textFieldTelephoneAnnonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEmailAnnonceur)
                            .addComponent(textFieldEmailAnnonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAjouterAnnonceur))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAdresseAnnonceur)
                            .addComponent(textFieldAdresseAnnonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSiretAnnonceur)
                            .addComponent(textFieldSiretAnnonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelAnnonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAnnonceurLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(buttonModifierAnnonceur)
                        .addContainerGap())
                    .addGroup(panelAnnonceurLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSupprimerAnnonceur)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGestionSociete, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(panelDiffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(panelAnnonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelGestionSociete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                .addComponent(panelDiffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(panelAnnonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(334, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listDiffuseurValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listDiffuseurValueChanged
        Societe s = (Societe) listDiffuseur.getSelectedValue();

        if (s != null) {
            textFieldRaisonSocialeDiffuseur.setText(s.getRaisonSociale());
            textFieldTelephoneDiffuseur.setText(s.getTelephone());
            textFieldEmailDiffuseur.setText(s.getMail());
            textFieldAdresseDiffuseur.setText(s.getAdresse());
            textFieldSiretDiffuseur.setText(s.getSiret());
        }
    }//GEN-LAST:event_listDiffuseurValueChanged

    private void buttonModifierDiffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifierDiffuseurActionPerformed
        Societe s = (Societe) listDiffuseur.getSelectedValue();
        s.setRaisonSociale(textFieldRaisonSocialeDiffuseur.getText());
        s.setTelephone(textFieldTelephoneDiffuseur.getText());
        s.setMail(textFieldEmailDiffuseur.getText());
        s.setAdresse(textFieldAdresseDiffuseur.getText());
        s.setSiret(textFieldSiretDiffuseur.getText());

        try {
            SocieteDAO.modifier(mainFrame.cnx, s);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelDiffuseur, ex.toString());
        }
        JOptionPane.showMessageDialog(panelDiffuseur, "La modification à réussie");
        refreshListDiffuseur(listDiffuseur.getSelectedIndex());
    }//GEN-LAST:event_buttonModifierDiffuseurActionPerformed

    private void buttonSupprimerDiffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSupprimerDiffuseurActionPerformed
        Societe s = (Societe) listDiffuseur.getSelectedValue();
        Diffuseur d = DiffuseurDAO.trouver(mainFrame.cnx, s.getId());

        if (d != null) {

            try {
                SocieteDAO.supprimer(mainFrame.cnx, s);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelDiffuseur, ex.toString());
            }
            JOptionPane.showMessageDialog(panelDiffuseur, "La suppression a réussie");
            refreshListDiffuseur();
        } else {
            JOptionPane.showMessageDialog(panelDiffuseur, "Le diffuseur n'existe pas");
        }
    }//GEN-LAST:event_buttonSupprimerDiffuseurActionPerformed

    private void buttonAjouterDiffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjouterDiffuseurActionPerformed
        new ajouterDiffuseurFrame().setVisible(true);
    }//GEN-LAST:event_buttonAjouterDiffuseurActionPerformed

    private void listAnnonceurValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listAnnonceurValueChanged
        Societe s = (Societe) listAnnonceur.getSelectedValue();

        if (s != null) {
            textFieldRaisonSocialeAnnonceur.setText(s.getRaisonSociale());
            textFieldTelephoneAnnonceur.setText(s.getTelephone());
            textFieldEmailAnnonceur.setText(s.getMail());
            textFieldAdresseAnnonceur.setText(s.getAdresse());
            textFieldSiretAnnonceur.setText(s.toString());
        }

    }//GEN-LAST:event_listAnnonceurValueChanged

    private void buttonModifierAnnonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifierAnnonceurActionPerformed
        Societe s = (Societe) listAnnonceur.getSelectedValue();
        s.setRaisonSociale(textFieldRaisonSocialeAnnonceur.getText());
        s.setTelephone(textFieldTelephoneAnnonceur.getText());
        s.setMail(textFieldEmailAnnonceur.getText());
        s.setAdresse(textFieldAdresseAnnonceur.getText());
        s.setSiret(textFieldSiretAnnonceur.getText());

        try {
            SocieteDAO.modifier(mainFrame.cnx, s);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelAnnonceur, ex.toString());
        }
        JOptionPane.showMessageDialog(panelAnnonceur, "La modification à réussie");
        refreshListAnnonceur(listAnnonceur.getSelectedIndex());
    }//GEN-LAST:event_buttonModifierAnnonceurActionPerformed

    private void buttonSupprimerAnnonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSupprimerAnnonceurActionPerformed
        Societe s = (Societe) listAnnonceur.getSelectedValue();
        Annonceur a = AnnonceurDAO.trouver(mainFrame.cnx, s.getId());

        if (a != null) {

            try {
                SocieteDAO.supprimer(mainFrame.cnx, s);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelDiffuseur, ex.toString());
            }
            JOptionPane.showMessageDialog(panelAnnonceur, "La suppression a réussie");
            refreshListAnnonceur();
        } else {
            JOptionPane.showMessageDialog(panelAnnonceur, "L'annonceur n'existe pas");
        }
    }//GEN-LAST:event_buttonSupprimerAnnonceurActionPerformed

    private void buttonAjouterAnnonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjouterAnnonceurActionPerformed
        new ajouterAnnonceurFrame().setVisible(true);
    }//GEN-LAST:event_buttonAjouterAnnonceurActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        refreshListAnnonceur();
        refreshListDiffuseur();
    }//GEN-LAST:event_formWindowGainedFocus

    private void refreshListAnnonceur() {
        refreshListAnnonceur(0);
    }

    private void refreshListAnnonceur(int selectedIndex) {
        DefaultListModel listModelAnnonceur = null;

        if (listDiffuseur.getModel() instanceof DefaultListModel) {
            listModelAnnonceur = (DefaultListModel) listAnnonceur.getModel();
            listModelAnnonceur.setSize(0);
        } else {
            listModelAnnonceur = new DefaultListModel();
            listAnnonceur.setModel(listModelAnnonceur);
        }

        List<Annonceur> lannonceurs = AnnonceurDAO.lister(mainFrame.cnx);

        for (Annonceur a : lannonceurs) {
            int idAnnonceur = a.getId();
            Societe s = SocieteDAO.trouver(mainFrame.cnx, idAnnonceur);
            if (s != null) {
                listModelAnnonceur.addElement(s);
            }
        }

        if (listModelAnnonceur.getSize() > 0) {
            listAnnonceur.setSelectedIndex(selectedIndex);
        }
    }

    private void refreshListDiffuseur() {
        refreshListDiffuseur(0);
    }

    private void refreshListDiffuseur(int selectedIndex) {
        DefaultListModel listModelDiffuseur = null;

        if (listDiffuseur.getModel() instanceof DefaultListModel) {
            listModelDiffuseur = (DefaultListModel) listDiffuseur.getModel();
            listModelDiffuseur.setSize(0);
        } else {
            listModelDiffuseur = new DefaultListModel();
            listDiffuseur.setModel(listModelDiffuseur);
        }

        List<Diffuseur> ldiffuseurs = DiffuseurDAO.lister(mainFrame.cnx);

        for (Diffuseur d : ldiffuseurs) {
            int idDiffuseur = d.getId();
            Societe s = SocieteDAO.trouver(mainFrame.cnx, idDiffuseur);
            if (s != null) {
                listModelDiffuseur.addElement(s);
            }
        }

        if (listModelDiffuseur.getSize() > 0) {
            listDiffuseur.setSelectedIndex(selectedIndex);
        }
    }

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
            java.util.logging.Logger.getLogger(societeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(societeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(societeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(societeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new societeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAjouterAnnonceur;
    private javax.swing.JButton buttonAjouterDiffuseur;
    private javax.swing.JButton buttonModifierAnnonceur;
    private javax.swing.JButton buttonModifierDiffuseur;
    private javax.swing.JButton buttonSupprimerAnnonceur;
    private javax.swing.JButton buttonSupprimerDiffuseur;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAdresseAnnonceur;
    private javax.swing.JLabel labelAdresseDiffuseur;
    private javax.swing.JLabel labelAnnonceurs;
    private javax.swing.JLabel labelDiffuseurs;
    private javax.swing.JLabel labelEmailAnnonceur;
    private javax.swing.JLabel labelEmailDiffuseur;
    private javax.swing.JLabel labelGestionSociete;
    private javax.swing.JLabel labelRaisonSocialeAnnonceur;
    private javax.swing.JLabel labelRaisonSocialeDiffuseur;
    private javax.swing.JLabel labelSiretAnnonceur;
    private javax.swing.JLabel labelSiretDiffuseur;
    private javax.swing.JLabel labelTelephoneAnnonceur;
    private javax.swing.JLabel labelTelephoneDiffuseur;
    private javax.swing.JList listAnnonceur;
    private javax.swing.JList listDiffuseur;
    private javax.swing.JPanel panelAnnonceur;
    private javax.swing.JPanel panelDiffuseur;
    private javax.swing.JTextField textFieldAdresseAnnonceur;
    private javax.swing.JTextField textFieldAdresseDiffuseur;
    private javax.swing.JTextField textFieldEmailAnnonceur;
    private javax.swing.JTextField textFieldEmailDiffuseur;
    private javax.swing.JTextField textFieldRaisonSocialeAnnonceur;
    private javax.swing.JTextField textFieldRaisonSocialeDiffuseur;
    private javax.swing.JTextField textFieldSiretAnnonceur;
    private javax.swing.JTextField textFieldSiretDiffuseur;
    private javax.swing.JTextField textFieldTelephoneAnnonceur;
    private javax.swing.JTextField textFieldTelephoneDiffuseur;
    // End of variables declaration//GEN-END:variables
}
