/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligadasimple;

/**
 *
 * @author Estudiante
 */
public class Nodo {
    private int dato;
    private Nodo apuntador;
    
    public Nodo(int valor){
        //Constructor de Nodo
        this.dato = valor;
        this.apuntador = null;
    }

    public int getDato() {
        // Regresar el dato contenido en el nodo
        return dato;
    }

    public void setDato(int dato) {
        // Modificar el dato contenido en el nodo 
        this.dato = dato;
    }

    public Nodo getApuntador() {
        // Regresa el nodo al que esta apuntando o null
        return apuntador;
    }

    public void setApuntador(Nodo otroNodo) {
        //Apunta el apuntador a otroNodo
        this.apuntador = otroNodo;
    }
    
}
