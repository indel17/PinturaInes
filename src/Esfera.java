public class Esfera extends Forma {
    public double radio;

    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "radio: " + radio +
                '}';
    }
}