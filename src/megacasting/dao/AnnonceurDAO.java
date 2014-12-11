package megacasting.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import megacasting.entite.Annonceur;

public class AnnonceurDAO {
    
    
    public static void creer(Connection connection,Annonceur annonceur) throws Exception{
        
        Annonceur a = trouver(connection, annonceur.getId());
        
        if (a != null){
            throw new Exception(annonceur.getRaisonSociale() + " éxiste déjà !");
        }
        
        Statement stmt = null;
        
        try {
           
 
           int Identifiant = annonceur.getId();
           

           int nb = 0;
           
            stmt = connection.createStatement();            
            
            nb = stmt.executeUpdate("INSERT INTO Annonceur (Identifiant)"
                    + "VALUES(" + Identifiant + ")");
            
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
    
    public static Annonceur trouver(Connection connection, int identifiant){
        Annonceur annonceur = null;
        Statement stmt = null;
        
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant FROM Annonceur WHERE Identifiant =" + identifiant);
            if (rs.next()){
                annonceur = new Annonceur();
                annonceur.setId(rs.getInt("Identifiant"));
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
            return annonceur;            
        }
    }
    
    public static void modifier(Connection connection, Annonceur annonceur, int id) throws Exception{
        Annonceur a = trouver(connection, annonceur.getId());
        if (a != null){
            System.out.println(a.getRaisonSociale() + " éxiste déja");
        }
        Statement stmt = null;
        
        try {
           int identifiant = annonceur.getId();

           int nb = 0;          
            stmt = connection.createStatement();
            nb = stmt.executeUpdate("UPDATE Annonceur SET Identifiant =" + identifiant + " WHERE Identifiant =" + id);
            
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
    
    public static void supprimer (Connection connection, Annonceur annonceur) throws Exception{
        Statement stmt = null;
        Annonceur a = trouver(connection, annonceur.getId());
        
        if (a == null){
            throw new Exception("Cet annonceur n'éxiste pas, il ne peut être supprimer");
        }
        
        try {
            int id = annonceur.getId();
            stmt = connection.createStatement();
            int nb = stmt.executeUpdate("DELETE FROM Annonceur WHERE Identifiant = " + id + "");
            
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
    
    public static List<Annonceur> lister (Connection connection){
        Statement stmt = null;
        List<Annonceur> liste = new ArrayList<Annonceur>();

                          
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant FROM Annonceur");
            
            while (rs.next()){
                Annonceur annonceur = new Annonceur();    

                int id = rs.getInt("Identifiant");
                
                annonceur.setId(id);
                
                liste.add(annonceur);
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
