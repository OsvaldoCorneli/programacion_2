/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase_string;

import java.util.Scanner;

/**
 *
 * @author Osvaldo
 */
public class Clase_String {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Variables
        int opcionMenu = -1;
        String mensajePrincipal = """
                                  **************************
                                  
                                  Menu principal ejercicios:
                                  1) Ejercicio 1(cantidad caracteres, comienza por a).
                                  2) Ejercicio 2(son iguales).
                                  3) Ejercicio 3(Convertir una frase a mayúsculas o minúsculas).
                                  4) Ejercicio 4(Cuenta el número de vocales).
                                  5) Ejercicio 5(eliminando los espacios en blanco).
                                  6) Ejercicio 6(devuelve invertida con efecto espejo)
                                  7) Ejercicio 7(transformando en mayúsculas la segunda cadena introducida)
                                  0) Salir.
                                  
                                  **************************
                                  """;

        //Menu
        do {
            int menuEjercicio = -1;
            System.out.println(mensajePrincipal);
            System.out.print("Elegi una opcion:  ");
            opcionMenu = teclado.nextInt();
            teclado.nextLine();
            switch (opcionMenu) {
                case 0:
                    //Caso 0 finaliza la ejecucion.
                    break;
                case 1:
                    do {
                        System.out.print("Introduzca una cadena de string:  ");
                        String cadena = teclado.nextLine();
                        int cantidad = cadena.length();
                        boolean comienza = false;

                        if (cadena.toLowerCase().startsWith("a")) {
                            comienza = true;
                        }

                        if (cantidad < 5) {
                            if (comienza) {
                                System.out.println("La cadena introducida tiene menos de 5 caracteres y comienza por a.");
                            } else {
                                System.out.println("La cadena introducida tiene menos de 5 caracteres y no comienza por a.");
                            }
                        } else if (cantidad >= 5 && cantidad <= 15) {
                            if (comienza) {
                                System.out.println("La cadena introducida tiene entre 5 y 15 caracteres y comienza por a.");
                            } else {
                                System.out.println("La cadena introducida tiene entre 5 y 15 caracteres y no comienza por a.");
                            }

                        } else if (cantidad > 15) {
                            if (comienza) {
                                System.out.println("La cadena introducida tiene mas de 15 caracteres y comienza por a.");
                            } else {
                                System.out.println("La cadena introducida tiene mas de 15 caracteres y no comienza por a.");
                            }

                        } else {
                            System.out.println("No ingreso ninguna palabra.");
                        }
                        ;
                    } while (menuEjercicio());
                    break;
                case 2:
                    do {
                        System.out.print("Ingrese la primer cadena:  ");
                        String cadena1 = teclado.nextLine();
                        System.out.print("Ingrese la segunda cadena:  ");
                        String cadena2 = teclado.nextLine();

                        if (cadena1.equalsIgnoreCase(cadena2)) {
                            System.out.println("Los caracteres son iguales.");
                        } else {
                            System.out.println("Los caracteres no son iguales.");
                        }

                    } while (menuEjercicio());
                    break;
                case 3:
                    do {

                        System.out.print("Ingrese una cadena de caracteres:  ");
                        String cadena = teclado.nextLine();
                        int opcionEjercicio3 = -1;
                        do {
                            System.out.println("""
                                           Ingrese una opcion.
                                           1) Minuscula.
                                           2) Mayuscula.
                                           """);
                            System.out.print("Ingrese una opcion:  ");
                            opcionEjercicio3 = teclado.nextInt();

                            if (opcionEjercicio3 == 1) {
                                cadena = cadena.toLowerCase();
                            } else if (opcionEjercicio3 == 2) {
                                cadena = cadena.toUpperCase();
                            } else {
                                System.out.println("###### Opcion ingresada incorrecta. ######\n");
                            }

                        } while (opcionEjercicio3 != 1 && opcionEjercicio3 != 2);
                        System.out.println("***************************************************");
                        System.out.println(cadena);
                        System.out.println("***************************************************\n");
                    } while (menuEjercicio());
                    break;
                case 4:
                    do {
                        System.out.println("Ingrese una palabra o frase: ");
                        String cadena = teclado.nextLine();
                        int cantidadVocales = cantidadVocales(cadena);
                        System.out.println("La cantidad de vocales son: " + cantidadVocales);
                    } while (menuEjercicio());
                    break;
                case 5:
                    do {
                        System.out.println("Ingrese una cadena: ");
                        String cadena = teclado.nextLine();
                        String resultado = eliminarEspacios(cadena);
                        System.out.println(resultado);
                    } while (menuEjercicio());
                    break;
                case 6:
                    do {
                        System.out.println("Ingrese una palabra: ");
                        String palabra = teclado.nextLine();
                        String resultado = invertirCadena(palabra);
                        System.out.println(resultado);
                    } while (menuEjercicio());
                    break;
                case 7:
                    do {
                        System.out.println("Ingrese una oracion:  ");
                        String oracion = teclado.nextLine();
                        String palabra;
                        boolean flag = false;
                        do{
                        System.out.println("Ingrese una palabra de la oracion:  ");
                        palabra = teclado.nextLine();
                        if(oracion.toLowerCase().contains(palabra.toLowerCase())){
                            flag = true;
                        }else{
                            System.out.println("La oracion no contiene la palabra. ");
                        }
                            
                        }while(!flag);
                        
                        String resultado = mayusculaPalabra(oracion, palabra);
                        System.out.println(resultado);

                    } while (menuEjercicio());
                    break;
                default:
                    //Opciones incorrectas
                    System.out.println("####### la opcion ingresada no es correcta. ######\n");
                    break;
            }

        } while (opcionMenu != 0);

