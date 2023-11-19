/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligadasimple;

/**
 *
 * @author Estudiante
 */
public class ListaLigada {

    private Nodo head;
    private Nodo tail;
    private int length;

    public ListaLigada() {
        // Constructor de listaLigada
        head = null;
        tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        // true si la lista esta vacia
        return this.length == 0;
    }

    public void addLast(int valor) {
        Nodo nodo = new Nodo(valor);
        if (isEmpty()) {
            // La lista esta vacia
            // Se crea en primer ndi de la lista
            this.head = nodo;
            this.tail = nodo;
            this.length++;
        } else {
            // La lista ya tiene nodos,
            // el nodo se agrega al final de la lista
            Nodo auxiliar = tail;
            this.tail = nodo;
            auxiliar.setApuntador(nodo);
            this.length++;
        }
    }

    public void addFirst(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (this.head == null) {
            this.head = nuevoNodo;
            this.tail = nuevoNodo;
        } else {
            nuevoNodo.setApuntador(this.head);
            this.head = nuevoNodo;
        }
        this.length++;
    }

    public void addAtIndex(int index, int valor) {
        if (index < 0 || index > this.length) {
            System.out.println("Índice fuera de rango");
            return;
        }

        Nodo nuevoNodo = new Nodo(valor);
        if (index == 0) {
            nuevoNodo.setApuntador(this.head);
            this.head = nuevoNodo;
            if (this.tail == null) {
                this.tail = nuevoNodo;
            }
        } else {
            Nodo actual = this.head;
            for (int i = 0; i < index - 1; i++) {
                actual = actual.getApuntador();
            }
            nuevoNodo.setApuntador(actual.getApuntador());
            actual.setApuntador(nuevoNodo);
            if (nuevoNodo.getApuntador() == null) {
                this.tail = nuevoNodo;
            }
        }
        this.length++;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("La lista está vacía, no se puede eliminar.");
        } else {
            Nodo temp = this.head;
            this.head = this.head.getApuntador();
            temp.setApuntador(null);
            this.length--;

            if (isEmpty()) {
                this.tail = null;
            }
        }
    }

    public void deleteAtPosition(int position) {
        if (isEmpty() || position < 0 || position >= this.length) {
            return;
        }

        if (position == 0) {
            this.head = this.head.getApuntador();
            this.length--;

            if (isEmpty()) {
                this.tail = null;
            }
            return;
        }

        Nodo current = this.head;
        Nodo previous = null;
        int index = 0;

        while (current != null && index != position) {
            previous = current;
            current = current.getApuntador();
            index++;
        }

        if (current != null) {
            previous.setApuntador(current.getApuntador());
            this.length--;

            if (current == this.tail) {
                this.tail = previous;
            }
        }
    }

    public void print() {
        // Recorre toda la lsita y
        // muestra su contenido en pantalla
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo auxiliar = this.head;
            while (auxiliar != null) {
                System.out.println(auxiliar.getDato());
                auxiliar = auxiliar.getApuntador();
            }
        }

    }

    public int getLength() {
        return this.length;
    }
}
