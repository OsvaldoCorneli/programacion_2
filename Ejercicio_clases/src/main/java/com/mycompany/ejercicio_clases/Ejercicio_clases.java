/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio_clases;

import java.util.Scanner;

/**
 *
 * @author Osvaldo
 */
public class Ejercicio_clases {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;
        do {
            int opcase = -1;
            System.out.print("""
                               ******************************
                               1) Clase cuadrado.
                               2) Clase triangulo.
                               3) Clase Rectangulo.
                               0) Salir
                               
                               ******************************
                               Seleccion una opcion: 
                               """);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    do {
                        System.out.print("Ingrese el tamaño del lado de un cuadrado:   ");
                        int lado = teclado.nextInt();
                        Cuadrado cuad = new Cuadrado(lado);
                        System.out.print("""
                                  **************************
                                   Menu opciones cuadrado
                                   
                                   1) calcular el area:
                                   2) calcular el perimetro:
                                 
                                  ****************************
                                  Ingrese la opcion:  
                                   """);

                        int opc = teclado.nextInt();
             
                        if (opc == 1) {
                            System.out.println("El area del cuadrado es: "+cuad.calcularArea());
                        }
                        if (opc == 2) {
                            System.out.println("El perimetro del cuadrado es: "+cuad.calcularPerimetro());
                        }

                        System.out.print("Ingrese 0 para volver al menu anterior 1 para ingresar otro cuadrado:  ");
                        opcase = teclado.nextInt();
                    } while (opcase != 0);
                    break;
                case 2:
                        do{
                            System.out.print("Ingrese la base del triangulo: ");
                            int base = teclado.nextInt();
                            System.out.print("Ingrese la altura del triangulo: ");
                            int altura = teclado.nextInt();
                            
                            Triangulo tria = new Triangulo(base, altura);
                            
                            System.out.print("""
                                  **************************
                                   Menu opciones triangulo
                                   
                                   1) calcular el area:
                                   2) calcular el perimetro:
                                 
                                  ****************************
                                  Ingrese la opcion:  
                                   """);

                        int opc = teclado.nextInt();
                         if (opc == 1) {
                            System.out.println("El area del triangulo es: "+tria.calcularArea());
                        }
                        if (opc == 2) {
                            System.out.println("El perimetro del triangulo es: "+tria.calcularPerimetro());
                        }

                                
                            
                         System.out.print("Ingrese 0 para volver al menu anterior 1 para ingresar otro triangulo:  ");
                        opcase = teclado.nextInt();
                        }while(opcase != 0 );
                        break;
                case 3:
                         do{
                            System.out.print("Ingrese la base del rectangulo: ");
                            int base = teclado.nextInt();
                            System.out.print("Ingrese la altura del rectangulo: ");
                            int altura = teclado.nextInt();
                            
                            Rectangulo rec = new Rectangulo(base,altura);
                            
                            System.out.print("""
                                  **************************
                                   Menu opciones rectangulo
                                   
                                   1) calcular el area:
                                   2) calcular el perimetro:
                                 
                                  ****************************
                                  Ingrese la opcion:  
                                   """);

                        int opc = teclado.nextInt();
                         if (opc == 1) {
                            System.out.println("El area del rectangulo es: "+rec.calcularArea());
                        }
                        if (opc == 2) {
                            System.out.println("El perimetro del rectangulo es: "+rec.calcularPerimetro());
                        }

                                
                            
                         System.out.print("Ingrese 0 para volver al menu anterior 1 para ingresar otro rectangulo:  ");
                        opcase = teclado.nextInt();
                        }while(opcase != 0 );
                         break;
                default:
                    System.out.println("Opcion invalida.");
                 
            }
        } while (opcion != 0);
        teclado.close();
    }
}
  