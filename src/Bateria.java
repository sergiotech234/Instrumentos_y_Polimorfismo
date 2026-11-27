public class Bateria extends Instrumentos{
    public Bateria(String nombre) {
        super(nombre);
    }

    @Override
    public void tocar() {
        System.out.println(nombre + ": Suena la batería.");
    }

    public void golpearPlatillos() {
        System.out.println("¡Crash! Se golpea el platillo.");
    }
}
