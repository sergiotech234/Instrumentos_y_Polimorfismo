public class Instrumentos {
    protected String nombre;

    public Instrumentos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void tocar(){
        System.out.println(nombre + " está sonando.");
    }
}
