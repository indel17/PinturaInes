public class Cilindro extends Forma {
    public double radio;
    public double altura;

    public Cilindro(double radio, double altura) {
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "radio: " + radio +
                ", altura: " + altura +
                '}';
    }
}