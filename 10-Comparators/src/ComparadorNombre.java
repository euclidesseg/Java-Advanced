import java.util.Comparator;


/* Implementamos la interfaz Comparator indicandoq ue trabajara con objetos de tipo persona*/
public class ComparadorNombre implements Comparator<Persona> {

    /*Sobreescribimos el metodo obligatorio de la interfaz*/
    @Override
    public int compare(Persona p1, Persona p2) {

        /* * El méto-do compare debe devolver un número entero (int):
         * - Negativo ( < 0): Si p1 va ANTES que p2.
         * - Cero ( == 0): Si p1 y p2 son IGUALES en orden.
         * - Positivo ( > 0): Si p1 va DESPUÉS que p2.
         *
         * p1.getNombre().compareTo(...) aprovecha que la clase String ya sabe cómo
         * compararse alfabéticamente (de la A a la Z).
         */
        return p1.getNombre().compareTo(p2.getNombre());
    }
}
