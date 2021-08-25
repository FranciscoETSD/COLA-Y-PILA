package Pilas;

import Cola.Cola;
import Cola.Nodo;

public class Pilas extends Cola {

    @Override
    public void insertar(Object dato) {
            if(estaVacia()){
                Nodo nuevo = new Nodo(dato, null);
                setPrimero(nuevo);
            }else{
                Nodo ultimo = getPrimero();
                while(ultimo.getSiguiente() != null){
                    ultimo = ultimo.getSiguiente();
                }

                Nodo nuevo = new Nodo(dato,null);
                ultimo.setSiguiente(nuevo);
            }
        }
    }

