import Clases.Cat;
import Interfaces.Printable;

public class  Main{
    public static  void main(String[] args){

        Cat myCat = new Cat();
        printThing(myCat);

        /* Con una lambda en lugar de pasar un objeto (miCat) que contenga una implementación específica
         * del metodo de impresión ( print() ), simplemente pasamos esa implementación específica
         */


        /* Cuando usamos lambda para pasar una implementacion de metodo como parametro omitimos algunas cosas:
         * 1. El nivel de acceso público
         * 2. El nombre del metodo
         * 2. El tipo de retorno
         * También debemos agregar luego del constructor el operador de flecha
         */
        printThing(() -> {
            System.out.println("Con lambda, Miau");
            System.out.println(425/2);
        });


        /* Podemos también guardar toda la implementación del metodo print en una variable */
        Printable  lambdaPrintable = () -> System.out.println("Miau");
        printThing(lambdaPrintable);
    }


    /* Aunque printThing exije un objeto Printable ejempo un Cat, que contiene una implementación del
    *  metodo print() podemos enviarle también simplemente la implementacion del metodo print de la interface mediante un lamda
    *  Ahora, el compilador de java sabe que () -> System.out.println("Miau") es una implementacion de print() porque observa
    *  la firma de dicho metodo Printable*/

    static void printThing(Printable thing){
        thing.print();
    }

    /* Al ejecutar thing.print(), se ejecuta la implementación de print() (() -> System.out.println("Miau")) que recibió
     * printThing(), ya sea la de un objeto como Cat o la proporcionada por una lambda.
     */
}