        teclado.close();
        //Fin main
    }

    public static boolean menuEjercicio() {
        String mensajeEjercicio = "Ingresa 0 para salir cualquier otro numero para repetir:   ";
        System.out.print(mensajeEjercicio);
        int opc = teclado.nextInt();
        teclado.nextLine();
        if (opc == 0) {
            return false;
        }

        return true;

    }

    public static int cantidadVocales(String cadena) {
        int contador = 0;
        String[] cadenaDividida = cadena.split("");
        for (int i = 0; i < cadenaDividida.length; i++) {
            switch (cadenaDividida[i].toLowerCase()) {
                case "a":
                    contador++;
                    break;
                case "e":
                    contador++;
                    break;
                case "i":
                    contador++;
                    break;
                case "o":
                    contador++;
                    break;
                case "u":
                    contador++;
                    break;
                default:
                    break;
            }
        }
        return contador;
    }

    public static String eliminarEspacios(String cadena) {
        int contador = 0;
        int indice = 0;
        String[] cadDiv = cadena.split("");
        for (int i = 0; i < cadDiv.length; i++) {
            if (!cadDiv[i].isBlank()) {
                contador++;
            }
        }
        String[] nuevaCad = new String[contador];
        for (int i = 0; i < cadDiv.length; i++) {
            if (!cadDiv[i].isBlank()) {
                nuevaCad[indice] = cadDiv[i];
                indice++;
            }
        }
        String nuevaCadString = String.join("", nuevaCad);
        return nuevaCadString;
    }

    public static String invertirCadena(String cadena) {
        String[] palabraDiv = cadena.split("");
        int tamano = (palabraDiv.length * 2) - 1;
        String[] nuevaPalabra = new String[tamano];
        int indice = 0;
        for (int i = 0; i < palabraDiv.length; i++) {
            nuevaPalabra[i] = palabraDiv[i];
            if (i == (palabraDiv.length) - 1) {
                indice = i;
            }
        }
        int indices = 0;
        for (int i = nuevaPalabra.length - 1; i > indice; i--) {
            nuevaPalabra[i] = palabraDiv[indices];
            indices++;
        }
        String palabra = String.join("", nuevaPalabra);
        return palabra;
    }

    public static String mayusculaPalabra(String oracion, String palabra) {
        String[] palabrasDiv = oracion.split(" ");
        for (int i = 0; i < palabrasDiv.length; i++) {
            if (palabrasDiv[i].equalsIgnoreCase(palabra)) {
                palabrasDiv[i] = palabrasDiv[i].toUpperCase();
                break;
            }
        }
     
        String nuevaOracion = String.join(" ", palabrasDiv);
        return nuevaOracion;
    }

    //Fin class
}
