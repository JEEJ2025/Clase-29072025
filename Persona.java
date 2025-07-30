/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author umg
 */
public class Persona {
    
    private String nombre;
    protected int edad;
    String genero;
    public String pais;

    
    // Esto es constructor
    public Persona(String nombre, int edad, String genero, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pais = pais;
    }
    // Get solo para clase privada
    public String getNombre() {
        return nombre;
    }
    //// Set solo para clase privada
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void mostrarInfo()
    {
        System.out.println("Nombre:"+ this.nombre);
        System.out.println("Edad:"+ this.edad);
        System.out.println("Genero:"+ this.genero);
        System.out.println("Pais:"+ this.pais);
    } 
    
}
