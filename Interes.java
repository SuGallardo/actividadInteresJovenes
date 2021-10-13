/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interesesjovenes;

/**
 *
 * @author Susana
 */
public class Interes {
    protected String usuario;
    protected String password;
    protected double tiempoConectado;
    
    /* contructores */

    public Interes() {
    }

    public Interes(String usuario, String password, double tiempoConectado) {
        this.usuario = usuario;
        this.password = password;
        this.tiempoConectado = tiempoConectado;
    }
    
    
    public String VisualizarUsuario(){
    System.out.println("Usuario conectado ");
       return usuario;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /* getter and setters */

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getTiempoConectado() {
        return tiempoConectado;
    }

    public void setTiempoConectado(double tiempoConectado) {
        this.tiempoConectado = tiempoConectado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
