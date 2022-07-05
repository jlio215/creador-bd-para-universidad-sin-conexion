/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.pkg2.main.pkg2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;




public class persona {
    public static estudiante estudiante= new estudiante();
    public static profesor profesor = new profesor();
    public static Aula Aula= new Aula();
    
    String name;
    String document;
    int asistencia;
    int estado;
    String edad;
    String sexo;
    int aula;
    String tipo;
    int notas;

    public persona(String name, String document, int asistencia, int estado, String edad, String sexo, int aula, String tipo, int notas) {
        this.name = name;
        this.document = document;
        this.asistencia = asistencia;
        this.estado = estado;
        this.edad = edad;
        this.sexo = sexo;
        this.aula = aula;
        this.tipo = tipo;
        this.notas = notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public int getNotas() {
        return notas;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    } 

    public persona() {
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public int getEstado() {
        return estado;
    }

    public String getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getAula() {
        return aula;
    }
    
    

    public void setName(String name) {
        this.name = name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }
    ArrayList<persona> listarPersona = new ArrayList<>();
    Map<Number,String> crearProfesor (int b){
    Map<Number, String> IdAsignatura = new HashMap<>();
   int a=0;
   String z;
    profesor p= new profesor();
            p.setTipo("Profesor");
            p.setName(JOptionPane.showInputDialog("ingrese el nombre"));
            p.setDocument(JOptionPane.showInputDialog("ingrese el documento"));
            p.setEdad(JOptionPane.showInputDialog("ingrese la edad"));
            p.setSexo(JOptionPane.showInputDialog("m para masculino o f para femenino"));
            p.setAsignatura(JOptionPane.showInputDialog("ingrese la asignatura que dicta"));
            z=p.getAsignatura();
            while(0>=a||a>b){
                p.setAula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la aula tal cual lo ve en la consola")));
            a = p.getAula();}
            listarPersona.add((profesor) p);
            IdAsignatura.put(a,z);
            return IdAsignatura;
}
 
    public int crearEstudiantes(int c){
    estudiante e= new estudiante();
    int a=0;
    boolean b=false;
            e.setTipo("Estudiante");
            e.setName(JOptionPane.showInputDialog("ingrese el nombre"));
            e.setDocument(JOptionPane.showInputDialog("ingrese el documento"));
            e.setEdad(JOptionPane.showInputDialog("ingrese la edad"));
            e.setSexo(JOptionPane.showInputDialog("m para masculino o f para femenino"));
            e.setCarrera(JOptionPane.showInputDialog("ingrese la carrera"));
            e.setNotas(Integer.parseInt(JOptionPane.showInputDialog("la nota promedio")));
            while(b!=true)
            {   e.setAula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el aula igual como le aparece en consola")));
                a= e.getAula();
                b=(a<=c && a>0);
            }
            listarPersona.add((estudiante) e);
        return a;
    
    }

     public void  AsignarEstado(persona a){
         int i=1;
        int b= listarPersona.size();
        byte opcion = 0;
        if(i<=b){
       do {
           i++;
           opcion = Byte.parseByte(JOptionPane.showInputDialog(
           "MENU\n"
           +"El usuario: "+a.name+"\n"
           +"De tipo: "+a.tipo+"\n"
           +  "1.asistio\n "
           +  "2.no asistio\n " 
           +  "3.novillo\n "        
           +  "4.reunion "        
           ));
       switch (opcion){
               case 1: 
                   a.setEstado(1);
                   break;
               case 2: 
                   a.setEstado(2);
                   break;
               case 3: 
                   a.setEstado(1);
                   break;
               case 4: 
                   a.setEstado(2);
                   break;
           } }while(i==b-1);
        }
     
    }
     public void verNotas (){
     String doc;
     for(persona e: listarPersona){
         if("Estudiante".equals(e.tipo)){
         
             if(e.notas>3){
                System.out.println("la nota del estudiante: "+e.name+" es :"+e.notas+" alumno ya aprobado");
             }else{
         System.out.println("la nota del estudiante: "+e.name+" es: "+e.notas+" alumno no aprobado");
         }}else{System.out.println("alumno no existe");}
    }  } 
}
