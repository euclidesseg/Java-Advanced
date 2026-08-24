import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String args[]){
        /* Las expresiones lambda y la API Stream en Java permiten procesar colecciones
         * de datos de forma más concisa, legible y con un enfoque funcional
         *
         * Una expresión lambda es una expresión anónima que sirve para implementar
         * un único metodo abstracto de una interfaz funcional*/

        List<String> nombres = new ArrayList<String>(List.of("Noah","Adam","Alice","Jonas","Ulrich","Martha"));


        // Antes de java 8 para recorrer esta lista haciamos esto.

        System.out.println("Antes de java 8");
        for (String nombre: nombres){
            System.out.println(nombre);
        }

        // Apartir de java 8 con las expresiones lambndas y method references hacemos lo siguiente

        System.out.println("\nCon expresiones lambdas");
        nombres.forEach(nombre -> System.out.println(nombre));

       List<String> nombresA =  nombres.stream().filter(nombre -> nombre.contains("A")).toList();

       nombresA.forEach(System.out::println);
    }
}