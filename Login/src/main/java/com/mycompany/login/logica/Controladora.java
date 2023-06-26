/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis;

    public Controladora() {
        controlPersis = new ControladoraPersistencia(); 
    }
    
    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje="";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    mensaje="Usuario y contraseña correctos.Bienvenidos/as";
                    return mensaje;
                }
                else{
                   mensaje="Contraseña incorrecta"; 
                   return mensaje;
                }
            }
            else{
                mensaje="Usuario no encontrado";
                //return mensaje;
            }
        }
        return mensaje;
    }
}
