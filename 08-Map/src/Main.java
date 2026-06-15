import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {

        /* Declaracion de un Map (un HasMap) con clave "Integer" y valor "String"
        *  Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los
        *  objetos prededinidos de java como Integer, String, Double*/


        Map<Integer, String> nombreMap = new HashMap<Integer, String>();
        /* Podemos utilizar metodos como size(), isEmpty(), put(), get(), entre otros para manipular nuestra
        *  estructura de datos*/

        nombreMap.size(); // nos devuelve el tamaño del Map
        nombreMap.isEmpty(); // devuelve true si no hay elementos en el Map y false si si los hay
        nombreMap.put(1, "Euclides"); // Añade un elemento al map
        nombreMap.get(1); // Nos devuelve el valor de la clave que se pasa como argumento o null si no existe la clave
        nombreMap.clear(); // Borra todos los elementos del Map
        nombreMap.remove(1); // borra el la clave y el valor asociados a la clave que se le pasa como argumento
        nombreMap.containsKey(1); // Devuelve true si en el map hay una clave que coincide con 1
        nombreMap.containsValue("K"); // Devuelve true si en el Map hay un valor que coincide con k
        nombreMap.values(); // Devuelve una colecion con los valores del Map
        nombreMap.keySet(); // retorna todas las llaves de la colección


        /* Un elemento importante de los Maps son los Iteradores; los iteradores sirven para recorrer los Map y poder
        *  trabajar con ellos, los iteradores solo tienen tres metodos que son:
        * hasNext(): Para comprobar que siguen quedando en el iterador
        * next() para que nos de el siguiente elemento del iterador
        * y remove() que sirve para eliminar el elemento del iterador*/

        /* Existen tres implementaciones de Map que se consideran las más importantes para trabajar con estas
         estructuras

         HashMap: los elementos que se inserten a este map no tendran un orden especifico, y no aceptan claves duplicadas
         ni valores nulos

         TreeMap: Este mapa inserta devuelve sus elementos en orden natural por ejemplo si la clave son valores enteros
         los ordena de menos a mayor

         LinkedHashMap: Inserta en el map los elementos en orden en el que se van insretando, es decir que no tiene
         una ordenaciond e los elementos como tal
         */


        /***VEAMOS UN EJEMPLO DE LAS TRES CLASES ANTERIORES MENCIONADAS****/

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Jonas");
        map.put(2, "Martha");
        map.put(3, "Claudia");
        map.put(4, "Noah");
        map.put(5, "Adam");
        map.put(6, "Ulrich");

        // Ahora imprimimos el map con un iterador

        Iterator it = map.keySet().iterator();
        // 1. map.keySet() obtiene el claves del Map y las almacena en un Set (coleccion) en de la cual podemos obtener un iterador
        while (it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> " + "Valor: " + map.get(key));
        }

        System.out.println("\n");

        // Con un TreeMap
        System.out.println("Mapa instanciado con treemap \n");
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1, "Jana");
        treeMap.put(2, "Tronte");
        treeMap.put(3, "Helge");
        treeMap.put(4, "Peter");

        it = treeMap.keySet().iterator();
        while (it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + "-> " + "Valor: " + treeMap.get(key));
        }

        // Con linkedHasMap
        System.out.println("\n");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(1, "Regina");
        linkedHashMap.put(2, "Mikkel");
        linkedHashMap.put(3, "Inés");
        linkedHashMap.put(4, "Jana");
        linkedHashMap.put(5, "Agnes");

        //  Tambien podemos recorrer los maps como si fueran un ArrayList
        System.out.println("Forma alternativa para recorrer loa maps mostrando clave y valor");
        for (Map.Entry<Integer, String> personaje:linkedHashMap.entrySet()){
            // entrySet transforma el mapa en un conjunto set donde cada valor del entry ahora es un par clave valor
            Integer clave = personaje.getKey();
            String valor = personaje.getValue();
            System.out.println(clave + "-> " + valor);
        }

        // Veamos ahora un ejemplo de cómo trabajar con los maps pero en esta ocacion el valor no sera un objeto predefinido
        // de java sino que será una clase "Personaje que crearemos"

        Map <String, Personaje> personajes = new TreeMap<String, Personaje>();

        Personaje Jonas = new  Personaje("Jonas", "Kahnwald", "Buscando respuestas");
        Personaje martha = new Personaje("Martha", "Nielsen", "Confundida");
        Personaje ulrich = new Personaje("Ulrich", "Nielsen", "Atrapado en el pasado");

        personajes.put("Jonas", Jonas );
        personajes.put("Martha", martha);
        personajes.put("Ulrich", ulrich);

        for (Map.Entry<String, Personaje> personaje: personajes.entrySet()){
            String clave = personaje.getKey();
            Personaje valor = personaje.getValue();
            System.out.println(valor.toString());
        }

    }
}