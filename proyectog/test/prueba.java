/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import GeneradorGrafoAleatorio.Erdos_Renyi;
import GeneradorGrafoAleatorio.Gilbert;
import GeneradorGrafoAleatorio.Geografico;
import GeneradorGrafoAleatorio.BarabasiAlbert;
import GeneradorGrafoAleatorio.BFS;
import GeneradorGrafoAleatorio.DFS;

public class TestGrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try { /* 
        Erdos_Renyi er = new Erdos_Renyi(100,1000,true, false);
        er.ConstruyeGrafo();
        er.EscribeArchivo();
        
        Gilbert gil = new  Gilbert(30, 0.6f, true, false);
        gil.ConstruyeGrafo();
        gil.EscribeArchivo();
        
        Gilbert gil100 = new  Gilbert(100, 0.6f, true, false);
        gil100.ConstruyeGrafo();
        gil100.EscribeArchivo();
        
        Gilbert gil500 = new  Gilbert(500, 0.4f, true, false);
        gil500.ConstruyeGrafo();
        gil500.EscribeArchivo();
        
        Geografico g30 = new Geografico (30, 0.35f, true, false);
        g30.ConstruyeGrafo();
        g30.EscribeArchivo();
        
        Geografico g100 = new Geografico (100, 0.35f, true, false);
        g100.ConstruyeGrafo();
        g100.EscribeArchivo();
        
        Geografico g500 = new Geografico (500, 0.35f, true, false);
        g500.ConstruyeGrafo();
        g500.EscribeArchivo();
        
        Geografico g501 = new Geografico (501, 0.1f, true, false);
        g501.ConstruyeGrafo();
        g501.EscribeArchivo();
        
        
        BarabasiAlbert baGrafo30 = new BarabasiAlbert(30,5,true, false);
        baGrafo30.ConstruyeGrafo();
        baGrafo30.EscribeArchivo();
        
        BarabasiAlbert baGrafo100 = new BarabasiAlbert(100,10,true, false);
        baGrafo100.ConstruyeGrafo();
        baGrafo100.EscribeArchivo();
        
        BarabasiAlbert baGrafo500 = new BarabasiAlbert(500,10,true, false);
        baGrafo500.ConstruyeGrafo();
        baGrafo500.EscribeArchivo();
            
        BarabasiAlbert baGrafo33 = new BarabasiAlbert(33,5,false, false);
        baGrafo33.ConstruyeGrafo();
        baGrafo33.EscribeArchivo();
        
        BFS bfsBA33 = new BFS(baGrafo33, 32);
        try{
            bfsBA33.ConstruyeGrafo();
        }
        catch(Exception ex){
            System.out.println("BuidError: " + ex.getMessage());
        }            
        bfsBA33.EscribeArchivo();
        */
        Geografico g106 = new Geografico (106, 0.35f, true, false);
        g106.ConstruyeGrafo();
        g106.EscribeArchivo();
        
        DFS dfsGeo106 = new DFS(g106, 0);
        try{
            dfsGeo106.ConstruyeGrafo();
        }
        catch(Exception ex){
            System.out.println("BuidError: " + ex.getMessage());
        }            
        dfsGeo106.EscribeArchivo();
            /*
        BarabasiAlbert baGrafo103 = new BarabasiAlbert(103,10,true, false);
        baGrafo103.ConstruyeGrafo();
        baGrafo103.EscribeArchivo();
        
        BFS bfsBA103 = new BFS(baGrafo103, 0);
        try{
            bfsBA103.ConstruyeGrafo();
        }
        catch(Exception ex){
            System.out.println("BuidError: " + ex.getMessage());
        }            
        bfsBA103.EscribeArchivo();
        
        BarabasiAlbert baGrafo503 = new BarabasiAlbert(503,10,true, false);
        baGrafo503.ConstruyeGrafo();
        baGrafo503.EscribeArchivo();
        
        BFS bfsBA503 = new BFS(baGrafo503, 0);
        try{
            bfsBA503.ConstruyeGrafo();
        }
        catch(Exception ex){
            System.out.println("BuidError: " + ex.getMessage());
        }            
        bfsBA503.EscribeArchivo();
          */  
            
        /*    
        Geografico g31 = new Geografico (31, 0.35f, true, false);
        g31.ConstruyeGrafo();
        g31.EscribeArchivo();
        
        BFS bfsGeo31 = new BFS(g31, 0);
        try{
            bfsGeo31.ConstruyeGrafo();
        }
        catch(Exception ex){
            System.out.println("BuidError: " + ex.getMessage());
        }            
        bfsGeo31.EscribeArchivo();
        
        
        Geografico g101 = new Geografico (101, 0.35f, true, false);
        g101.ConstruyeGrafo();
        g101.EscribeArchivo();
        
        BFS bfsGeo101 = new BFS(g101, 0);
        try{
            bfsGeo101.ConstruyeGrafo();
        }
        catch(Exception ex){
            System.out.println("BuidError: " + ex.getMessage());
        }            
        bfsGeo101.EscribeArchivo();
        
        Geografico g501 = new Geografico (501, 0.35f, true, false);
        g501.ConstruyeGrafo();
        g501.EscribeArchivo();   
         
        BFS bfsGeo501 = new BFS(g501, 0);
        try{
            bfsGeo501.ConstruyeGrafo();
        }
        catch(Exception ex){
            System.out.println("BuidError: " + ex.getMessage());
        }            
        bfsGeo501.EscribeArchivo();
          
            
          /*  
        Gilbert gil = new  Gilbert(510, 0.4f, false, false);
        gil.ConstruyeGrafo();
        gil.EscribeArchivo();
        
        BFS bfsGil = new BFS(gil, 0);
        try{
            bfsGil.ConstruyeGrafo();
        }
        catch(Exception ex){
            System.out.println("BuidError: " + ex.getMessage());
        }            
        bfsGil.EscribeArchivo();
             
            Erdos_Renyi er = new Erdos_Renyi(500,1000,false, false);
            er.ConstruyeGrafo();
            er.EscribeArchivo();
            
            
            BFS bfs = new BFS(er, 0);
            try{
                bfs.ConstruyeGrafo();
            }
            catch(Exception ex){
                System.out.println("BuidError: " + ex.getMessage());
            }            
            bfs.EscribeArchivo();
            
            */
            
        
        }
        catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }        
    }    
}
