/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import proyectog.ErdosRenyi;
import proyectog.Gilbert;
import proyectog.ModeloGeografico;
import proyectog.BarabasiAlbert;

/**
 *
 * @author alber
 */
public class Ventanaproyecto extends javax.swing.JFrame{   
    
//@SuppressWarnings ("unchecked")
    public static void main(String[] args) {
        try {
        menuapp principal = new menuapp();
        principal.setVisible(true);
        }
        catch(Exception ex){
            System.out.println("Error: " + ex.toString());
        }       
}
    
}
        
       

