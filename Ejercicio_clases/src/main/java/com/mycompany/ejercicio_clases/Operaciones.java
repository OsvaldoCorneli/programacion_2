/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_clases;

/**
 *
 * @author Osvaldo
 */
public class Operaciones {

    static boolean esPrimo(int num) {

        boolean isPrimo = true;

        if (num <= 1) {
            isPrimo = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }

        if (isPrimo) {
            return true;
        } else {
            return false;
        }
    }

}
