import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
    public static void main(String args[]) {
        /* Los streams incluidos en java 8 es una secuencia de elementos que adminte operaciones
        *  funcionales y declarativas haciendo uso de las expresiones lamdas y de los method references,
        *  para procesar colecciones de datos de
        *  manera eficiente y legible
        *
        *  No modifica la fuente: un stream no altera la colección original, genera nuevos resultados
        *  De un solo uso: Un stream solo se puede consumir una vez si se requiere procesar los elementos
        *  nuevamente se debe crear otro
        *
        *  Consta de tres partes
        *  Fuente: Origen de los datos ej (lista.stream)
        *  Operaciones intermedias: Filtran o transforman el stream y devuelven otro stream (se pueden encadenar)
        *  Operaciones terminales: Producen un resultado final (un valor, una lista, o un efecto secundario) y cierran
        *  el stream
        * */


        List<String> nombres = List.of("Noah", "Adam", "Marta","Jhonas");
        List<String> resultado = nombres.stream()              // fuente
            .filter(nombre -> nombre.startsWith("A"))   //  Operación intermedia
            .map(String::toUpperCase)                        //   Operacion intermedia
            .toList();                                      //    Operación  terminal

        System.out.println("Lista original:");
        nombres.forEach((nombre) -> System.out.println(nombre));
        System.out.println("\nResultado filtrado con stream");
        resultado.forEach((r) -> System.out.println(r));


        /* Otra manera de de crear un Stream es usando el metodo of de la api de los Stream*/
        Stream<Integer> numerosStram = Stream.of(2,5,152,7,8,100,500,35,62,13,25,37)
                .filter(n -> n>10)
                .filter(n -> n%2==0);

        /* Convertir el anterior stream en una lista*/
        List<Integer> listaNumeros = numerosStram.collect(Collectors.toList());
        System.out.println(listaNumeros);
    }
}