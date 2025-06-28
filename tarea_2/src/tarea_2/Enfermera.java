/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

/**
 *
 * @author ANGEL
 */
class Enfermera {

    class Enfermera extends Persona 
    private String turno;

    public Enfermera() {
        super();
        this.turno = "mañana";
    }

    public Enfermera(String nombre, String turno) {
        super(nombre);
        this.turno = turno;
    }

    public Enfermera(String nombre, int edad, String turno) {
        super(nombre, edad);
        this.turno = turno;
    

    public String toString() {
        return "Enfermera [" + super.toString() + ", turno=" + turno + "]";
    }

}