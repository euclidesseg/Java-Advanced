import Clases.User;
import Interfaces.Creator;
import Interfaces.StringOperations;

public class Main4{
    public static void main(String args[]) {
        /* Referencia de metodo constructor
         *  Se utiliza cuando llamamos a un constructor para crear un nuevo objeto
         *  ClassName::new
         * */


        Creator<User> c1 = (user) -> { return new User(user);};

        c1.create("Eucldies");


        Creator<User> c2 = User::new;
        User u2 = c2.create("Euclides");

        System.out.println(u2.name);

    }
}
