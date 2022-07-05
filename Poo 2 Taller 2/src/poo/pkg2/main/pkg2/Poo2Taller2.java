/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.pkg2.main.pkg2;


import java.util.Collections;
import java.util.Map;
import javax.swing.JOptionPane;
import java.util.*;
import static java.util.Collections.list;


public class Poo2Taller2 {
public static profesor profesor = new profesor();
public static estudiante  estudiante = new estudiante();
public static Aula Aula = new Aula();
public static persona persona = new persona();

    public static void main(String[] args) {
       byte opcion = 0;
       do {
          opcion = Byte.parseByte(JOptionPane.showInputDialog(
           "MENU\n"
           +  "1.Crear aula\n "
           +  "2.Crear proferor\n " 
           +  "3.Crear Estudiantes\n "       
           +  "4.Tomar asisencia\n "  
           +  "5.ver notas por documentos\n " 
           +  "6.Salir "        
           ));
           
           switch (opcion){
               case 1: 
                   Aula.crearAula();
                   break;
               case 2:
                    int statet=0;
                    if(Aula.listarAula.isEmpty()){
                    JOptionPane.showMessageDialog(null,"cree primero un aula");
                    }else{
                   int a= Aula.cantidadAulas();
                   Map<Number, String> b = persona.crearProfesor(a);
                   int m= persona.listarPersona.size()-1;
                   persona n= persona.listarPersona.get(m);
                   persona.AsignarEstado(n);
                   statet= n.getEstado();
                   if(statet==1){
                   int q= Aula.VerificarAulaProfesor(b);
                   Aula.AulaConProfesor(q);
                    }}
                   break;
               case 3: 
                    if(Aula.listarAula.isEmpty()){
                    JOptionPane.showMessageDialog(null,"cree primero un aula");
                    }else{
                   int a=Aula.listarAula.size();
                   persona.crearEstudiantes(a);}
                   break;
               case 4:
                int state=0;
                int room=0;
                for(persona p: persona.listarPersona){
                 if(p.getTipo()=="Estudiante"){
                   persona.AsignarEstado(p);}                
                state= p.getEstado();
                room = p.getAula();
                if (state==1&&"Estudiante".equals(p.getTipo())){
                Aula.cantidadEstudiantesAsistidos(room);}
        }
                   Aula.AulaAsistencia();
                   break;
               case 5:
                  persona.verNotas ();
                   break;
    }
    
}while(opcion!=6);
}}
