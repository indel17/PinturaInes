public class Forma {
    public String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre: '" + nombre + '\'' +
                '}';
    }
}