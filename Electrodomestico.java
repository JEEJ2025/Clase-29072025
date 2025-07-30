/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author umg
 */
public class Electrodomestico {
    
    private String marca;
    protected int tamaño;
    String  categoria;
    public String color;
 
    // elaboracion del constructor 

    public Electrodomestico(String marca, int tamaño, String categoria, String color) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.categoria = categoria;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}