

package com.mycompany.jpa_prueba;

import com.mycompany.jpa_prueba.logica.Alumno;
import com.mycompany.jpa_prueba.logica.Carrera;
import com.mycompany.jpa_prueba.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;


public class JPA_Prueba {

    public static void main(String[] args) {
        Controladora contro  = new Controladora();
        
        Carrera carre = new Carrera (1,"Licenciatura en Sistemas");
       // contro.crearCarrera(carre);
        
       Alumno alu1 = new Alumno (4,"pablo","Sanchez",new Date(),carre );
       contro.crearAlumno(alu1);
        
        System.out.println("------------------------Busqueda Total-----------------------------");
        
        ArrayList<Alumno>listaAlumnos=new ArrayList<Alumno>(contro.traerLista());
        
        for (Alumno alu:listaAlumnos){
           
            System.out.println(alu.toString());
            
        }
        System.out.println("-------------------------");
       /*System.out.println("-----------------------------------");
       System.out.println(alu1.toString());*/
        
}
    
}
