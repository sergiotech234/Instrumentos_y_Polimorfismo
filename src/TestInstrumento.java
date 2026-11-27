
import java.util.ArrayList;

public class TestInstrumento {

    // Método estático presentar()
    public static void presentar(Instrumentos i) {
        System.out.println("Instrumento: " + i.nombre);
        i.tocar();
    }

    public static void main(String[] args) {

        // 1. Creamos el array de Instrumento
        Instrumentos[] instrumentos ={
        new Guitarra("Guitarra eléctrica"),
        new Bateria("Batería acústica"),
        new Instrumentos("Instrumento genérico")
    };

        // 2. Recorremos el array
        for (Instrumentos i : instrumentos) {

            i.tocar();

            // Comprobamos si es una batería
            if (i instanceof Bateria b) {
                b.golpearPlatillos();
            }

            System.out.println("-------------------");
        }


        // 3. ERROR DE COMPILACIÓN
        // instrumentos[1].golpearPlatillo();

        // Da error porque instrumentos[1] es de tipo Instrumento.
        // La clase Instrumento no tiene el método golpearPlatillo().
        // Aunque sabemos que contiene una Bateria,
        // necesitamos hacer un casting para acceder al método.


        // 4. Usamos ArrayList
        ArrayList<Instrumentos> lista = new ArrayList<>();

        lista.add(new Guitarra("Guitarra clásica"));
        lista.add(new Bateria("Batería electrónica"));
        lista.add(new Instrumentos("Instrumento normal"));

        System.out.println("PRESENTACIÓN DE INSTRUMENTOS");

        for (Instrumentos i : lista) {
            presentar(i);
            System.out.println("-------------------");
        }


        // 5. Casting incorrecto
        Instrumentos instrumento = new Guitarra("Guitarra española");

        try {

            Bateria bateria = (Bateria) instrumento;

            bateria.golpearPlatillos();

        } catch (ClassCastException e) {

            System.out.println(
                    "Error: No se puede convertir una Guitarra en Bateria"
            );

        }

    }
}

