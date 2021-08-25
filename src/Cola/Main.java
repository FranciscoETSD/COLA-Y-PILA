package Cola;

public class Main {
        public static void main(String[] args){
            Cola cola = new Cola();


            System.out.println(cola.estaVacia());
            System.out.println();

            //Rellenamos de elementos nuestra cola
            for (int i = 2; i <=20 ; i+=2) {
                cola.insertar(i);
            }

            System.out.print("Numeros Par: ");
            cola.mostrar();

            System.out.println();
            System.out.print("Eliminando los 5 primeros numeros par: ");
            cola.eliminar();
            cola.eliminar();
            cola.eliminar();
            cola.eliminar();
            cola.eliminar();
            cola.mostrar();
        }
    }

