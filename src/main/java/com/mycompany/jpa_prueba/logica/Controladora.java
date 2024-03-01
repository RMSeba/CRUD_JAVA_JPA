
package com.mycompany.jpa_prueba.logica;

import com.mycompany.jpa_prueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //Alumno
    public void crearAlumno(Alumno alu){
    
    controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id){
    controlPersis.eliminarAlumno(id);
    }
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    public Alumno traerAlumno(int id){
        return controlPersis.traerAlumno(id);
    }
    public ArrayList<Alumno>traerLista(){
    
        return controlPersis.traerLista();
    }
    
    
    //Carrera 
    
     public void crearCarrera(Carrera carre){
    
    controlPersis.crearCarrera(carre);
    }
    
    public void eliminarCarrera(int id){
    controlPersis.eliminarCarrera(id);
    }
    public void editarCarrera(Carrera carre){
        controlPersis.editarCarrera(carre);
    }
    
    public Carrera traerCarrera(int id){
        return controlPersis.traerCarrera(id);
    }
    public ArrayList<Carrera>traerListaC(){
    
        return controlPersis.traerListaC();
    }
}
