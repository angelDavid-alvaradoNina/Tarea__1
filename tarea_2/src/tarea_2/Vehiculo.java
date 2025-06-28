/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

/**
 *
 * @author ANGEL
 */
class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo() {
        this.marca = "Genérica";
        this.modelo = "ModeloX";
        this.año = 2000;
    }

    public Vehiculo(String marca) {
        this.marca = marca;
        this.modelo = "Desconocido";
        this.año = 2000;
    }

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = anio;
    }

    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", año=" + anio + "]";
    }
}
