
package com.mycompany.login.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //con esto decimos que usuario se transforma en tabla
public class Usuario implements Serializable {
    @Id // el atributo id sera el indentificador en la tabla de BD
    @GeneratedValue(strategy=GenerationType.AUTO) //generar valores automaticos   
    private int id;
    private String nombreUsuario;
    private String contrasenia;
   
    public Usuario(){}
    
    public Usuario(int id, String nombreUsuario, String contrasenia){
        this.id=id;
        this.nombreUsuario=nombreUsuario;
        this.contrasenia=contrasenia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    
    
    
}
