package Interfaces;

@FunctionalInterface
public interface Printable {

    /*Si se agrega otro metodo esta intreface deja de ser funcional y
    * tambi+en dejaria de poder utilizarse expresiones lambdas ya que el compilador no sabria a cual metodo
    * proporcionar la implementacion que se envía en el lamda*/
    public void print();

}
