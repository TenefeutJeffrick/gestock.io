/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstock;

import static gestionstock.Connectionj.connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JeffrickTenefeut
 */
public class Ajout {
   
   
   public static void ajoututilisateur(String username,String password,String repeate) {
      
       try {
            Connection con=connection();
            PreparedStatement pst =con.prepareStatemen("INSERT INTO utilisateur username,password,repeate VALUES (?,?,?)");
           pst.setString(1,username);
           pst.setString(1,password);
           pst.setString(1,repeate);
       } catch (SQLException ex) {
           Logger.getLogger(Ajout.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
    
}
