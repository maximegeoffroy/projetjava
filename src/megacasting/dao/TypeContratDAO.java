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
import megacasting.entite.TypeContrat;

/**
 *
 * @author ihamel
 */
public class TypeContratDAO {
    public static void creer(Connection connection, TypeContrat contrat) throws Exception{
        TypeContrat tc = trouver(connection,contrat.getLibelle());
        //Test si la personne existe déja
        if(tc != null){
            throw new Exception("Le contrat " + contrat.getLibelle() + "existe déja");
        }
        
        Statement stmt = null;
        
        try{
            stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO Type_Contrat(Libelle)"
                    + " VALUES('" + contrat.getLibelle() + "')");
            
            ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) AS Id FROM Type_Contrat");
            
            if(rs.next()){
                contrat.setId(rs.getInt("Id"));
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
    
    public static void modifier(Connection connection, TypeContrat contrat) throws Exception{
        TypeContrat tc = trouver(connection,contrat.getLibelle());
        //Test si le type de contrat existe déja
        if(tc != null && tc.getId() != contrat.getId()){
            throw new Exception("Le contrat " + contrat.getLibelle() + "existe déja");
        }
        
        Statement stmt = null;
        
        try{
           
           stmt = connection.createStatement();
           int nb = stmt.executeUpdate("UPDATE Type_Contrat SET Libelle = '" + contrat.getLibelle()
                   + "' WHERE Identifiant =" + contrat.getId());
           
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
    
    public static void supprimer(Connection connection, TypeContrat contrat){
        
        Statement stmt = null;
       
       try{       
           stmt = connection.createStatement();
           int nb = stmt.executeUpdate("DELETE FROM Type_Contrat WHERE Identifiant =" + contrat.getId());
           
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
    
    public static TypeContrat trouver(Connection connection, String libelle){
        TypeContrat contrat = null;
        Statement stmt = null;
        
        try{
            stmt = connection.createStatement();
            ResultSet rs =  stmt.executeQuery("SELECT Identifiant FROM Type_Contrat WHERE Libelle = '" + libelle + "'");
          
          if(rs.next()){
              int id = rs.getInt("Identifiant");
              
              contrat = new TypeContrat(libelle);
              contrat.setId(id);
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
        return contrat;
    }
    
    public static List<TypeContrat> lister(Connection connection){
        
        List<TypeContrat> contrats = new ArrayList<>();
        Statement stmt = null;
        
        try {
            
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant,Libelle FROM Type_Contrat");
            
            while(rs.next()){
                TypeContrat contrat = new TypeContrat();
                
                contrat.setId(rs.getInt("Identifiant"));
                contrat.setLibelle(rs.getString("Libelle"));
                                
                contrats.add(contrat);
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
            
         return contrats;
        }  
    }
}
