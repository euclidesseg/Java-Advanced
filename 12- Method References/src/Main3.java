import Interfaces.StringOperations;
import org.w3c.dom.ls.LSOutput;

public class Main3 {
    public static void main(String args[]) {
        /* Metodo de referencia de un objeto arbitrario
        *  Se utiliza cuando llamamos a un metodo de instancia en un objeto que se pasa como argumento
        *  ClassName::instanceMethodName*/


        StringOperations so = (str) -> {
            return str.length();
        } ;

        /* Como po demos ver str.length() es un objeto que see pas como argumento a la instancia del metodo*/

        StringOperations so2 = String::length;
        System.out.println(so2.operate("Euclides"));
    }
}
