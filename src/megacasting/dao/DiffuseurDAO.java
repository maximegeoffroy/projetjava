package megacasting.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import megacasting.entite.Diffuseur;


public class DiffuseurDAO {
    public static void creer(Connection connection, Diffuseur diffuseur) throws Exception{
        Diffuseur dif = trouver(connection,diffuseur.getId());
        //Test si le diffuseur existe déja
        if(dif != null){
            throw new Exception("Le diffuseur avec le nom " + diffuseur.getRaisonSociale() + "existe déja");
        }
        
        Statement stmt = null;
        
        try{
            stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO Diffuseur(Identifiant)"
                    + " VALUES(" + diffuseur.getId() + ")");
            
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
    
    public static void modifier(Connection connection, Diffuseur diffuseur) throws Exception{
        Diffuseur dif = trouver(connection,diffuseur.getId());
        //Test si le diffuseur existe déja
        if(dif != null && dif.getId() != diffuseur.getId()){
            throw new Exception("Le diffuseur '" + diffuseur.getRaisonSociale() + "' existe déja");
        }
        
        Statement stmt = null;
        
        try{
           
           stmt = connection.createStatement();
           int nb = stmt.executeUpdate("UPDATE Societe SET RaisonSociale = '" + diffuseur.getRaisonSociale() + "', Telephone = '" + diffuseur.getTelephone()
                                        + "', Email = '" + diffuseur.getMail() + "', Adresse = '"
                                        + diffuseur.getAdresse() + "', NumeroSiret = '" + diffuseur.getSiret()
                                        +"' WHERE Identifiant =" + diffuseur.getId());
           
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
    
    public static void supprimer(Connection connection, Diffuseur dif){
        
        Statement stmt = null;
       
       try{       
           stmt = connection.createStatement();
           int nb = stmt.executeUpdate("DELETE FROM Diffuseur WHERE Identifiant =" + dif.getId());
                     
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
    
    public static List<Diffuseur> lister(Connection connection){
        
        List<Diffuseur> diffuseurs = new ArrayList<>();
        Statement stmt = null;
        
        try {
            
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant FROM Diffuseur");
            
            while(rs.next()){
                Diffuseur dif = new Diffuseur();
                
                dif.setId(rs.getInt("Identifiant"));
                
                diffuseurs.add(dif);
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
            
         return diffuseurs;
        }  
    }
    
    public static Diffuseur trouver(Connection connection, int identifiant){
        Diffuseur dif = null;
        Statement stmt = null;
        
        try{
            stmt = connection.createStatement();
          ResultSet rs =  stmt.executeQuery("SELECT Identifiant FROM Diffuseur WHERE Identifiant = " + identifiant);
          
          if(rs.next()){
              int id = rs.getInt("Identifiant");
              
              dif = new Diffuseur();
              dif.setId(id);
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
        return dif;
    }
}
