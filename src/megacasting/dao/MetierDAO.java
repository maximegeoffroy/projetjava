package megacasting.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import megacasting.entite.Metier;

public class MetierDAO {
    public static void creer(Connection connection,Metier metier) throws Exception{
        
        Metier testM = trouver(connection, metier.getLibelle());
        
        if (testM != null){
            throw new Exception(metier.getLibelle() + " éxiste déjà");
        }
        
        Statement stmt = null;
        
        try {
           
           String libelle = metier.getLibelle();
           int idDomaineMetier = metier.getIdDomaineMetier();
           
           int nb = 0;
           int id = 0;
           
            stmt = connection.createStatement();           
            nb = stmt.executeUpdate("INSERT INTO Metier (Libelle,IdentifiantDomaine_Metier)"
                    + "VALUES('" + libelle + "'," + idDomaineMetier + ")");
            
            System.out.println("Ligne(s) affectée(s) : " + nb);
            
            ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) AS ID FROM Metier");
           
            if(rs.next()){
               id = rs.getInt("ID");
            }
            metier.setId(id);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            if(stmt != null){
                try {
                    stmt.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public static Metier trouver(Connection connection, String libelle){
        Metier metier = null;
        Statement stmt = null;
        
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant,Libelle,IdentifiantDomaine_Metier FROM Metier WHERE Libelle ='" + libelle + "'");
            if (rs.next()){
                metier = new Metier();
                metier.setId(rs.getInt("Identifiant"));
                metier.setLibelle(rs.getString("Libelle"));
                metier.setIdDomaineMetier(rs.getInt("IdentifiantDomaine_Metier"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if ( stmt != null) {
                try{
                    stmt.close();
                }
                catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
            return metier;            
        }
    }
    
    public static void modifier(Connection connection, Metier metier) throws Exception{
        Metier testM = trouver(connection, metier.getLibelle());
        
        if(testM != null){
            throw new Exception(metier.getLibelle() + " existe déja");
        }
        
        Statement stmt = null;
        
        try {
           
           // Attributs de la classe Offre
           int identifiant = metier.getId();
           String libelle = metier.getLibelle();
           int idDomaineMetier = metier.getIdDomaineMetier();
           
           // 
           int nb = 0;
           
            stmt = connection.createStatement();
            nb = stmt.executeUpdate("UPDATE Metier SET Libelle ='" + libelle +"', IdentifiantDomaine_Metier=" + idDomaineMetier + "WHERE Identifiant=" + identifiant);
            
            System.out.println("Ligne(s) affectée(s) : " + nb);
            
            } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            if(stmt != null){
                try {
                    stmt.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }       
    }
    
    public static void supprimer (Connection connection, Metier metier) throws Exception{
        Statement stmt = null;
        Metier testM = trouver(connection, metier.getLibelle());
        
        if (testM == null){
            throw new Exception("Ce métier n'éxiste pas, il ne peut être supprimer");
        }
        try {
            int id = metier.getId();
            stmt = connection.createStatement();
            int nb = stmt.executeUpdate("DELETE FROM Metier WHERE Identifiant = " + id + "");
            
            System.out.println("Ligne(s) affectée(s) : " + nb);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        finally{
            if (stmt !=null){
                try{
                     stmt.close();
                }
                catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public static List<Metier> lister (Connection connection){
        Statement stmt = null;
        List<Metier> liste = new ArrayList<Metier>();

                          
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant,Libelle,IdentifiantDomaine_Metier FROM Metier");
            
            while (rs.next()){
                Metier metier = new Metier();    

                int id = rs.getInt("Identifiant");
                String libelle = rs.getString("Libelle");
                int idDomaineMetier = rs.getInt("IdentifiantDomaine_Metier");
                
                metier.setId(rs.getInt("Identifiant"));
                metier.setLibelle(rs.getString("Libelle"));
                metier.setIdDomaineMetier(rs.getInt("IdentifiantDomaine_Metier"));
                
                liste.add(metier);
            }
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        finally {
            if (stmt != null){
                try {
                    stmt.close();
                } 
                catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
            return liste;
        }
    }    
}
