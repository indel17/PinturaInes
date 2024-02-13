import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 class FormaTest {

    @Test
     void testToStringEsfera() {
        Esfera esfera = new Esfera(15);
        assertEquals("Esfera{radio: 15.0}", esfera.toString());
    }

    @Test
    void testDevolverAreaEsfera() {
        Esfera esfera = new Esfera(15);
        assertEquals(2827.4333882308138, esfera.area(), 0.001);
    }

    @Test
     void testToStringCilindro() {
        Cilindro cilindro = new Cilindro(10, 30);
        assertEquals("Cilindro{radio: 10.0, altura: 30.0}", cilindro.toString());
    }

    @Test
     void testDevolverAreaCilindro() {
        Cilindro cilindro = new Cilindro(10, 30);
        assertEquals(942.4777960769379, cilindro.area(), 0.001);
    }

    @Test
    void testToStringRectangulo() {
        Rectangulo rectangulo = new Rectangulo(20, 35);
        assertEquals("Rectángulo{longitud: 20.0, ancho: 35.0}", rectangulo.toString());
    }

    @Test
    void testDevolverAreaRectangulo() {
        Rectangulo rectangulo = new Rectangulo(20, 35);
        assertEquals(700.0, rectangulo.area());
    }

    @Test
    void testCalcularPintura() {
        Pintura pintura = new Pintura(250);
        Rectangulo rectangulo = new Rectangulo(20, 35);
        Esfera esfera = new Esfera(15);
        Cilindro cilindro = new Cilindro(10, 30);

        assertEquals(2.8, pintura.calcularPintura(rectangulo), 0.1);
        assertEquals(11.3, pintura.calcularPintura(esfera), 0.1);
        assertEquals(3.8, pintura.calcularPintura(cilindro), 0.1);
    }
}