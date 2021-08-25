package Cola;

public class Cola {
        protected Nodo primero;

        public Cola(){
            setPrimero(null);
        }

        public boolean estaVacia(){
            return getPrimero() == null;
        }

        public void insertar(Object dato){
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

        public void eliminar(){
            if(!estaVacia()){
                setPrimero(getPrimero().getSiguiente());
            }
        }

        public void mostrar(){
            Nodo tmp = getPrimero();
            while (tmp != null){
                System.out.print(tmp.getDato() + "   ");
                tmp = tmp.getSiguiente();
            }

        }

        public Nodo getPrimero() {
            return primero;
        }

        public void setPrimero(Nodo primero) {
            this.primero = primero;
        }
    }



