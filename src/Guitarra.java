public class Guitarra extends Instrumentos{

    public Guitarra(String nombre) {
        super(nombre);
    }

    @Override
    public void tocar() {
        System.out.println(nombre + ": Suena la guitarra.");
    }
}
