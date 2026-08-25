import java.util.Optional;

public class Main {
    public static void main(String[] args){


        /* Los metodos opcionales incluidos en java 8 solventan la problematica
        *  de cuando un metodo que debería retornar un datos especifico de un tipo de clase
        *  devuelve un null o un valor no definido
        *  el optional biene siendo como una caja que o bien puede contener un dato o bien no
        * */
       Optional<Cat> optionalCat =  finbyName("Tom");

       // orElse devuelve el objeto que retorna mi optional o el valor predeterminado que se le ha enviado
       Cat mycat = optionalCat.orElse(new Cat("UNKNOWN", 0));

        // .map toma nuestro optionalCat y lo transforma en un opcional de otro tipo
        // en este caso devolvera un optional que contiene la edad que esta en el optionalCat si estaba vacion este opcional tambien
        // sera vacio
       optionalCat.map((c) -> c.getAge()).orElse(0); // lambdaEmpresions
       optionalCat.map(Cat::getAge).orElse(0); // method reference

       //Cat myCat2 =

    }



    public static Optional<Cat> finbyName(String name){
        Cat cat = new Cat(name,3);
        return Optional.ofNullable(cat); // se usa cuando no se save si lo que devolverá tendrá o no un valor
        //return Optional.empty();  devuelve automaticamente un optional vacio
    }
}


class Cat{
    public String name;
    private int age;
    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

}