import Interfaces.Printable2;
import Interfaces.Printable3;

public class Main2 {
    public static void main(String args []) {

        /* Ahora veamos una forma de escribir un lambda cuando el único metodo de la interfaz funcional
        *  recibe un parametro
        * */


        /* Cuando el metodo abstracto de la inteface funcional recibe un parametro simplemente se indica el nombre
        *  que queremos usar para enviarlo sin especificar el tipo, el compilador lo infiere
        *
        * Además, si solo es un parametro podemos eliminar los paréntesis
        *
        * Aquí además la implementación que estoy proporcionando, recibe un parametro string que luego uso*/
        printThing( (String s, String p) -> System.out.println("Con argumentos en el método, " +  "Argumentos: " +  s +", "+ p));





        /*Cuando el metodo print de la interfaz funcional recibe un parametro y retorna un dato*/
        //Printable3 lambdaReturnPrintable = (s) -> { System.out.println("Lambda con retorno y argumento"); return s;};
        Printable3 lambdaReturnPrintable = (s) -> "Lambda con retorno y argumento " + s;
        printThing3(lambdaReturnPrintable);
    }



    static void printThing(Printable2 thing){
        thing.print("Sufijo de cadena", "Prefijo de cadena");
    }


    /*Metodo para recibir una implementación con retorno de la interfaz Printable3*/
    static void printThing3(Printable3 thing){
        thing.print("Retornar");
        System.out.println(thing.print("retornar"));
    }
}
