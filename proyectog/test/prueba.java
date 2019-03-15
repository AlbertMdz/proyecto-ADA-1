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
public class prueba {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            
        /*
        ErdosRenyi30 = new ErdosRenyi(30,1000,true, false);
        er.ConstruyeGrafo();
        er.EscribeArchivo();    
            
        ErdosRenyi100 = new ErdosRenyi(100,1000,true, false);
        er.ConstruyeGrafo();
        er.EscribeArchivo();
        ErdosRenyi500 = new ErdosRenyi(500,1000,true, false);
        er.ConstruyeGrafo();
        er.EscribeArchivo();
        
        Gilbert gil30 = new  Gilbert(30, 0.6f, true, false);
        gil.ConstruyeGrafo();
        gil.EscribeArchivo();
        
        Gilbert gil100 = new  Gilbert(100, 0.6f, true, false);
        gil100.ConstruyeGrafo();
        gil100.EscribeArchivo();
        
        Gilbert gil500 = new  Gilbert(500, 0.4f, true, false);
        gil500.ConstruyeGrafo();
        gil500.EscribeArchivo();
        
        Geografico g30 = new ModeloGeografico (30, 0.35f, true, false);
        g30.ConstruyeGrafo();
        g30.EscribeArchivo();
        
        Geografico g100 = new ModeloGeografico (100, 0.35f, true, false);
        g100.ConstruyeGrafo();
        g100.EscribeArchivo();
        
        Geografico g500 = new ModeloGeografico (500, 0.35f, true, false);
        g500.ConstruyeGrafo();
        g500.EscribeArchivo();         
        
        BarabasiAlbert baGrafo30 = new BarabasiAlbert(30,5,true, false);
        baGrafo30.ConstruyeGrafo();
        baGrafo30.EscribeArchivo();
        
        BarabasiAlbert baGrafo100 = new BarabasiAlbert(100,10,true, false);
        baGrafo100.ConstruyeGrafo();
        baGrafo100.EscribeArchivo();
        */
        BarabasiAlbert baGrafo500 = new BarabasiAlbert(500,15,true, false);
        baGrafo500.ConstruyeGrafo();
        baGrafo500.EscribeArchivo();
        
        }
        catch(Exception ex){
            System.out.println("Error: " + ex.toString());
        }        
    }    
}
