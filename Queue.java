public class Queue<T> {
    private Nodo<T> front;
    private Nodo<T> rear;
    
    public Queue() {
        this.front = null;
        this.rear = null;
    }
    
    public void add(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        
        if (isEmpty()) {
            front = nuevoNodo;
            rear = nuevoNodo;
        } else {
            rear.setSiguiente(nuevoNodo);
            rear = nuevoNodo;
        }
    }
    
    public T poll() {
        if (isEmpty()) {
            System.out.println("la cola esta vacia");
        }
        
        T dato = front.getDato();
        front = front.getSiguiente();
        
        if (front == null) {
            rear = null;
        }
        
        return dato;
    }
    
    public T peek() {
        if (isEmpty()) {
            System.out.println("la cola esta vacia");
        }
        
        return front.getDato();
    }
    
    public boolean isEmpty() {
        return front == null;
    }
}