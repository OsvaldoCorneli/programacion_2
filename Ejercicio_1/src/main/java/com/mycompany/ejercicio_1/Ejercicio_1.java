package com.mycompany.ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        // Numero Par o impar
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero:  ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        // Fibonacci
        System.out.print("Ingrese un numero:  ");
        int num = teclado.nextInt();
        if(num == 1){
            System.out.println("\n resultado es: "+ 0);
        } else if (num == 2){
            System.out.println("\n resultado es: " + 1);
        }else if(num == 0){
            System.out.println("\n Ingrese un numero mayor a 0");
        }
        else{
        int num1 = 0;
        int num2 = 1;
        int resultado = 0;
        
        for (int i = 0; i < num - 2; i++) {
            resultado = num1 + num2;
            num1 = num2;
            num2 = resultado;

        }
        
        System.out.println("\n resultado es: " + resultado);
        }
        
        
        //Potencia
        
        System.out.print("Ingresar la base: ");
        int base = teclado.nextInt();
        System.out.print("\n Ingrese el exponente: ");
        int exponente = teclado.nextInt();
        int potencia = 1;
        
        if(exponente >= 0){
            for(int i=0; i<exponente; i++){
                potencia = potencia * base;
            }
            System.out.println("El resultado es: "+potencia);
        }else{
            System.out.print("El exponente no debe ser negativo.");
        }
        
        
        //es primo
        
        
    }
}
