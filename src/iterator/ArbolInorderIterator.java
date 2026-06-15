package iterator;

import collection.ArbolTrabajadores.Nodo;
import java.util.Stack;

public class ArbolInorderIterator implements Iterator {
    private Stack<Nodo> pila;

    public ArbolInorderIterator(Nodo raiz) {
        pila = new Stack<>();
        empujarIzquierda(raiz);
    }

    private void empujarIzquierda(Nodo nodo) {
        while (nodo != null) {
            pila.push(nodo);
            nodo = nodo.izquierdo;
        }
    }

    @Override
    public boolean hasNext() {
        return !pila.isEmpty();
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        }

        Nodo nodoActual = pila.pop();
        if (nodoActual.derecho != null) {
            empujarIzquierda(nodoActual.derecho);
        }

        return nodoActual.trabajador;
    }
}