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
public class musica extends Interes {
    private String tipoMusica;

    public musica() {
    }

    public musica(String tipoMusica, String usuario, String password, double tiempoConectado) {
        super(usuario, password, tiempoConectado);
        this.tipoMusica = tipoMusica;
    }
    
    /* metodos */ 
    
        public void listarPublicacion(List<musica> MusicaList) {
        System.out.println("Usuario:"+ MusicaList.get(0).usuario);
        System.out.println("Publicaciones: ");
        for (musica musica : MusicaList) {
            System.out.println("Su tipo de música es " + musica.getTipoMusica());
            ;
        }
        }

    @Override
    public String VisualizarUsuario() {
        return super.VisualizarUsuario();
       
        //To change body of generated methods, choose Tools | Templates.
    }


        
        
        
        

    
    
    /* getter and setter */ 
    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

