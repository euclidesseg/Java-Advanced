import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String [] args){

        Persona p1= new Persona("pedro","perez","gomez");
        Persona p2= new Persona("angel","alvarez","zamora");
        Persona p3= new Persona("ana","perez","jimenez");
        Persona p4= new Persona("ana","sainz","jimenez");
        Persona p5= new Persona("maria","alvarez","alvarez");

        // Creamos la lista
        List<Persona> lista = Arrays.asList(p1,p2,p2,p3,p4,p5); // asList agrupar cómo lista

        /* Para ordenar esta lista requrimos implementar un java comparator, que decida de que manera
           se va a comparar cada elemento en este caso requerimos comparar por nombre por lo que creamos una
           clase ComparadrorNombre*/

        //Utilizamos el comparador de nombre para ordenar la lista e imprimirla

        lista.sort(new ComparadorNombre());
        lista.forEach(System.out::println);
        // La lista se imprime ordenada

        /* Hasta aquí To-do funciona bien, ahora, si queremos ordenar por apellido y posteriormente por
        *  otro campo debemos crearnos otras dos clases comparadoras lo cual seria un problema,
        *  ya que existen muchos tipos de comparaciones java 8 ayuda con este problema utilizando epresiones lambdas*/
    }
}
