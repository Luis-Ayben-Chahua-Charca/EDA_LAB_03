
public class Stack<T> {
    private Nodo<T> cabeza;
    
    public Stack() {
        this.cabeza = null;
    }
    
    public void push(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }
    
    public T pop() {
        if (isEmpty()) {
            System.out.println("el stack esta vacio");
        }
        
        T dato = cabeza.getDato();
        cabeza = cabeza.getSiguiente();
        return dato;
    }
    
    public T peek() {
        if (isEmpty()) {
            System.out.println("el stack esta vacio");
        }
        
        return cabeza.getDato();
    }
    
    public boolean isEmpty() {
        return cabeza == null;
    }
}