import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Casos de usos de los Arraylist
        //1. Añadir elementos

        ArrayList<String> colores = new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Naranja");

        System.out.println("Colores" + colores);
        //2. Eliminar un elemento

        String colorRemovido =  colores.remove(3);

        System.out.println("Color eliminado " + colorRemovido);
        for (String color : colores){
            System.out.println(color);
        }
        System.out.println("\n");

        //3. Actualizar elementos de un Arraylist
        ArrayList<Integer> years = new ArrayList<Integer>();
        years.add(2014);
        years.add(2021);
        years.add(2026);
        years.add(2023);
        years.add(2021);

        System.out.println("Años " + years);
        years.set(1, 2018);
        System.out.println("Años Actualizados "+ years + "\n");

        //4. Acceder a un los elementos de una lista
        System.out.println("Elemento den la posicion " +years.get(2) + "\n");

        //5. Ordenar un ArrayList
        Collections.sort(years, Comparator.reverseOrder());
        System.out.println("Elementos ordenados");
        for (int year : years){
            System.out.println(year);
        }
        System.out.println("\n");

        //6. Podemos también declarar un ArrayList del tipo de cualquier clase que creemos
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona persona1 = new Persona();
        persona1.setNombre("Noah");
        persona1.setEdad(38);
        persona1.setProfesion("Cura");

        Persona persona2 = new Persona();
        persona2.setNombre("Ulrik");
        persona2.setEdad(42);
        persona2.setProfesion("Policia");

        personas.add(persona1);
        personas.add(persona2);

        System.out.println(personas.get(1).getEdad());

        for (Persona persona: personas){
            System.out.println(persona.getNombre());
        }

    }
}