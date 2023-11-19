/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaligadasimple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Estudiante
 */
public class ListaLigadaSimple {

    public static ListaLigada lista;
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static void agregar() throws IOException {
        int valor;

        System.out.println("Escribe el valor a insertar:");
        entrada = bufer.readLine();
        valor = Integer.parseInt(entrada);
        lista.addLast(valor);

    }

    public static void agregarInicio() throws IOException {
        int valor;

        System.out.println("Escribe el valor a insertar al inicio:");
        entrada = bufer.readLine();
        valor = Integer.parseInt(entrada);
        lista.addFirst(valor);
    }

    public static void agregarEnPosicion() throws IOException {
        int valor;

        System.out.println("Escribe la posición donde quieres insertar:");
        entrada = bufer.readLine();
        int posicion = Integer.parseInt(entrada);

        System.out.println("Escribe el valor a insertar:");
        entrada = bufer.readLine();
        valor = Integer.parseInt(entrada);

        lista.addAtIndex(posicion, valor);
    }

    public static void eliminarInicio() {
        lista.deleteFirst();
        System.out.println("**************************************************");
        System.out.println("Se eliminó el nodo al inicio de la lista.");
    }

    public static void eliminarEnPosicion(int posicion) {
        lista.deleteAtPosition(posicion);
        System.out.println("Se eliminó el nodo en la posición " + posicion + " de la lista.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int opcion;
        lista = new ListaLigada();
        System.out.println("Programa que manipula la lista ligada");
        do {
            System.out.println("1. Agregar dato al final");
            System.out.println("2. Imprimir la lista");
            System.out.println("3. Insertar al inicio");
            System.out.println("4. Insertar en una posicion");
            System.out.println("5. Eliminar  al inicio");
            System.out.println("6. Eliminar en una posicion");
            System.out.println("7. Tamano de la lista");
            System.out.println("8. Salir");
            System.out.println("Escriba su opcion");
            entrada = bufer.readLine();

            opcion = Integer.parseInt(entrada);
            switch (opcion) {
                case 1:
                    agregar();
                    break;
                case 2: {
                    System.out.println("-----------------------------");
                    System.out.println("Contenido de la lista");
                    lista.print();
                    System.out.println("-------------------------------");
                }

                case 3:
                    agregarInicio();
                    break;

                case 4:
                    agregarEnPosicion();
                    break;

                case 5:
                    eliminarInicio();
                    break;

                case 6:
                    System.out.println("Ingresa la posición a eliminar:");
                    entrada = bufer.readLine();
                    int posicionEliminar = Integer.parseInt(entrada);
                    eliminarEnPosicion(posicionEliminar);
                    break;

                case 7:
                    System.out.println("******************************************");
                    System.out.println("Tamaño de la lista: " + lista.getLength());
                    System.out.println("**************************************");
                    break;

                case 8:
                    System.out.println("Terminando el programa");
                    System.out.println("Adios");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 8);

    }

}
