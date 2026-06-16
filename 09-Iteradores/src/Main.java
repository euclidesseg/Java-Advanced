import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    /* Una de las situaciones más abituales para manejar iteradores es recorrer una lista de elementos
    *  en java se puede recorrer o usando un iterador o usando un bucle forEach
    * */

        Collection<String> lista = new ArrayList<String>();
        lista.add("Noah");
        lista.add("Ulrich");
        lista.add("Martha");
        lista.add("Jonas");
        lista.add("Noah");

        /* Un iterador dispone de dos métodos principales para recorrer una lista
        *  hasNext() y next() además de este posee un tercer metodo remove() para eliminar un elemento
        *  mientras se recorre toda la lista */

        Iterator it = lista.iterator();

        // hasNext() comprueba si hay un elemento siguiente en la coleccion next() avanza por la coleccion
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // Un bucle forEach reemplaza en gran medida a los iteradores por lo que en la actualidad los desarrolladores
        // preferimos no usar este último pero es bastante util en casos de borrado de elementos

//        for (String nombre : lista){
//            if (nombre.equals("Noah")){
//                lista.remove("Noah");
//            }
//        }

        Iterator it2 = lista.iterator();

        while (it2.hasNext()){
            String nombre = (String) it2.next();
            if (nombre.equals("Noah")){
                it2.remove();
            }
        }

        System.out.println(lista);
    }
}