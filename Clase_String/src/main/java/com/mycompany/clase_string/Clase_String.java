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
                                  1) Ejercicio 1(Cantidad caracteres, comienza por a).
                                  2) Ejercicio 2(Son iguales).
                                  3) Ejercicio 3(Convertir una frase a mayúsculas o minúsculas).
                                  4) Ejercicio 4(Cuenta el número de vocales).
                                  5) Ejercicio 5(Eliminando los espacios en blanco).
                                  6) Ejercicio 6(Devuelve invertida con efecto espejo)
                                  7) Ejercicio 7(Transformando en mayúsculas la segunda cadena introducida)
                                  8) Ejercicio 8(Invertir cadena)
                                  9) Ejercicio 9(Verificar cuántas veces se repite el carácter)
                                  10) Ejercicio 10(Dividir cadena)
                                  11) Ejercicio 11(String con un carácter separador "-")
                                  12) Ejercicio 12(Imprimir la palabra con el mayor numero de caracteres)
                                  13) Ejercicio 13(Sustituir todos los espacios por asteriscos)
                                  14) Ejercicio 14(Convertir fecha)
                                  0) Salir.
                                  
                                  **************************
                                  """;

        //Menu
        do {
            int menuEjercicio = -1;
            System.out.println(mensajePrincipal);
            System.out.print("Ingrese una opcion:  ");
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
                        System.out.println("La cantidad de vocales son: " + cantidadVocales + "\n");
                    } while (menuEjercicio());
                    break;
                case 5:
                    do {
                        System.out.println("Ingrese una cadena: ");
                        String cadena = teclado.nextLine();
                        String resultado = eliminarEspacios(cadena);
                        System.out.println(resultado + "\n");
                    } while (menuEjercicio());
                    break;
                case 6:
                    do {
                        System.out.println("Ingrese una palabra: ");
                        String palabra = teclado.nextLine();
                        String resultado = cadenaEspejo(palabra);
                        System.out.println(resultado + "\n");
                    } while (menuEjercicio());
                    break;
                case 7:
                    do {
                        System.out.println("Ingrese una oracion:  ");
                        String oracion = teclado.nextLine();
                        String palabra;
                        boolean flag = false;
                        do {
                            System.out.println("Ingrese una palabra de la oracion:  ");
                            palabra = teclado.nextLine();
                            if (oracion.toLowerCase().contains(palabra.toLowerCase())) {
                                flag = true;
                            } else {
                                System.out.println("La oracion no contiene la palabra. \n");
                            }
                        } while (!flag);
                        String resultado = mayusculaPalabra(oracion, palabra);
                        System.out.println(resultado + "\n");
                    } while (menuEjercicio());
                    break;
                case 8:
                    do {
                        System.out.println("Ingresar una cadena:  ");
                        String cadena = teclado.nextLine();
                        String resultado = invertirCadena(cadena);
                        System.out.println(resultado + "\n");
                    } while (menuEjercicio());
                    break;
                case 9:
                    do {
                        boolean flag = false;
                        System.out.println("Ingrese una cadena:  ");
                        String cadena = teclado.nextLine();
                        String caracter;
                        do {
                            System.out.print("Ingrese un caracter:  ");
                            caracter = teclado.nextLine();
                            if (caracter.length() == 1) {
                                flag = true;
                            } else {
                                System.out.println("Debe ingresar un solo caracter.\n");
                            }
                        } while (!flag);
                        char charCaracter = caracter.charAt(0);
                        int resultado = contarCaracter(cadena, charCaracter);
                        System.out.printf("El carácter '%s' se repite %d veces\n", charCaracter, resultado);
                    } while (menuEjercicio());
                    break;
                case 10:
                    do {
                        System.out.println("Ingrese una cadena:  ");
                        String caracter = teclado.nextLine();
                        String resultado = dividirCaracter(caracter);

                        System.out.println("""
                                           *************
                                           Menu:
                                           1) ArrayList
                                           2) String
                                           ************
                                           """);
                        System.out.print("Ingrese una opcion:  ");
                        int opc = teclado.nextInt();

                        if (opc == 1) {
                            String[] caracterSplit = resultado.split("&y&");
                            for (int i = 0; i < caracterSplit.length; i++) {
                                System.out.println(caracterSplit[i]);
                            }
                        } else if (opc == 2) {
                            String frase1 = "";
                            String frase2 = "";
                            boolean flag = false;
                            for (int i = 0; i < resultado.length(); i++) {
                                if (resultado.charAt(i) == '&' && resultado.charAt(i + 1) == 'y' && resultado.charAt(i + 2) == '&') {
                                    flag = true;
                                    i = i + 3;
                                }
                                if (!flag) {
                                    frase1 = frase1 + resultado.charAt(i);
                                } else {
                                    frase2 = frase2 + resultado.charAt(i);
                                }
                            }
                            System.out.println(frase1);
                            System.out.println(frase2);
                        } else {
                            System.out.println("###### La opcion ingresada es incorrecta. ######");
                        }

                    } while (menuEjercicio());
                    break;
                case 11:
                    do {
                        System.out.println("Ingrese una cadena:  ");
                        String caracter = teclado.nextLine();
                        String resultado = separarCaracteresGuion(caracter);
                        System.out.println(resultado);
                    } while (menuEjercicio());
                    break;
                case 12:
                    do {
                        System.out.println("Ingrese una frase:  ");
                        String frase = teclado.nextLine();
                        String resultado = palabraMayorLongitud(frase);
                        System.out.printf("La palabra con mayor cantidad de caracteres es %s con %d.\n", resultado, resultado.length());
                    } while (menuEjercicio());
                    break;
                case 13:
                    do {
                        System.out.println("Ingrese una cadena:  ");
                        String caracter = teclado.nextLine();
                        String resultado = sustituirEspacios(caracter);
                        System.out.println(resultado);
                    } while (menuEjercicio());
                    break;
                case 14:
                    do {
                        boolean flag = false;
                        String fecha;
                        do {
                            System.out.print("Ingresar una fecha con el siguiente formato dd/mm/aaaa:  ");
                            fecha = teclado.nextLine();
                            if (verificarFecha(fecha)) {
                                flag=true;
                            }
                            else{
                                System.out.println("Formato de fecha o fecha incorrecta. ");
                            }
                        } while (!flag);
                        String resultado = formatoFecha(fecha);
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
        String mensajeEjercicio = "Ingresa 0 para salir o cualquier otro numero para repetir:   ";
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
        for (int i = 0; i < cadena.length(); i++) {
            char palabra = cadena.charAt(i);
            switch (Character.toLowerCase(palabra)) {
                case 'a':
                    contador++;
                    break;
                case 'e':
                    contador++;
                    break;
                case 'i':
                    contador++;
                    break;
                case 'o':
                    contador++;
                    break;
                case 'u':
                    contador++;
                    break;
                default:
                    break;
            }
        }
        return contador;
    }

    public static String eliminarEspacios(String cadena) {
        return String.join("", cadena.split(" "));
    }

    public static String cadenaEspejo(String cadena) {
        String nuevaCadena = cadena;
        for (int i = cadena.length() - 2; i >= 0; i--) {
            nuevaCadena = nuevaCadena + cadena.charAt(i);
        }
        return nuevaCadena;
    }

    public static String mayusculaPalabra(String oracion, String palabra) {
        return oracion.replace(palabra, palabra.toUpperCase());
    }

    public static String invertirCadena(String cadena) {
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida = invertida + cadena.charAt(i);
        }
        return invertida;
    }

    public static int contarCaracter(String cadena, char caracter) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    public static String dividirCaracter(String caracter) {
        String mitad1 = caracter.substring(0, Math.round(caracter.length() / 2));
        String mitad2 = caracter.substring(Math.round(caracter.length() / 2), caracter.length());
        return mitad1 + "&y&" + mitad2;
    }

    public static String separarCaracteresGuion(String caracter) {
        return String.join("-", caracter.split(""));
    }

    public static String palabraMayorLongitud(String frase) {
        int contador = 0;
        int indice = 0;
        boolean flag = false;
        String palabra = "";
        String palabraMax = "";
        int contadorMax = 0;
        frase = frase.trim();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                flag = true;
            }
            if (!flag) {
                palabra = palabra + frase.charAt(i);
                contador++;
            }
            if (contador > contadorMax) {
                palabraMax = palabra;
                contadorMax = contador;
            }
            if (flag) {
                palabra = "";
                contador = 0;
                flag = false;
            }
        }
        return palabraMax;
    }

    public static String sustituirEspacios(String caracter) {
        return String.join("*", caracter.split(" "));
    }

    public static String formatoFecha(String fecha) {
        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(3, 5);
        String anio = fecha.substring(6,10);
        String fechaFinal = "";
        switch (mes) {
            case "01":
                fechaFinal = String.format("%s de Enero de %s", dia, anio);
                break;
            case "02":
                fechaFinal = String.format("%s de Febrero de %s", dia, anio);
                break;
            case "03":
                fechaFinal = String.format("%s de Marzo de %s", dia, anio);
                break;
            case "04":
                fechaFinal = String.format("%s de Abril de %s", dia, anio);
                break;
            case "05":
                fechaFinal = String.format("%s de Mayo de %s", dia, anio);
                break;
            case "06":
                fechaFinal = String.format("%s de Junio de %s", dia, anio);
                break;
            case "07":
                fechaFinal = String.format("%s de Julio de %s", dia, anio);
                break;
            case "08":
                fechaFinal = String.format("%s de Agosto de %s", dia, anio);
                break;
            case "09":
                fechaFinal = String.format("%s de Septiembre de %s", dia, anio);
                break;
            case "10":
                fechaFinal = String.format("%s de Octumbre de %s", dia, anio);
                break;
            case "11":
                fechaFinal = String.format("%s de Noviembre de %s", dia, anio);
                break;
            case "12":
                fechaFinal = String.format("%s de Diciembre de %s", dia, anio);
                break;
        }
        return fechaFinal;
    }

    public static boolean verificarFecha(String fecha) {
        boolean verificar = false;
        if (fecha.length() != 10) {
            return false;
        }
        if (fecha.charAt(2) != '/' && fecha.charAt(5) != '/') {
            return false;
        }
        for (int i = 0; i < fecha.length(); i++) {
            if (fecha.charAt(i) == '/') {
                continue;
            }
            if (!Character.isDigit(fecha.charAt(i))) {
                return false;
            }
        }

        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));

        switch (mes) {
            case 1:
                verificar = dia <= 31;
                break;
            case 2:
                verificar = dia <= 29;
                break;
            case 3:
                verificar = dia <= 31;
                break;
            case 4:
                verificar = dia <= 30;
                break;
            case 5:
                verificar = dia <= 31;
                break;
            case 6:
                verificar = dia <= 30;
                break;
            case 7:
                verificar = dia <= 31;
                break;
            case 8:
                verificar = dia <= 31;
                break;
            case 9:
                verificar = dia <= 30;
                break;
            case 10:
                verificar = dia <= 31;
                break;
            case 11:
                verificar = dia <= 30;
                break;
            case 12:
                verificar = dia <= 31;
                break;
            default:
                break;
        }

        return verificar;
    }

    //Fin class
}
