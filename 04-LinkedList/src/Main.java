import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

//         Las linkedList tienen comportamiento de pilas (LIFO) Último en entrar, primero en salir
//         Para lograrlo, insertamos y eliminamos siempre por el mismo extremo (el inicio).
//         push() agrega al inicio (addFirst)

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F"); // último en entrar
//        // si imprimimos esta lista mediante for el primero elemento que se imprimirá será F
//
//        String removed = linkedList.removeFirst();
//        System.out.println(linkedList);
//        linkedList.pop();
        //removeFirst() o pop() eliminan del inicio por lo que estamos eliminando F



        // Las linkedList también pueden ser tratadas como Queue (FIFO) Primero en entrar, primero en salir
        // Para lograrlo, insertamos al final y eliminamos del inicio.
        // offer() agrega al final (addLast)

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.poll();
        // elimina a "A"

//        En los lugares donde las listas enlazadas tienden a tener ventajas sobre las listas y las listas de arreglos es
//        en la inserción y eliminación de nodos
//        linkedList.add(4,"E");
//        linkedList.remove("E");

        /// Dado que LinkedList no está optimizada para el acceso por índice,
        // si no para el recorrido secuencial, la forma correcta de recorrerla
        // es mediante un for-each (Iterator).

        for (String linked: linkedList){
            System.out.println(linked);
        }
    }
}