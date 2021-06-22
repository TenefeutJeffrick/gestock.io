/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstock;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JeffrickTenefeut
 */
public class Connectionj {
    public static Connection connection(){
        Connection con;
        try{
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionstock", "root", "");
            return con;
            
        }
        catch(SQLException exception){
            return null;
        }
    }
    
}
