
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersi = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String color,
            String observaciones, String alergico, String especial, 
            String nombreDuenio, String celDuenio) {
        //creamos el dueño  y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        
        Mascota masco = new Mascota();
        masco.setNombreMascota(nombreMascota);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(especial);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        controlPersi.guardar(duenio,masco);
    }

    public List<Mascota> traerMascotas() {
        return controlPersi.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersi.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersi.traerMascota(num_cliente);
    }
    
}
