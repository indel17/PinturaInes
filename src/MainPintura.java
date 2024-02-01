public class MainPintura {
    public static void main(String[] args) {
        Pintura pinturita = new Pintura(250);
        Rectangulo rec = new Rectangulo(20, 35);
        Esfera esf = new Esfera(15);
        Cilindro cil = new Cilindro(10, 30);

        System.out.println("Medidas: ");
        System.out.println(esf.toString());
        System.out.println(rec.toString());
        System.out.println(cil.toString());
        System.out.println(pinturita.toString());
        System.out.println(" ");
        System.out.println("Áreas: ");
        System.out.println(rec.area());
        System.out.println(esf.area());
        System.out.println(cil.area());
        System.out.println(" ");
        System.out.println("Pintura necesaria: ");
        System.out.println(pinturita.calcularPintura(rec));
        System.out.println(pinturita.calcularPintura(esf));
        System.out.println(pinturita.calcularPintura(cil));
    }
}