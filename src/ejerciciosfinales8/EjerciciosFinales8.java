package ejerciciosfinales8;

import java.util.Scanner;
import java.util.Random;

public class EjerciciosFinales8 {


    public static void mostrarMenu() {
        Scanner s = new Scanner(System.in);
        int tamaño = 20;
        Random aleatorios = new Random();

        int opcion;

        do {
            System.out.println("Menu ");
            System.out.println("1: Imprimir el Mayor Valor Array");
            System.out.println("2: Imprimir el Menor Valor Array");
            System.out.println("3: Calcular Media de todos los valores del Array");
            System.out.println("4: Mostrar todos los valores del Array");
            System.out.println("5: Mostrar Numero de veces que esta El numero ingresado en el Array");
            System.out.println("0: Salir");
            System.out.println();
            System.out.print("Escriba su Selección: ");

            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("Selecciono la opcion 1");

                    int[] arrays = new int[tamaño];

                    for (int i = 0; i < tamaño; i++) {
                        arrays[i] = aleatorios.nextInt(10);
                    }
                    System.out.println();

                    // Mostrar el contenido del array
                    System.out.println("Este es el Array ");
                    for (int i = 0; i < tamaño; i++) {
                        System.out.print(arrays[i] + " ");
                    }

                    // Mostrando el mayor valor del array
                    int mayor = arrays[0];
                    for (int i = 1; i < tamaño; i++) {
                        if (arrays[i] > mayor) {
                            mayor = arrays[i];
                        }
                    }
                    System.out.println();

                    System.out.println("\nEl mayor valor del Array es: " + mayor);
                    
                    System.out.println();
                    break;
                
                case 2:
                    System.out.println();
                    System.out.println("Selecciono la opcion 2");

                    int[] arrays2 = new int[tamaño];

                    for (int i = 0; i < tamaño; i++) {
                        arrays2[i] = aleatorios.nextInt(10);
                    }
                    System.out.println();

                    // Mostrar el contenido del array
                    System.out.println("Este es el Array ");
                    for (int i = 0; i < tamaño; i++) {
                        System.out.print(arrays2[i] + " ");
                    }

                    // Mostrando el mayor valor del array
                    int menor = arrays2[0];
                    for (int i = 1; i < tamaño; i++) {
                        if (arrays2[i] < menor) {
                            menor = arrays2[i];
                        }
                    }
                    System.out.println();

                    System.out.println("\nEl menor valor del Array es: " + menor);
                    
                    System.out.println();
                    break;
                    
                case 3:
                 
                    System.out.println();
                    System.out.println("Selecciono la opcion 3");

                    int[] arrays3 = new int[tamaño];

                    for (int i = 0; i < tamaño; i++) {
                        arrays3[i] = aleatorios.nextInt(10);
                    }
                    System.out.println();

                    // Mostrar el contenido del array
                    System.out.println("Este es el Array ");
                    for (int i = 0; i < tamaño; i++) {
                        System.out.print(arrays3[i] + " ");
                    }

                    // Mostrando el mayor valor del array
                    int suma = 0;
                    for (int i = 0; i < tamaño; i++) {
                        suma += arrays3 [i]; 
                        }
                    
                    //Para obtener la media, convertimos el int suma a double y lo dividimos entre el tamaño.
                    double media = (double) suma / tamaño;
                    
         
                    System.out.println();

                    System.out.println("\nLa media del Array es: " + media);
                    
                    System.out.println();
                    break;
                    
                case 4:
                    System.out.println();
                    System.out.println("Selecciono la opcion 4");

                    int[] arrays4 = new int[tamaño];

                    for (int i = 0; i < tamaño; i++) {
                        arrays4[i] = aleatorios.nextInt(10);
                    }
                    System.out.println();

                    // Mostrar el contenido del array
                    System.out.println("\nEstos son todos los valores del Array ");
                    for (int i = 0; i < tamaño; i++) {
                        System.out.print(arrays4[i] + " ");
                   
                    }
                    System.out.println();
                    break;
                    
                case 5:
                    System.out.println();
                    System.out.println("Selecciono la opcion 5");
                    
                    int numeroIngresado;
                    int vecesRepetido=0;
                    boolean numeroEncontrado=false;
                    
                    System.out.println("Ingrese un numero del 0 al 10: ");
                    numeroIngresado = s.nextInt();
                    System.out.println();

                    int[] arrays5 = new int[tamaño];

                    for (int i = 0; i < tamaño; i++) {
                        arrays5[i] = aleatorios.nextInt(10);
                    }
                    System.out.println();

                    // Mostrar el contenido del array
                    System.out.println("Este es el Array ");
                    for (int i = 0; i < tamaño; i++) {
                        System.out.print(arrays5[i] + " ");
                    }
                    System.out.println();
                    
                    for (int i=0; i< tamaño; i++) {
                        if (arrays5[i] == numeroIngresado) {
                            vecesRepetido ++;
                            numeroEncontrado = true;
                        } 
                        
                    }
                    
                    if (numeroEncontrado) {
                        System.out.println("\nEl número " + numeroIngresado + " aparece " + vecesRepetido + " veces en el Array. ");
                    } else {
                        System.out.println("El número Seleccionado no se encuentra en el Array. ");
                    }
                    
                    System.out.println("");
                    break;

                case 0:
                    System.out.println();
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println();
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                    System.out.println();
                    break;
            }
        } while (opcion != 0);

       
    }
    

    public static void main(String[] args) {

        mostrarMenu();

    }

}
