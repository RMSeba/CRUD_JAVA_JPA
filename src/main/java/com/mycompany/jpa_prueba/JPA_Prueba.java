

package com.mycompany.jpa_prueba;

import com.mycompany.jpa_prueba.logica.Alumno;
import com.mycompany.jpa_prueba.logica.Carrera;
import com.mycompany.jpa_prueba.logica.Controladora;
import com.mycompany.jpa_prueba.logica.Materia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


public class JPA_Prueba {

    public static void main(String[] args) {
        Controladora contro  = new Controladora();
        
        LinkedList<Materia>listaMaterias = new LinkedList<Materia>();
        
        Carrera carre1 = new Carrera(1,"Licenciatura en Sistemas", listaMaterias);
        
        contro.crearCarrera(carre1);
        
        
        
        Materia mate1 = new Materia (1,"Base de Datos","Cuatrimestral",carre1);
        Materia mate2 = new Materia(2,"Programacion 2", "Anual",carre1);
        
        contro.crearMateria(mate1);
        contro.crearMateria(mate2);
        
     
        
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        
        carre1.setListaMaterias(listaMaterias);
        contro.editarCarrera(carre1);
        
        Alumno alu1 = new Alumno(1, "Martin","Romero",new Date(), carre1);
        
        contro.crearAlumno(alu1);
        
        System.out.println("Datos del Alumno");
        
        System.out.println(alu1.toString());
        System.out.println("Datos de la carrera: "+ alu1.getCarrera().toString() );
        
        System.out.println("----------------------------------");
        
        
        
        
        
        
        
        
        
       
        
        
}
    
}
