/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megacasting;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author MAXIME
 */
public class Fonctions {
    public static String recupSaisie(){
        /////////////////////////FLUX D'ENTREE\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        //FLUX CLAVIER\\
        InputStream is = null;
        
        try{
           is = System.in;
           InputStreamReader ir = new InputStreamReader(is);
           BufferedReader br = new BufferedReader(ir);
           
           String line;
           if((line = br.readLine()) != null) {
               return line;
           }  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
