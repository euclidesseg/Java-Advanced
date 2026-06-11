import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();

        // add(), contains(), remove()

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        // Comprobar si un elemento existe

//        System.out.println("Existe Volvo? " + cars.contains("Volvo"));
//
//        cars.remove("Mazda");
//        System.out.println("Cars: " + cars );
//
//        System.out.println("Tamaño:  "+cars.size());
//
//        cars.clear();
//
//        System.out.println("Tamaño luego del método clear():  "+cars.size());

        for (String car : cars){
            System.out.println(car);
        }

        var car = new HashSet<String>();

        // Caracteristicas
        //1 No admiten elementos duplicados
        //2 Se recorre con un foreach
        //3 Se pueden declarar con la palabra reservada var
    }
}