import static org.junit.jupiter.api.Assertions.assertEquals;
public class CirculoTest {
    @org.junit.jupiter.api.Test
    void testRaio() {
        Circulo circulo = new Circulo(4.567f);
        assertEquals(4.567f, circulo.getRaio());

        float raio = (float) Math.random();
        circulo.setRaio(raio);
        assertEquals(raio, circulo.getRaio());
    }

    @org.junit.jupiter.api.Test
    void testArea() {
        Circulo circulo = new Circulo(4.567f);

        assertEquals(131.0513, circulo.getArea(), 0.0001);

        circulo.setRaio(7f);
        assertEquals(307.8758, circulo.getArea(), 0.0001);
    }

    @org.junit.jupiter.api.Test
    void testCircunferencia() {
        Circulo circulo = new Circulo(4.567f);

        assertEquals(28.6952f, circulo.getCircunferencia(), 0.0001);

        circulo.setRaio(7f);
        assertEquals(43.9822, circulo.getCircunferencia(), 0.0001);
    }
}
