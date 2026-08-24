import Clases.Operations;
import Interfaces.Calculator;

public class Main{
    public static void main(String args []){


        /* Un method reference es una forma más corta de implementar una interfaz funcional
        *  mediante una lambda, es decir en vez de escribir una expresión lambda lo que hacemos es
        *  escribir un method reference para esto se debe considerar lo siguiente
        *
        *  1. La implementación del metodo abstracto solo debe tener una línea de instrucciones
        *  2. Dentro de la línea de instrucciones debe existir la llamada a otro metodo*/

        Calculator c1 = (a,b) -> a+b; // No cumple las condiciones para remplazar por un method reference

        Calculator c2 = (a,b) -> { // Si cumple las condiciones par remplazar por un method reference, llamada a otro metodo y una línea de instrucciones
            return Operations.sumar(a,b);
        };

        Calculator c4 = (a, b) -> Operations.sumar(a,b);

        Calculator c3 = Operations::sumar; // Uso del method reference

        System.out.println(c2.calculate(20,30));


        /* Existen 4 tipos de referencias de metodos
        *  1. Referencia de metodo estático, (El que acabamos de ver anteriormente ya que es un metodo estático de una clase)
        *  2. Referencia de metodo de instancia de un objeto en particular
        *  3. Referencia de metodo de instancia de un objeto arbitrario
        *  4. Referencia de metodo constructor*/
    }
}

