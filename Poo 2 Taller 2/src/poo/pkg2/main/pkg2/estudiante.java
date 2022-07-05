/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.pkg2.main.pkg2;

import javax.swing.JOptionPane;



/**
 *
 * @author jlio
 */
public class estudiante extends persona{
    public static Aula Aula = new Aula();
    public static persona persona= new persona();
    String carrera;

    public estudiante(String carrera, int notas, String name, String document, int asistencia, int estado, String edad, String sexo, int aula, String tipo) {
        super(name, document, asistencia, estado, edad, sexo, aula, tipo,notas);
        this.carrera = carrera;
        
    }

    estudiante() {
  
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

 
    
}
