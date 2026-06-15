package collection;

import iterator.Iterator;
import iterator.ArbolInorderIterator;
import model.Trabajador;

public class ArbolTrabajadores implements Agregado {

    // Subclase Nodo
    public static class Nodo {
        public Trabajador trabajador;
        public Nodo izquierdo;
        public Nodo derecho;

        public Nodo(Trabajador trabajador) {
            this.trabajador = trabajador;
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    private Nodo raiz;

    public ArbolTrabajadores() {
        this.raiz = null;
    }

    public void insertar(Trabajador trabajador) {
        raiz = insertarRec(raiz, trabajador);
    }

    private Nodo insertarRec(Nodo raiz, Trabajador trabajador) {
        if (raiz == null) {
            return new Nodo(trabajador);
        }
        if (trabajador.getId() < raiz.trabajador.getId()) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, trabajador);
        } else if (trabajador.getId() > raiz.trabajador.getId()) {
            raiz.derecho = insertarRec(raiz.derecho, trabajador);
        }
        return raiz;
    }

    @Override
    public Iterator createIterator() {
        return new ArbolInorderIterator(raiz);
    }
}