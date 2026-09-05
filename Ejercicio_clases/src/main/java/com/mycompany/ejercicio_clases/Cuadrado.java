package com.mycompany.ejercicio_clases;

/**
 *
 * @author Osvaldo
 */
public class Cuadrado {
    private double lado;
    
    public Cuadrado(){
        this.lado = 0.0;
    }
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return this.lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double calcularPerimetro(){
        return this.lado * 4;
    }
    
    public double calcularArea(){
        return this.lado * this.lado;
    }
}
