/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_clases;

/**
 *
 * @author Osvaldo
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
        this.base = 0.0;
        this.altura = 0.0;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public float calcularArea() {
        return (float) (this.base * this.altura);
    }

    public float calcularPerimetro() {
        return (float) ((this.base*2) + (this.altura *2));
    }
}
