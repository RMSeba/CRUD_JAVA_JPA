

package com.mycompany.jpa_prueba;

import com.mycompany.jpa_prueba.logica.Alumno;
import com.mycompany.jpa_prueba.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;


public class JPA_Prueba {

    public static void main(String[] args) {
        Controladora contro  = new Controladora();
       
       Alumno alu2 = new Alumno(4,"raasa","sasaa",new Date());
       
       contro.crearAlumno(alu2);
       
       //alu2.setApellido("Lopez");
       
      // contro.editarAlumno(alu2);
       
      /* contro.eliminarAlumno(2);*/
      
         Alumno alu3=contro.traerAlumno(1);
        System.out.println("---------------Busqueda Individual------------------");
        System.out.println(alu3.toString()); 
        System.out.println("------------------------Busqueda Total-----------------------------");
        
        ArrayList<Alumno>listaAlumnos=new ArrayList<Alumno>(contro.traerLista());
        for (Alumno alu:listaAlumnos){
            System.out.println(alu.toString());
        
        }
    }
}
