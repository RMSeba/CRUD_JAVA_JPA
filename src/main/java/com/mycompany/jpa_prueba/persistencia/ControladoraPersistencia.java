
package com.mycompany.jpa_prueba.persistencia;

import com.mycompany.jpa_prueba.logica.Alumno;
import com.mycompany.jpa_prueba.logica.Carrera;
import com.mycompany.jpa_prueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladoraPersistencia {
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
   
    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void eliminarAlumno(int id){
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerLista() {
        
        List<Alumno>listaAlumnos=aluJpa.findAlumnoEntities();
        ArrayList<Alumno>listAlumnos=new ArrayList<Alumno>(listaAlumnos);
        
        return listAlumnos;

    }

    public void crearCarrera(Carrera carre) {
        carreJpa.create(carre);
    }

    public ArrayList<Carrera> traerListaC() {
        List<Carrera>listCarre = carreJpa.findCarreraEntities();
        ArrayList<Carrera>listaCarreras = new ArrayList<Carrera>(listCarre);
        return listaCarreras;
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  

   

   
}
