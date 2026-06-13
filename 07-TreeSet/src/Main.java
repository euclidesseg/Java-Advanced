import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println("Tamaño: " + cars.size());
        System.out.println("Cars: " + cars);
//        cars.remove("Mazda");
        System.out.println("Cars: " + cars);

        if(cars.contains("Ford")){
            System.out.println("El elemento Ford hace parte de nuestra colección");
        }else {
            System.out.println("El elemento Ford no hace parte de nuestra colección");
        }
//        cars.clear();


        System.out.println("Tamaño: " + cars.size());


        for (String el : cars){
            System.out.println(el);
        }






    }
}