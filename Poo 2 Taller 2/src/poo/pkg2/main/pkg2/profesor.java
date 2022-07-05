/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.pkg2.main.pkg2;

public class profesor extends persona{
    public static Aula Aula= new Aula();
    String asignatura;
    String tipo;

    public profesor() {
    }

    public profesor(String asignatura, String tipo, String name, String document, int asistencia, int estado, String edad, String sexo, int aula,int notas) {
        super(name, document, asistencia, estado, edad, sexo, aula,tipo,notas);
        this.asignatura = asignatura;
        this.tipo = tipo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String materia) {
        this.asignatura = materia;
    }
   
}
