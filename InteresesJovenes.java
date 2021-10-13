/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interesesjovenes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Susana
 */
public class InteresesJovenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        List<musica> musicInteres = new ArrayList<musica>();
        List<seriesTv> tvInteres = new ArrayList<seriesTv>();
        List<redSocial> rrssInteres = new ArrayList<redSocial>();
        
        
        /* ingresar usuario */ 
        
        Scanner s = new Scanner (System.in);
        
            int opcion = 0;

            System.out.println("Bienvenido");
            while (opcion != 1){
            System.out.println("1.Ingresar usuario\n2. Salir");
            s.nextLine();
            System.out.println("Ingrese su usuario: ");
            String user = s.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String pass = s.nextLine();
            System.out.println("Ingrese tiempo conectado: ");
            double time = s.nextDouble();
            System.out.println("¿Cuál es su elección? \n 1. Música \n 2. Tv o series \n 3. Redes Sociales");
            int op = s.nextInt();
            if (op == 1){
                    System.out.println("Tipo de música preferida: ");                    
                    String musicatipo = s.nextLine();
                    s.nextLine();
                    musica musicfav = new musica (musicatipo, user, pass, time);
                    musicInteres.add(musicfav);  
                    System.out.println("Gracias por su respuesta");
                    }
                    if (op == 2){
                    System.out.println("Género de películas o series favorito: ");
                    String serietipo = s.nextLine();
                    s.nextLine();
                    seriesTv tvfav = new seriesTv(serietipo, user, pass, time);
                    tvInteres.add(tvfav);
                    System.out.println("Gracias por su respuesta");
                    }
                    if (op == 3){
                    System.out.println("Red Social favorita: ");
                    String redfavorita = s.nextLine();
                    s.nextLine();
                    redSocial redfav = new redSocial(redfavorita, user, pass, time);
                    rrssInteres.add(redfav);
                    System.out.println("Gracias por su respuesta");}
                    
                    if (opcion == 2){
                   System.out.println("Gracias por su participación");
              
                    

}               
           

    
    
    }
            
         
        

    
        
 
        
    
    
    }
}
