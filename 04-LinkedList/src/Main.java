import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        ArrayList<String> colores = new ArrayList<String>();
//        colores.add("Rojo");
//        colores.add("Azul");
//        colores.add("Amarillo");
//        colores.add("Naranja");
//
//        System.out.println("Colores" + colores);

        LinkedList<String> linkedList = new LinkedList<String>();

        // las linkedList tienen comportamiento de pilas (LIFO)
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//
//        String removed =  linkedList.removeFirst(); // remueve a F ya que se comporta como pila
//        linkedList.pop();// elimina a F

        // Las linkedList también pueden ser tratadas como Queue (FIFO)
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

//        linkedList.poll();

//        En los lugares donde las listas enlazadas tienden a tener ventajas sobre las listas y las listas de arreglos es
//        en la inserción y eliminación de nodos
        linkedList.add(4,"E");
        linkedList.remove("E");

        /// Dado que LinkedList no está optimizada para el acceso por índice,
        // sino para el recorrido secuencial, la forma correcta de recorrerla
        // es mediante un for-each (Iterator).

        for (String linked: linkedList){
            System.out.println(linked);
        }
    }
}