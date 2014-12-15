package megacasting.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import megacasting.entite.Offre;

public class OffreDAO {

    public static void creer(Connection connection, Offre offre) throws Exception {

        Offre testO = trouver(connection, offre.getIntitule(), offre.getReference());

        if (testO != null) {
            throw new Exception("Cette offre éxiste déjà !");
        }

        Statement stmt = null;

        try {

            // Attributs de la classe Offre
            String intitule = offre.getIntitule();
            String reference = offre.getReference();
            Date datePublication = offre.getDatePublication();
            int dureeDiffusion = offre.getDureeDiffusion();
            Date dateDebutcontrat = offre.getDateDebutContrat();
            int nbPostes = offre.getNbPostes();
            String localisation = offre.getLocalisation();
            String descriptionPoste = offre.getDescriptionPoste();
            String descriptionProfil = offre.getDescriptionProfil();
            String telephone = offre.getTelephone();
            String mail = offre.getMail();
            int idTypeContrat = offre.getIdTypeContrat();
            int idMetier = offre.getIdMetier();
            int idDomaineMetier = offre.getIdDomaineMetier();
            int idAnnonceur = offre.getIdAnnonceur();

            // 
            int nb = 0;
            int id = 0;

            stmt = connection.createStatement();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String strDatePublication = sdf.format(datePublication);
            String strDateDebutContrat = sdf.format(dateDebutcontrat);

            nb = stmt.executeUpdate("INSERT INTO Offre (Intitule,Reference,DatePublication,DureeDiffusion,DateDebutContrat,NbPostes,Localisation,DescriptionPoste,DescriptionProfil,Telephone,Email,IdentifiantType_Contrat,IdentifiantMetier,IdentifiantDomaine_Metier,IdentifiantAnnonceur)"
                    + "VALUES('" + intitule + "','" + reference + "', convert(datetime, '" + strDatePublication + "', 103)," + dureeDiffusion + ", convert(datetime, '" + strDateDebutContrat + "', 103)," + nbPostes + ",'" + localisation + "','" + descriptionPoste + "','" + descriptionProfil + "','" + telephone + "','" + mail + "'," + idTypeContrat + "," + idMetier + "," + idDomaineMetier + "," + idAnnonceur + ")");

            System.out.println("Ligne(s) affectée(s) : " + nb);

            ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) AS ID FROM Offre");

            if (rs.next()) {
                id = rs.getInt("ID");
            }
            offre.setId(id);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static Offre trouver(Connection connection, String intitule, String reference) {
        Offre offre = null;
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant,Intitule,Reference,DatePublication,DureeDiffusion,DateDebutContrat,NbPostes,Localisation,DescriptionPoste,DescriptionProfil,Telephone,Email,IdentifiantType_Contrat,IdentifiantMetier,IdentifiantDomaine_Metier,IdentifiantAnnonceur FROM Offre WHERE Intitule ='" + intitule + "' AND Reference ='" + reference + "'");
            if (rs.next()) {
                offre = new Offre();
                offre.setId(rs.getInt("Identifiant"));
                offre.setIntitule(rs.getString("Intitule"));
                offre.setReference(rs.getString("Reference"));
                offre.setDatePublication(rs.getDate("DatePublication"));
                offre.setDureeDiffusion(rs.getInt("DureeDiffusion"));
                offre.setDateDebutContrat(rs.getDate("DateDebutContrat"));
                offre.setNbPostes(rs.getInt("NbPostes"));
                offre.setLocalisation(rs.getString("Localisation"));
                offre.setDescriptionPoste(rs.getString("DescriptionPoste"));
                offre.setDescriptionProfil(rs.getString("DescriptionProfil"));
                offre.setTelephone(rs.getString("Telephone"));
                offre.setMail(rs.getString("Email"));
                offre.setIdTypeContrat(rs.getInt("IdentifiantType_Contrat"));
                offre.setIdMetier(rs.getInt("IdentifiantMetier"));
                offre.setIdDomaineMetier(rs.getInt("IdentifiantDomaine_Metier"));
                offre.setIdAnnonceur(rs.getInt("IdentifiantAnnonceur"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            return offre;
        }
    }

    public static void modifier(Connection connection, Offre offre) throws Exception {
        
        Offre testO = trouver(connection, offre.getIntitule(), offre.getReference());
        
        if(testO != null && offre.getId() != testO.getId()){
            throw new Exception("Il y a déja une offre avec cette  intitulé et cette référence");
        }

        Statement stmt = null;

        try {

            // Attributs de la classe Offre
            int identifiant = offre.getId();
            String intitule = offre.getIntitule();
            String reference = offre.getReference();
            Date datePublication = offre.getDatePublication();
            int dureeDiffusion = offre.getDureeDiffusion();
            Date dateDebutcontrat = offre.getDateDebutContrat();
            int nbPostes = offre.getNbPostes();
            String localisation = offre.getLocalisation();
            String descriptionPoste = offre.getDescriptionPoste();
            String descriptionProfil = offre.getDescriptionProfil();
            String telephone = offre.getTelephone();
            String mail = offre.getMail();
            int idTypeContrat = offre.getIdTypeContrat();
            int idMetier = offre.getIdMetier();
            int idDomaineMetier = offre.getIdDomaineMetier();
            int idAnnonceur = offre.getIdAnnonceur();

            int nb = 0;
            //Outil pour convertir la date en date SqlServer
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String strDatePublication = sdf.format(datePublication);
            String strDateDebutContrat = sdf.format(dateDebutcontrat);

            stmt = connection.createStatement();
            nb = stmt.executeUpdate("UPDATE Offre SET Intitule ='" + intitule + "', Reference='" + reference
                    + "', DatePublication= convert(datetime, '" + strDatePublication + "',103), DureeDiffusion=" + dureeDiffusion 
                    + ", DateDebutContrat= convert(datetime, '" + strDateDebutContrat + "',103), NbPostes=" + nbPostes 
                    + ", Localisation='" + localisation + "', DescriptionPoste='" + descriptionPoste 
                    + "', DescriptionProfil='" + descriptionProfil + "', Telephone='" + telephone 
                    + "', Email='" + mail + "', IdentifiantType_Contrat=" + idTypeContrat + ", IdentifiantMetier=" 
                    + idMetier + ", IdentifiantDomaine_Metier=" + idDomaineMetier + ", IdentifiantAnnonceur=" 
                    + idAnnonceur + " WHERE Identifiant=" + identifiant);

            System.out.println("Ligne(s) affectée(s) : " + nb);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void supprimer(Connection connection, Offre offre) throws Exception {
        Statement stmt = null;
        Offre testO = trouver(connection, offre.getIntitule(), offre.getReference());

        if (testO == null) {
            throw new Exception("Cette offre n'éxiste pas, elle ne peut être supprimer");
        }
        try {
            int id = offre.getId();
            stmt = connection.createStatement();
            int nb = stmt.executeUpdate("DELETE FROM Offre WHERE Identifiant = " + id + "");

            System.out.println("Ligne(s) affectée(s) : " + nb);
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
        }
    }

    public static List<Offre> lister(Connection connection) {
        Statement stmt = null;
        List<Offre> liste = new ArrayList<Offre>();

        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant,Intitule,Reference,DatePublication,DureeDiffusion,DateDebutContrat,NbPostes,Localisation,DescriptionPoste,DescriptionProfil,Telephone,Email,IdentifiantType_Contrat,IdentifiantMetier,IdentifiantDomaine_Metier,IdentifiantAnnonceur FROM Offre");

            while (rs.next()) {
                Offre offre = new Offre();

                int id = rs.getInt("Identifiant");
                String intitule = rs.getString("Intitule");
                String reference = rs.getString("Reference");
                Date datePublication = rs.getDate("DatePublication");
                int dureeDiffusion = rs.getInt("DureeDiffusion");
                Date dateDebutcontrat = rs.getDate("DateDebutContrat");

                int nbPostes = rs.getInt("NbPostes");
                String localisation = rs.getString("Localisation");
                String descriptionPoste = rs.getString("DescriptionPoste");
                String descriptionProfil = rs.getString("DescriptionProfil");
                String telephone = rs.getString("Telephone");
                String mail = rs.getString("Email");
                int idTypeContrat = rs.getInt("IdentifiantType_Contrat");
                int idMetier = rs.getInt("IdentifiantMetier");
                int idDomaineMetier = rs.getInt("IdentifiantDomaine_Metier");
                int idAnnonceur = rs.getInt("IdentifiantAnnonceur");

                offre.setId(rs.getInt("Identifiant"));
                offre.setIntitule(rs.getString("Intitule"));
                offre.setReference(rs.getString("Reference"));
                offre.setDatePublication(rs.getDate("DatePublication"));
                offre.setDureeDiffusion(rs.getInt("DureeDiffusion"));
                offre.setDateDebutContrat(rs.getDate("DateDebutContrat"));
                offre.setNbPostes(rs.getInt("NbPostes"));
                offre.setLocalisation(rs.getString("Localisation"));
                offre.setDescriptionPoste(rs.getString("DescriptionPoste"));
                offre.setDescriptionProfil(rs.getString("DescriptionProfil"));
                offre.setTelephone(rs.getString("Telephone"));
                offre.setMail(rs.getString("Email"));
                offre.setIdTypeContrat(rs.getInt("IdentifiantType_Contrat"));
                offre.setIdMetier(rs.getInt("IdentifiantMetier"));
                offre.setIdDomaineMetier(rs.getInt("IdentifiantDomaine_Metier"));
                offre.setIdAnnonceur(rs.getInt("IdentifiantAnnonceur"));

                liste.add(offre);
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
            return liste;
        }
    }

    public static Offre trouver(Connection connection, String intitule) {
        Offre offre = null;
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant,Intitule,Reference,DatePublication,DureeDiffusion,DateDebutContrat,NbPostes,Localisation,DescriptionPoste,DescriptionProfil,Telephone,Email,IdentifiantType_Contrat,IdentifiantMetier,IdentifiantDomaine_Metier,IdentifiantAnnonceur FROM Offre WHERE Intitule ='" + intitule + "'");
            if (rs.next()) {
                offre = new Offre();
                offre.setId(rs.getInt("Identifiant"));
                offre.setIntitule(rs.getString("Intitule"));
                offre.setReference(rs.getString("Reference"));
                offre.setDatePublication(rs.getDate("DatePublication"));
                offre.setDureeDiffusion(rs.getInt("DureeDiffusion"));
                offre.setDateDebutContrat(rs.getDate("DateDebutContrat"));
                offre.setNbPostes(rs.getInt("NbPostes"));
                offre.setLocalisation(rs.getString("Localisation"));
                offre.setDescriptionPoste(rs.getString("DescriptionPoste"));
                offre.setDescriptionProfil(rs.getString("DescriptionProfil"));
                offre.setTelephone(rs.getString("Telephone"));
                offre.setMail(rs.getString("Email"));
                offre.setIdTypeContrat(rs.getInt("IdentifiantType_Contrat"));
                offre.setIdMetier(rs.getInt("IdentifiantMetier"));
                offre.setIdDomaineMetier(rs.getInt("IdentifiantDomaine_Metier"));
                offre.setIdAnnonceur(rs.getInt("IdentifiantAnnonceur"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            return offre;
        }
    }

    public static Offre trouver(Connection connection, int identifiant) {
        Offre offre = null;
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant,Intitule,Reference,DatePublication,DureeDiffusion,DateDebutContrat,NbPostes,Localisation,DescriptionPoste,DescriptionProfil,Telephone,Email,IdentifiantType_Contrat,IdentifiantMetier,IdentifiantDomaine_Metier,IdentifiantAnnonceur FROM Offre WHERE Identifiant =" + identifiant);
            if (rs.next()) {
                offre = new Offre();
                offre.setId(rs.getInt("Identifiant"));
                offre.setIntitule(rs.getString("Intitule"));
                offre.setReference(rs.getString("Reference"));
                offre.setDatePublication(rs.getDate("DatePublication"));
                offre.setDureeDiffusion(rs.getInt("DureeDiffusion"));
                offre.setDateDebutContrat(rs.getDate("DateDebutContrat"));
                offre.setNbPostes(rs.getInt("NbPostes"));
                offre.setLocalisation(rs.getString("Localisation"));
                offre.setDescriptionPoste(rs.getString("DescriptionPoste"));
                offre.setDescriptionProfil(rs.getString("DescriptionProfil"));
                offre.setTelephone(rs.getString("Telephone"));
                offre.setMail(rs.getString("Email"));
                offre.setIdTypeContrat(rs.getInt("IdentifiantType_Contrat"));
                offre.setIdMetier(rs.getInt("IdentifiantMetier"));
                offre.setIdDomaineMetier(rs.getInt("IdentifiantDomaine_Metier"));
                offre.setIdAnnonceur(rs.getInt("IdentifiantAnnonceur"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            return offre;
        }
    }

}
