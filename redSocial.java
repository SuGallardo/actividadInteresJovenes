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
public class redSocial extends Interes {
    private String redFavorita; 

    public redSocial() {
    }

    public redSocial(String redFavorita, String usuario, String password, double tiempoConectado) {
        super(usuario, password, tiempoConectado);
        this.redFavorita = redFavorita;
    }
    
    /* metodos */
    
    
        public void listarPublicacion(List<redSocial> redSocialList) {
        System.out.println("Usuario:"+ redSocialList.get(0).usuario);
        System.out.println("Publicaciones: ");
        for (redSocial redSocial : redSocialList) {
            System.out.println("Su red es favorita es: " + redSocial.getRedFavorita());
            ;
        }
        }

    @Override
    public String VisualizarUsuario() {
        return super.VisualizarUsuario(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String getRedFavorita() {
        return redFavorita;
    }

    public void setRedFavorita(String redFavorita) {
        this.redFavorita = redFavorita;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
