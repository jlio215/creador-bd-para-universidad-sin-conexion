/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.pkg2.main.pkg2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;



public class Aula {
     ArrayList<Aula> AulaConProfe = new ArrayList<>();
    int id;
    String materia;
    int totalEstudiantes;
    int asistenciaEstudiantes;

    public Aula(int id, String materia, int totalEstudiantes, int asistenciaEstudiantes) {
        this.id = id;
        this.materia = materia;
        this.totalEstudiantes = totalEstudiantes;
        this.asistenciaEstudiantes = asistenciaEstudiantes;
    }

    public void setAsistenciaEstudiantes(int asistenciaEstudiantes) {
        this.asistenciaEstudiantes = asistenciaEstudiantes;
    }
    
    public void setTotalEstudiantes(int totalEstudiantes) {
        this.totalEstudiantes = totalEstudiantes;
    }

    public Aula() {
    }

     public int getAsistenciaEstudiantes() {
        return asistenciaEstudiantes;
    }

    public int getTotalEstudiantes() {
        return totalEstudiantes;
    }


   
    public void setId(int id) {
        this.id = id;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getId() {
        return id;
    }
    
     public String getMateria() {
        return materia;
    }
    
    ArrayList<Aula> listarAula = new ArrayList<>();
    public void crearAula(){
    Aula d= new Aula();
            if(listarAula.isEmpty()){
            d.setId(1);
            }else{
            d.setId(listarAula.size()+1);
            }
            d.setMateria(JOptionPane.showInputDialog("ingrese la materia en minuscula"));
            System.out.println("en el aula de id "+d.getId()+" se dicta la materia: "+d.getMateria());
            d.setTotalEstudiantes(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de estudiantes de esta aula")));
            listarAula.add((Aula) d);}
    
    public int cantidadAulas(){
    int a = listarAula.size();
    return a;
}
    ArrayList<Aula> AulaConAsistenciaParaClase = new ArrayList<>();
    public void AulaAsistencia(){
    int b=0;
    int id=0;
    int c=0;
    for(Aula a:AulaConProfe){
    id=a.getId();
    b= a.getAsistenciaEstudiantes();
    c= listarAula.get(id-1).getTotalEstudiantes();
    int d=c/2;
    if(d<b){
    System.out.println("hay clase en el aula: "+id);
    }else{System.out.println(" no hay clase en el aula: "+id);}
    }
    }
    
    public int VerificarAulaProfesor (Map<Number, String> a){
        int key=0;
        int d=0;
        Iterator it = a.keySet().iterator();
        while(it.hasNext()){
        key = (int) it.next();
}
       Iterator < Aula > it1 = listarAula.iterator();
       while(it1.hasNext()){
           int c=it1.next().getId();
           String q =listarAula.get(key-1).getMateria();
           String w=a.get(key);
           if(key==c){
               if(q == null ? w == null : q.equals(w)){
               System.out.println("Profesor en el aula correcta");   
               d=c;}         
       }         
}
       return d;
}
        
    public void cantidadEstudiantesAsistidos(int room){
        for (Aula a:AulaConProfe){
        if (room==a.getId()){
           a.setAsistenciaEstudiantes(a.getAsistenciaEstudiantes()+1);
          System.out.println("asistencia "+a.getAsistenciaEstudiantes()+" en el aula: "+a.getId()); 
        }
      
        }
    
    }

    int j=0;
    public void AulaConProfesor(int a){
    if(a!=0){Aula r = new Aula();
    r.setId(a);
    AulaConProfe.add((Aula) r);
    for(Aula i: AulaConProfe){ 
        System.out.println("aula con profesor: "+i.id);
    }}else{
    for(Aula i: AulaConProfe){ 
        System.out.println("aula con profesor: "+i.id);
    }
    }   
    }
}
    
    
    

