/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interesesjovenes;

import java.util.List;

/**
 *
 * @author Susana
 */
public class seriesTv extends Interes{
    private String genero;

    public seriesTv() {
    }

    public seriesTv(String genero, String usuario, String password, double tiempoConectado) {
        super(usuario, password, tiempoConectado);
        this.genero = genero;
    }
    
            public void listarPublicacion(List<seriesTv> seriesTvList) {
        System.out.println("Usuario:"+ seriesTvList.get(0).usuario);
        System.out.println("Publicaciones: ");
        for (seriesTv seriesTv : seriesTvList) {
            System.out.println("Su genero favorito es: " + seriesTv.getGenero());
            
            ;
        }
        }

    @Override
    public String VisualizarUsuario() {
        return super.VisualizarUsuario(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
