import java.util.Stack;

class PilasIguales {
    public static void main(String[] args) {
        
        Stack<Integer> h1 = new Stack<>();
        Stack<Integer> h2 = new Stack<>();
        Stack<Integer> h3 = new Stack<>();

        h1.push(1);
        h1.push(1);
        h1.push(1);
        h1.push(2);
        h1.push(3);

        h2.push(2);
        h2.push(3);
        h2.push(4);

        h3.push(1);
        h3.push(4);
        h3.push(1);
        h3.push(1);

        int altura = equalStacks(h1, h2, h3);
        System.out.println("h1: " + h1);
        System.out.println("h2: " + h2);
        System.out.println("h3: " + h3);
        System.out.println("la altura es: " + altura);

    }

    public static int equalStacks (Stack<Integer> a, Stack<Integer> b, Stack<Integer> c){
        
        int altura1;
        int altura2;
        int altura3;
        while (true){

            altura1 = sumarValores(a);
			altura2 = sumarValores(b);
			altura3 = sumarValores(c);

			//si alguno esta vacio devuelve cero

            if (a.isEmpty() || b.isEmpty() || c.isEmpty()){
				return 0;
            }

            // si estan iguales devuelve la altura
			if (altura1 == altura2 && altura2 == altura3)
				return altura1;

			/* si no solo iguales, se busca el mas alto y se elimina el valor de encima y 
             * repite hasta que se haya quitado los mayores e igualado
             */
			if (altura1 >= altura2 && altura1 >= altura3)
				a.pop();
			else if (altura2 >= altura1 && altura2 >= altura3)
				b.pop();
			else if (altura3 >= altura2 && altura3 >= altura1)
				c.pop();
        }

    }

    public static int sumarValores(Stack<Integer> pila) {
        int suma = 0;
        Stack<Integer> pilaAuxiliar = new Stack<>();
        
        while (!pila.isEmpty()) {
            int valor = pila.pop();
            suma += valor;
            pilaAuxiliar.push(valor);
        }
        
        while (!pilaAuxiliar.isEmpty()) {
            pila.push(pilaAuxiliar.pop());
        }
        
        return suma;
    }
    


}