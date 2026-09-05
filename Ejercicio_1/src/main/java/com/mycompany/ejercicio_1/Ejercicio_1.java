package com.mycompany.ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        int op;
        int option;
        String message_end = "Ingrese 0 para volver al menu anterior o 1 continuar:   ";
        Scanner teclado = new Scanner(System.in);
        do {

            String main_menu = """
                           ************************
                           
                           Seleccione una opcion:
                           
                           1) Par o impar
                           2) Fibonacci
                           3) Potencia
                           4) Numero Primo
                           5) Verificar si un número es suma de los otros dos
                           6) Calcular velocidad
                           0) Salir
                               
                           *************************
                           """;

            System.out.print(main_menu + "\n Opcion: ");
            option = teclado.nextInt();

            switch (option) {

                case 0:
                    break;
                case 1:
                    do {
                        System.out.print("Ingrese un numero:  ");
                        int numero = teclado.nextInt();

                        if (numero % 2 == 0) {
                            System.out.println("Es par");
                        } else {
                            System.out.println("Es impar");
                        }
                        System.out.print(message_end);
                        op = teclado.nextInt();

                    } while (op != 0);
                    break;
                case 2:
                    do {
                        System.out.print("Ingrese la posicion de Fibonacci que desea:  ");
                        int num = teclado.nextInt();

                        if (num == 1) {
                            System.out.println("\n El resultado es: " + 0);
                        } else if (num == 2) {
                            System.out.println("\n El resultado es: " + 1);
                        } else if (num <= 0) {
                            System.out.println("\n Ingrese un numero mayor a 0");
                        } else {

                            int num1 = 0;
                            int num2 = 1;
                            int resultado = 0;

                            for (int i = 0; i < num - 2; i++) {
                                resultado = num1 + num2;
                                num1 = num2;
                                num2 = resultado;
                            }
                            System.out.println("\n El resultado es: " + resultado);
                        }

                        System.out.print(message_end);
                        op = teclado.nextInt();

                    } while (op != 0);
                    break;
                case 3:
                    do {
                        System.out.print("Ingresar la base: ");
                        int base = teclado.nextInt();
                        System.out.print("\n Ingrese el exponente: ");
                        int exponente = teclado.nextInt();
                        int potencia = 1;

                        if (exponente >= 0) {
                            for (int i = 0; i < exponente; i++) {
                                potencia = potencia * base;
                            }
                            System.out.println("El resultado es: " + potencia);
                        } else {
                            System.out.print("El exponente no debe ser negativo.");
                        }
                        System.out.print(message_end);
                        op = teclado.nextInt();

                    } while (op != 0);
                    break;
                case 4:
                    do {
                        System.out.print("Ingresa un numero: ");
                        int numero = teclado.nextInt();

                        boolean esPrimo = true;

                        if (numero <= 1) {
                            esPrimo = false;
                        } else {
                            for (int i = 2; i < numero; i++) {
                                if (numero % i == 0) {
                                    esPrimo = false;
                                    break;
                                }
                            }
                        }

                        if (esPrimo) {
                            System.out.println("El numero es primo.");
                        } else {
                            System.out.println("El numero no es primo.");
                        }
                        System.out.print(message_end);
                        op = teclado.nextInt();

                    } while (op != 0);
                    break;
                case 5:
                    do {
                        System.out.print("Ingrese el primer numero: ");
                        int num_1 = teclado.nextInt();
                        System.out.print("Ingrese el segundo numero: ");
                        int num_2 = teclado.nextInt();
                        System.out.print("Ingrese el tercer numero: ");
                        int num_3 = teclado.nextInt();

                        if ((num_1 + num_2) == num_3) {
                            System.out.println("El numero 3 (" + num_3 + ") es igual a la suma de " + num_1 + " y " + num_2);
                        } else if ((num_1 + num_3) == num_2) {
                            System.out.println("El numero 2 (" + num_2 + ") es igual a la suma de " + num_1 + " y " + num_3);
                        } else if ((num_2 + num_3) == num_1) {
                            System.out.println("El numero 1 (" + num_1 + ") es igual a la suma de " + num_2 + " y " + num_3);
                        } else {
                            System.out.println("La suma de los numeros no es igual al otro numero. ");
                        }

                        System.out.print(message_end);
                        op = teclado.nextInt();

                    } while (op != 0);
                    break;
                case 6:
                    do {
                        double metros = 1500.0;
                        int flag = 0;
                        int seg = -1;

                        System.out.print("Ingrese los minutos: ");
                        int min = teclado.nextInt();

                        while (flag == 0) {
                            System.out.print("Ingrese los segundos 1 a 59: ");
                            seg = teclado.nextInt();
                            if (seg > 0 && seg < 60) {
                                flag = 1;
                            }
                        }

                        double velocidad = (metros / ((min * 60) + seg));

                        System.out.println(String.format("La velocidad del corredor fue: %.2f m/s", velocidad));

                        System.out.println(message_end);
                        op = teclado.nextInt();
                    } while (op != 0);
                    break;
                default:
                    System.out.print("Opcion incorrecta");
                    break;
            }

        } while (option != 0);
        teclado.close();
        // fin
    }
}
