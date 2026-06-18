import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persona p1= new Persona("pedro","perez","gomez");
        Persona p2= new Persona("angel","alvarez","zamora");
        Persona p3= new Persona("ana","perez","jimenez");
        Persona p4= new Persona("ana","sainz","jimenez");
        Persona p5= new Persona("maria","alvarez","alvarez");

        List<Persona> personas= Arrays.asList(p1,p2,p3,p4,p5);
//        personas.sort((pa,pb) -> pa.getNombre().compareTo(pb.getNombre()));
//        personas.forEach(System.out::println);
//        System.out.println("\n");
//        personas.sort((pa,pb)->pa.getApellido1().compareTo(pb.getApellido1()));
//        personas.forEach(System.out::println);

        /* De esta manera se puede conseguir el mismo resultado pero sin necesidad de construir clases
        *  adicionales, además de eso las expresiones lamdas nos permiten la combinacion de comparadores
        *  ejemplo si deseamos ordenar la listas primero por apellido1 y luego por apellido 2*/

        Comparator<Persona> comparadorA = (pa, pb) -> pa.getApellido1().compareTo(pb.getApellido1());
        Comparator<Persona> comparadorB=comparadorA.thenComparing((pa,pb)->pa.getApellido2().compareTo(pb.getApellido2()));
        personas.sort(comparadorB);

        personas.forEach(System.out::println);
    }
}