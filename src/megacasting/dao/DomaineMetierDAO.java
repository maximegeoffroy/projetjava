package megacasting.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import megacasting.entite.DomaineMetier;

public class DomaineMetierDAO {
    
    public static void creer(Connection connection, DomaineMetier domaineMetier) throws Exception{
        DomaineMetier dm = trouver(connection,domaineMetier.getLibelle());
        //Test si le domaine metier existe déja
        if(dm != null){
            throw new Exception("Le domaine metier " + domaineMetier.getLibelle() + "existe déja");
        }
        
        Statement stmt = null;
        
        try{
            stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO Domaine_Metier(Libelle)"
                    + " VALUES('" + domaineMetier.getLibelle() + "')");
            
            ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) AS Id FROM Domaine_Metier");
            
            if(rs.next()){
                domaineMetier.setId(rs.getInt("Id"));
            } 
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                   ex.printStackTrace();
                }
            }
        }
    }
    
    public static void modifier(Connection connection, DomaineMetier domaineMetier) throws Exception{
        DomaineMetier dm = trouver(connection,domaineMetier.getLibelle());
        //Test si le domaine metier existe déja
        if(dm != null && dm.getId() != domaineMetier.getId()){
            throw new Exception("Le domaine metier " + domaineMetier.getLibelle() + "existe déja");
        }
        
        Statement stmt = null;
        
        try{
           
           stmt = connection.createStatement();
           int nb = stmt.executeUpdate("UPDATE Domaine_Metier SET Libelle = '" + domaineMetier.getLibelle()
                   + "' WHERE Identifiant =" + domaineMetier.getId());
           
            System.out.println("Ligne mise à jour : " + nb);
                              
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public static void supprimer(Connection connection, DomaineMetier domaineMetier){
        
        Statement stmt = null;
       
       try{       
           stmt = connection.createStatement();
           int nb = stmt.executeUpdate("DELETE FROM Domaine_Metier WHERE Identifiant =" + domaineMetier.getId());
           
           System.out.println("Ligne supprimées : " + nb);
                              
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
     
    public static List<DomaineMetier> lister(Connection connection){
        
        List<DomaineMetier> domaines = new ArrayList<>();
        Statement stmt = null;
        
        try {
            
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant,Libelle FROM Domaine_Metier");
            
            while(rs.next()){
                DomaineMetier dm = new DomaineMetier();
                
                dm.setId(rs.getInt("Identifiant"));
                dm.setLibelle(rs.getString("Libelle"));
                                
                domaines.add(dm);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            
         return domaines;
        }  
    } 
    
    public static DomaineMetier trouver(Connection connection, String libelle){
        DomaineMetier dm = null;
        Statement stmt = null;
        
        try{
            stmt = connection.createStatement();
            ResultSet rs =  stmt.executeQuery("SELECT Identifiant FROM Domaine_Metier WHERE Libelle = '" + libelle + "'");
          
          if(rs.next()){
              int id = rs.getInt("Identifiant");
              
              dm = new DomaineMetier(libelle);
              dm.setId(id);
          }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return dm;
    }
}
