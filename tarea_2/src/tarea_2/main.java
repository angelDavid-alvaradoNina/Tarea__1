/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

/**
 *
 * @author ANGEL
 */
public class main {
  public static void main(String[] args) {
  
        Persona p1 = new Persona();
        Persona p2 = new Persona("juan");
        Persona p3 = new Persona("marta", 28);
        
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado("Luis", "Gerente");
        Empleado e3 = new Empleado("Marta", 35, "cajera");

      
        Enfermera n1 = new Enfermera();
        Enfermera n2 = new Enfermera("Rosa", "Mañana");
        Enfermera n3 = new Enfermera("Clara", 40, "Tarde");

     
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo("zuzuki");
        Vehiculo v3 = new Vehiculo("Honda", "toyota", 2022);

     
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }  
}
