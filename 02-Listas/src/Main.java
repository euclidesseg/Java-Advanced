import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Casos comunes de usos de listas*/


        // Convertir un array en una lista

        String[] names = {"Jonas","Noah","Marta","Eva"};
        System.out.println("Array: " + Arrays.toString(names));

        List<String> arrayListNames = new ArrayList<String>();

        for (String name : names){
            arrayListNames.add(name);
        }
        System.out.println("List: " + arrayListNames);
        System.out.println("==================");

        // Convertir una Lista en un array
        List<String> daysList =  new ArrayList<String>();
        daysList.add("Lunes");
        daysList.add("Martes");
        daysList.add("Miércoles");
        daysList.add("Jueves");
        daysList.add("Viernes");
        daysList.add("Sábado");
        System.out.println("List: " +daysList);
        String[] daysArray = daysList.toArray(new String[daysList.size()]);
        System.out.println("Array: " +Arrays.toString(daysArray));

        //Obtener y actualizar elementos de una lista
        List<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");

        System.out.println("Elementos en el indice 1: "+ letters.get(1));

        letters.set(2, "D");

        for (String letter : letters){
            System.out.println(letter);
        }


        // Ordenar una lista

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(57);
        numbers.add(45);
        numbers.add(2);
        numbers.add(91);
        numbers.add(32);

        numbers.sort(Comparator.naturalOrder());
        System.out.println("\n");
        for (int number: numbers){
            System.out.println(number);
        }

    }
}