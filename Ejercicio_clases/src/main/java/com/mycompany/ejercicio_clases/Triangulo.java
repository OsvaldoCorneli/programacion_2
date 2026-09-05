/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_clases;

/**
 *
 * @author Osvaldo
 */
public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(){
        this.base = 0.0;
        this.base = 0.0;
    }
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea(){
        
        return (this.base * this.altura)/2;
    }
    
    public float calcularPerimetro(){
        double catetoMenor = this.base;
        double catetoMayor = this.altura;
        double hipotenusa = Math.sqrt(Math.pow(catetoMenor, 2) + Math.pow(catetoMayor, 2));
        
        return (float) Math.round((catetoMayor + catetoMenor + hipotenusa)*100.0f)/100.0f;
        
        
    }
    
}
