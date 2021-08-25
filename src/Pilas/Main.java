package Pilas;

import Cola.Cola;

public class Main {
    public static void main(String[] args) {
         Cola cola  = new Cola();
        System.out.println(cola.estaVacia());
        Cola Cola = new Cola();
        System.out.println(Cola.estaVacia());

        for (int i = 0; i <=20 ; i++) {
            Cola.insertar(i);
        }
        Cola.mostrar();

        Cola.eliminar();
        Cola.eliminar();
        Cola.mostrar();
    }

}