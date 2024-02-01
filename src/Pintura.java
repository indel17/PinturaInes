
public class Pintura {
    public double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double calcularPintura(Forma forma) {
        return forma.area() / cobertura;
    }

    @Override
    public String toString() {
        return "Pintura{" +
                "cobertura: " + cobertura +
                '}';
    }
}