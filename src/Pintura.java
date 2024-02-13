

public class Pintura {
    public double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double calcularPintura(Forma forma) {
        double area = forma.area();
        return area / cobertura;
    }

    @Override
    public String toString() {
        return "Pintura{" +
                "cobertura: " + cobertura +
                '}';
    }
}