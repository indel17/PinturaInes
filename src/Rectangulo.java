public class Rectangulo extends Forma {
    public double longitud;
    public double ancho;

    public Rectangulo(double longitud, double ancho) {
        super("Rectángulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return longitud * ancho;
    }

    @Override
    public String toString() {
        return "Rectángulo{" +
                "longitud: " + longitud +
                ", ancho: " + ancho +
                '}';
    }
}