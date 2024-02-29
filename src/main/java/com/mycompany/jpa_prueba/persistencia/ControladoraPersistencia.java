
package com.mycompany.jpa_prueba.persistencia;

import com.mycompany.jpa_prueba.logica.Alumno;
import com.mycompany.jpa_prueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladoraPersistencia {
    AlumnoJpaController aluJpa = new AlumnoJpaController();

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

   

   
}
