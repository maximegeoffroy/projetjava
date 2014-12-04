package megacasting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import megacasting.dao.DiffuseurDAO;
import megacasting.dao.SocieteDAO;
import megacasting.entite.Diffuseur;
import megacasting.entite.Societe;


public class MegaCasting {

static Connection connection;

    public static void main(String[] args) {
        String driver = "net.sourceforge.jtds.jdbc.Driver";
        String url = "jdbc:jtds:sqlserver://localhost/MegaCastingMGEOFF";
        String user = "sa";
        String password = "sql2012";
      
        
        try {
            Class.forName(driver);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connexion réussie");
            
            //List<Diffuseur> liste = DiffuseurDAO.lister(connection);
            
            //RECUPERE LES ID DIFFUSEURS ET AFFICHE LES INFOS
            /*for(Diffuseur d : liste){
                int id = d.getId();
                
                Societe s = SocieteDAO.trouver(connection, id);
                if(s != null){
                    System.out.println(s.toString());
                }else{
                    System.out.println("ERREUR");
                }
            }*/
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }            
        }       

    }
    
}
