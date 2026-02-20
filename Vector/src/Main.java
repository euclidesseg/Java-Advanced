import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String [] array = new String[5]; // forma tradicional como muchos hemos aprendido arreglos en java
        array[0] = "Jonas";
        // problema su taño es estático





        Vector<Integer> vector = new Vector(6);
        System.out.println("Tamaño de los elementos de este vector: " + vector.size());

        // Agregando elementos el final del vector
        vector.add(5);
        vector.add(8);
        vector.add(10);
        System.out.println(vector);

        // agregando mas elementos al vector
        vector.add(15);
        vector.add(10);

        System.out.println("EL nuevo tamaño de los elementos es: " + vector.size());
        System.out.println("El elemento en la primera posicion es: "+ vector.firstElement());

        // buscando la primera aparicion del elemento 10
        System.out.println("Index del elemento 10: " + vector.indexOf(10));
        // Verificando la existencia de un elemento
        System.out.println("El vector contiene el elemento 15?: " + vector.contains(15));
        // Verificando la capacidad del vector
        System.out.println("Capacidad del vector: "+ vector.capacity());

        // eliminado todos los elementos
        vector.clear();

        System.out.println(vector);

    }
}