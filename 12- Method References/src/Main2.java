import Clases.Operations;
import Interfaces.Validator;

public class Main2{

    /* Referencia de metodo de instancia de un objeto en particular
    *  Esta referencia se usa cuando llamamos a un metodo de instancia de alguna clase usando su objeto
    *  es decir, cuando llamamos a un metodo a traves del objeto de alguna clase.
    *  objetName::instanceMethosName*/

    public static void main(String args[]) {

        Operations op = new Operations();


        //Validator v1 = (num) -> op.isPositive(num);

        // Si vemos nos hemos ahorrado el constructor () del metodo y el operador de flecha
        Validator v1 = op::isPositive;

        System.out.println(v1.validate(2));
    }
}