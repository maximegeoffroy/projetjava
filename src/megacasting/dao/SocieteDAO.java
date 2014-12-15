/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megacasting.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import megacasting.entite.Societe;

/**
 *
 * @author ihamel
 */
public class SocieteDAO {

    public static void creer(Connection connection, Societe societe) throws Exception {
        Societe s = trouver(connection, societe.getRaisonSociale(), societe.getSiret());
        //Test si la societe existe déja
        if (s != null) {
            throw new Exception(societe.getRaisonSociale() + " avec le numéro de siret : " + societe.getSiret() + " existe déja");
        }

        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO Societe(RaisonSociale,Telephone,Email,Adresse,NumeroSiret)"
                    + " VALUES('" + societe.getRaisonSociale() + "','" + societe.getTelephone()
                    + "','" + societe.getMail() + "','" + societe.getAdresse() + "','" + societe.getSiret() + "')");

            ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) AS Id FROM Societe");

            if (rs.next()) {
                societe.setId(rs.getInt("Id"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void modifier(Connection connection, Societe societe) throws Exception {
        Societe s = trouver(connection, societe.getRaisonSociale(), societe.getSiret());
        //Test si la societe existe déja
        if (s != null && s.getId() != societe.getId()) {
            throw new Exception("La société " + societe.getRaisonSociale() + " avec le numero de siret " + societe.getSiret() + " éxiste déja");
        }

        Statement stmt = null;

        try {

            stmt = connection.createStatement();
            int nb = stmt.executeUpdate("UPDATE Societe SET RaisonSociale = '" + societe.getRaisonSociale() + "', Telephone = '" + societe.getTelephone()
                    + "', Email = '" + societe.getMail() + "', Adresse = '"
                    + societe.getAdresse() + "', NumeroSiret = '" + societe.getSiret()
                    + "' WHERE Identifiant =" + societe.getId());

            System.out.println("Ligne mise à jour : " + nb);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void supprimer(Connection connection, Societe societe) throws Exception {
        Societe s = trouver(connection, societe.getRaisonSociale(), societe.getSiret());
        //Test si la societe existe déja
        if (s == null) {
            throw new Exception(societe.getRaisonSociale() + " avec le numéro de siret : " + societe.getSiret() + " n'existe pas");
        }
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            int nb = stmt.executeUpdate("DELETE FROM Societe WHERE Identifiant =" + societe.getId());

            System.out.println("Ligne supprimées : " + nb);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static Societe trouver(Connection connection, String raisonSociale, String numeroSiret) {
        Societe societe = null;
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant,Telephone,Email,Adresse FROM Societe WHERE RaisonSociale = '" + raisonSociale + "' AND NumeroSiret = '" + numeroSiret + "'");

            if (rs.next()) {
                int id = rs.getInt("Identifiant");
                String telephone = rs.getString("Telephone");
                String mail = rs.getString("Email");
                String adresse = rs.getString("Adresse");

                societe = new Societe(raisonSociale, telephone, mail, adresse, numeroSiret);
                societe.setId(id);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return societe;
    }

    public static Societe trouver(Connection connection, int identifiant) {
        Societe societe = null;
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT RaisonSociale,Telephone,Email,Adresse,NumeroSiret FROM Societe WHERE Identifiant = " + identifiant);

            if (rs.next()) {
                String raisonSociale = rs.getString("RaisonSociale");
                String telephone = rs.getString("Telephone");
                String mail = rs.getString("Email");
                String adresse = rs.getString("Adresse");
                String siret = rs.getString("NumeroSiret");

                societe = new Societe(raisonSociale, telephone, mail, adresse, siret);
                societe.setId(identifiant);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return societe;
    }

    public static Societe trouver(Connection connection, String raisonSociale) {
        Societe societe = null;
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant,RaisonSociale,Telephone,Email,Adresse,NumeroSiret FROM Societe WHERE RaisonSociale = '" + raisonSociale + "'");

            if (rs.next()) {
                int identifiant = rs.getInt("Identifiant");
                String raisonsociale = rs.getString("RaisonSociale");
                String telephone = rs.getString("Telephone");
                String mail = rs.getString("Email");
                String adresse = rs.getString("Adresse");
                String siret = rs.getString("NumeroSiret");

                societe = new Societe(raisonsociale, telephone, mail, adresse, siret);
                societe.setId(identifiant);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return societe;
    }

    public static List<Societe> lister(Connection connection) {

        List<Societe> societes = new ArrayList<>();
        Statement stmt = null;

        try {

            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant,RaisonSociale,Telephone,Email,Adresse,NumeroSiret FROM Societe");

            while (rs.next()) {
                Societe societe = new Societe();

                societe.setId(rs.getInt("Identifiant"));
                societe.setRaisonSociale(rs.getString("RaisonSociale"));
                societe.setTelephone(rs.getString("Telephone"));
                societe.setMail(rs.getString("Email"));
                societe.setAdresse(rs.getString("Adresse"));

                societes.add(societe);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            return societes;
        }
    }

}
